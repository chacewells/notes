# Network Essentials

## Networking 101

OSI Model - layers to abstract components of networked computers and help us reason about communication relevant to apps

### Layers

Primarily concerned with:

- application layer - 7
  - DNS, HTTP, Websockets, WebRTC
  - abstraction fro different types of data associated with web apps
- transport layer - 4
  - TCP, QUIC, UDP - e2e comm services
  - reliable, ordering, flow control atop network layer
- network layer - 3
  - IP - routing and addressing
  - packets, packet forwarding, best-effort delivery

### TCP Handshakes

- Take for granted relatively good connectivity and delivery
- DNS - lookup IP, IP - networking hardware, routing etc. all available transparently
- request/response is simplification - packets & requests exchanged between servers add latency etc.
- connection is a state; without HTTP keep-alive or HTTP/2 multiplexing, overhead is repeated per request

### Network Layer Protocols

- TCP is ubuiquitous
- DHCP server assigns IPs at bootup
- RIR enables public internet availability

### Transport Layer Protocols

- TCP, UDP, QUIC
- QUIC like TCP but with perf optimizations

#### UDP: Fast/Unreliable

- packets include source/dest + binary data
- connectionless
- no guarantee of delivery
- no ordering
- lower latency

#### TCP: reliable/overhead

- setup & stateful connection during transmission
- cxn oriented
- reliable delivery
- flow control
- congestion control

### Application Layer Protocols

- user space (flexible, easy to change) vs. lower layers in kernel space (rigid, efficient)

#### HTTP/HTTPS

- request/response, stateless - each request independent; minimize stateful surface area
- methods: GET (idempotent, no body), POST, PUT, PATCH (partial), DELETE (idempotent)
- status codes: 2xx success, 3xx moved, 4xx client error (401, 403, 404, 429), 5xx server error (500, 502)
- headers are flexible k/v - e.g. content negotiation (`Accept-Encoding` -> `Content-Encoding: gzip`)
- HTTPS = TLS encryption in transit; still never trust request body (e.g. user ID) - validate server-side

#### REST: simple/flexible

- what: operations on resources via HTTP verbs + path conventions, usually JSON
  - `GET /users/{id}`, `PUT /users/{id}`, `POST /users`, `GET /users/{id}/posts`
  - think resources, not operations (`startGame` -> `PATCH /games {status: started}`)
  - core entities often map to resources
- when: default choice; JSON is inefficient but rarely the bottleneck

#### GraphQL: flexible data fetching

- what: client queries exactly the fields/nested objects it needs
  - solves under-fetching (many round trips) and over-fetching (bloated responses)
- when: complex clients, fast-changing frontends, many teams querying overlapping data
  - murky in interviews (fixed reqs); bring up when flexibility/uncertain reqs is the focus
  - downside: backend query execution adds latency/complexity

#### gRPC: efficient service communication

- what: RPC framework over HTTP/2 + Protocol Buffers (binary, schema'd, compact)
  - service defs compile to client/server stubs; streaming, deadlines, client-side LB
- when: internal service-to-service, perf-critical, strong typing
  - not for public APIs (no browser support, weaker tooling) - REST external, gRPC internal
  - don't prematurely optimize; REST everywhere is fine in most interviews

#### SSE: real-time server push

- what: server streams many messages over a single long HTTP response
  - `EventSource` auto-reconnects w/ last message ID; server must replay missed msgs
  - gotchas: connections get closed by proxies/LBs; some networks buffer chunks
- when: one-way server -> client notifications (e.g. live auction price)

#### WebSockets: real-time bidirectional

- what: persistent, bidirectional channel via HTTP upgrade on the TCP cxn
  - no app protocol - define your own messages (often JSON, e.g. subscribe/unsubscribe)
  - all infra in between (LBs, proxies, firewalls) must support it
- when: high-frequency, two-way comms - chat, games, live tickers
  - overkill if request/response or SSE suffices

#### WebRTC: peer-to-peer

- what: direct browser-to-browser comms, no server in the data path; only app protocol here over UDP
  - signaling server - tracks peers + their connection info
  - STUN - discover public IP/port via NAT "hole punching"
  - TURN - relay server fallback when direct cxn fails
  - setup: signaling -> STUN -> share info via signaling -> connect directly
- when: audio/video calling & conferencing
  - collab editors possible (w/ CRDTs) but usually need central server anyway -> WebSockets
  - in interviews, stick to video/audio

### Load Balancing

- share load across several servers

#### Client-side

- client decides which server to interact with
- Redis: each node keeps data and directs traffic by sharing hash info with client to go to right server
- DNS: resolver shareds rotating list of IP addresses by lookup domain

###### Where to use

- small # of clients you control (Redis)
- large # of clients, tolerate slow update (DNS)

#### Dedicated Load Balancer

- adds hop
- always receives and routes traffic
- fast updates to server list & fine-grained control over routing

#### Layer 4 Load Balancer

- route based on network info (IP addresses, ports), w/o looking at packets

##### 4 characteristics

- Maintain persistent TCP connections between client and server.
- Are fast and efficient due to minimal packet inspection.
- Cannot make routing decisions based on application data.
- Are typically used when raw performance is the priority.

##### When to use

- need persistent connections (websockets)
- high-performance w/o application-level processing

#### Layer 7 Load Balancer

- route based on app-layer request -> route to appropriate backend server

##### Characteristics

- Terminate incoming connections and create new ones to backend servers.
- Can route based on request content (URL, headers, cookies, etc.).
- More CPU-intensive due to packet inspection.
- Provide more flexibility and features.
- Better suited for HTTP-based traffic.

#### Health Checks and Fault Tolerance

- LB monitors backend health, stops routing to failed servers -> automatic failover / HA
- TCP health check - cheap, is server accepting cxns?
- L7 health check - HTTP request, expect 200 (500 or no response = unhealthy)

#### Load Balancing Algorithms

- round robin - sequential
- random
- least connections - fewest active cxns
- least response time - fastest server
- IP hash - client IP picks server (session persistence)
- when:
  - round robin/random - default for stateless apps; new servers pick up traffic automatically
  - least connections - persistent cxns (SSE, WebSockets) so one server doesn't accumulate them all

#### Real-World Implementations

- hardware - F5 BIG-IP; scales to 100s of millions req/s
- software - HAProxy, NGINX, Envoy
- cloud - AWS ELB/ALB/NLB, GCP Cloud Load Balancing, Azure Load Balancer
- scaling LBs rarely comes up in interviews; if throughput is huge, mention hardware LBs

### Common Deep Dives and Challenges

#### Regionalization and Latency

- data should be close to processing
- users should be close to their data
- nodes in same data center have latency <1ms
- nodes in New York and LA have latency >80ms
- Users are often distributed
- Consistency highly benefits from centralized data
- global data is a win, but complicates things
- need to think about **data locality** to address

##### Content Delivery Networks (CDNs)

- Distributed caching of resources, keeping content close to where it's requested from
- Great for assets, e.g. images, video, etc.
- Great for content with long life, updated infrequently

##### Regional Partitioning

- Partition data so only single region has access to it
- E.g. Uber: only users in Miami will request rides from drivers in Miami! Serve all that data close to Miami - not necessary to serve/store in NYC
- Physical hardware & network topology can mirror actual user footprint

#### Handling Failures and Fault Modes

- Network failures should be anticipated & planned for
- cable cuts, routers fail, packets dropped

##### Timeouts & retry/backoff

- expect requests to take time - implement timeout, retry with backoff strategy
- Idempotent APIs key
  - Updates should include idempotency key
  - GET requests are safe for retry
- backoff
  - subsequent backoffs should be longer, with randomness ("jitter")
  - limit # backoff attempts
- side effects - endpoints with side effects must impose an idempotency key
  - requests to same endpoint containing same key are rejected

##### Circuit Breakers

- prevent thundering herd problem
- **note:** The key for your preparation is to familiarize yourself with scenarios where one failure might create new failures: a cascade of failures. Being able to identify these patterns and how to mitigate them is a great way to stand out in an interview.
- circuit breakers - protect system when calls fail repeatedly
  1. monitors for failures when calling external services
  2. failures exceed threshold -> circuit "trips" to open state
  3. While open, requests immediately fail w/out attempting actual call
  4. After timeout, circuit transitions to "open" state
  5. test request determines whether to close circuit or keep open

###### Advantages

- fail fast
- reduce load
- self-heal
- improve user experience
- system stability

###### Where to apply

- 3rd party services
- DB cxns & queries
- s2s comms in microservices
- resource-intensive operations that might time out
- any network call that may fail or become slow
