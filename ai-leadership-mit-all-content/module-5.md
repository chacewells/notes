# Module 5

## 1. Understanding Internet of Things
   The Internet of Things (IoT) is a network of interconnected devices embedded with sensors, software, and communication technologies that enable them to collect and exchange data (Rana et al., 2021). These technologies allow us to collect data from almost anything, at any time, and in any context; this is all made possible by the widespread availability of low-cost communication, improved sensors, and microcomputers. The goal is to gather and transmit data seamlessly. This can happen at the edge, where computing power is located directly with the sensor to make immediate decisions, or in the cloud, where data is sent for processing on remote servers.

**Edge**: Computing that takes place close to the data source, allowing for real-time processing and immediate decision-making without relying on a centralized system.

**Cloud**: Remote servers that store, process, and analyze data at scale, providing deeper insights and long-term analytics that may not be possible at the edge.
At its foundation, the Internet of Things (IoT) is an evolution of instrumentation—one that incorporates advanced capabilities such as networking, local processing, and intelligent decision-making. An IoT system fundamentally involves acquiring data, optionally pre-processing it, communicating it efficiently, extracting useful insights, and ultimately acting upon those insights to influence the environment.

Sensors serve as the fundamental sensory inputs—the “eyes,” “ears,” “smell,” and “touch”—of any IoT system, detecting critical environmental parameters such as temperature, pressure, motion, and chemical composition (Rana et al., 2021). Robust communication networks then enable the seamless transmission of this data from the edge to centralized or distributed processing centers. There, advanced analytics techniques, including machine learning and signal processing, transform raw data into actionable insights (Wang et al., 2023).

These insights drive control mechanisms that allow IoT systems to make real-time or near-real-time adjustments, optimizing operations, enhancing performance, and counteracting disturbances across multiple time scales. In dynamic environments such as industrial production or smart infrastructure, these automated feedback loops play a critical role in ensuring resilience, efficiency, and adaptability.

Important
An IoT solution involves a complex design space—it is a system design challenge rather than the application of a single technology. Effective IoT systems integrate multiple technologies across sensing, communication, data processing, and control. The following case studies will illustrate how these elements come together in practice.

The current IoT landscape is characterized by rapid innovation and expanding adoption across a wide range of industries (Rana et al., 2021). Manufacturing plants, healthcare facilities, smart cities, and logistics networks are increasingly leveraging IoT technologies to enhance operational efficiency, enable predictive maintenance, and improve decision-making (Rana et al., 2021; Bianchini et al., 2024). However, the approaches to implementation—and the associated challenges and successes—are as diverse as the organizations deploying the technology.

In a previous module, we introduced the data-to-decision loop. IoT fuels the data-to-decision process by creating a continuous feedback loop between physical and digital systems. Once data is collected, it progresses through layers of processing, from initial filtering at the edge to advanced analysis in the cloud. This enables adaptive responses—whether adjusting machine settings in a factory, optimizing energy use in a smart grid, or alerting medical staff to a patient’s condition. By ensuring that decisions are informed by real-time and historical data, IoT enhances efficiency, automation, and predictive capabilities across industries.

Definition and Evolution
At its simplest, IoT is about instrumentation and measurement, capturing signals from the physical world and converting it into digital data that can be processed, analyzed, and acted upon. This fundamental definition lays the groundwork for understanding how IoT systems evolve from mere data collection tools into sophisticated, real-time decision-making platforms.

Historically, the journey to today’s IoT began with isolated measurement systems that were limited by manual data capture and rudimentary control mechanisms. Early industrial environments relied on basic sensors and analog instruments to monitor processes (Rana et al., 2021). These systems provided valuable insights but were often constrained by their inability to rapidly process or share data across large networks. Over the decades, rapid advancements in sensor technology, miniaturization, and digital communications dramatically transformed this landscape. Sensors became smaller, more affordable, and more capable, allowing for continuous monitoring of variables like temperature, pressure, and motion with far greater precision (Wang et al., 2023).

This evolution was further accelerated by breakthroughs in wireless communication protocols—such as Wi-Fi, Bluetooth, and later, low-power wide-area networks like LoRa—which enabled devices to connect and transmit data over vast distances. As connectivity improved, so did the ability to aggregate and analyze data in real time (Zhang et al., 2024). The shift from standalone, localized systems to interconnected networks marked the birth of the “data-to-decision” paradigm that now defines modern IoT architectures. These advancements have not only enabled real-time feedback control in manufacturing and healthcare but have also paved the way for innovations that merge physical processes with digital intelligence (Rana et al., 2021).

The historical evolution of IoT is a narrative of technological convergence—where advances in sensor technology, communication networks, and analytics have collectively redefined how data drives decision-making. Today’s IoT systems are a significant evolution from their predecessors, representing a dynamic integration of hardware and software that continuously adapts to and informs the physical world (Wang et al., 2023). Understanding the historical trajectory is helpful for appreciating not only what IoT is, but why it has become a central pillar of modern digital transformation strategies.

Important
One of the most compelling trends shaping IoT today is the rise of edge computing—where computation is integrated close to the sensor and data source (Rana et al., 2021; Wang et al., 2023), complemented by cloud computing for analyzing longer-term trends across multiple edge devices. By bringing data processing closer to the point of collection, edge computing addresses latency challenges, enabling real-time analytics and immediate decision-making while reducing reliance on distant cloud servers. As edge devices grow increasingly powerful, they can support more sophisticated algorithms, paving the way for smarter, more responsive IoT applications. Moreover, advancements in wireless communications continue to expand the reach and reliability of IoT networks, making it feasible to deploy these systems in even the most challenging environments (Eskue, 2023; Wang et al., 2024).

Forum: Computing at the Edge
Analyzing data directly at the source can reduce the need for complicated communications networks and latency. Is edge computing common in your field? Share your insights in this forum and compare the state of edge computing across fields.

Go to the online platform to complete the forum.

## 2. Digital Twins and the Digital Thread
The concept of a digital twin has emerged as a critical enabler of data-driven decision-making in modern industries (Cline, 2017; Wang et al., 2023; Zhang et al., 2024). The term digital twin was popularized by General Electric (GE), which initially defined a digital twin as a model, emulation, or digital simulation and predictor of a functioning turbine. In this framework, real-time data from the physical turbine continuously updates the digital model, enabling predictive simulations and allowing the digital twin to operate in parallel with its physical counterpart.

Today, these emulations are being applied in a variety of fields. These models of real-world objects, processes, or systems are not exact replicas but are designed to provide actionable insights that help predict future states and influence the behavior of their physical counterparts. At its core, a digital twin functions as a live computational model (Zhang et al., 2024), capturing detailed information about the behavior, performance, and status of its physical counterpart (Minerva et al., 2020). Real-time data streams feed into these models, enabling predictive capabilities that operate across multiple timescales—from microseconds for control systems to years for long-term planning and lifecycle management. Digital twins can represent a wide range of entities, including individual machines, production processes, people, factories, supply chains, and even entire cities.

Digital twins are defined by several distinguishing characteristics.

First, they rely on a continuous data flow, ensuring that the model remains an accurate and up-to-date reflection of reality (Wang et al., 2023; Zhang et al., 2024).

Next
Important
A digital twin differs from a traditional model in that it is continuously updated with real-world data. Traditional models can predict outcomes based on static inputs and fixed assumptions. However, a digital twin dynamically evolves itself with live data, refining its accuracy and predictive capabilities over time. The goal is to have a digital representation that mirrors the physical system as closely as possible, enabling better predictions about performance, maintenance needs, and operational behavior.

In supply chain management, track and trace refers to the ability to monitor the location and status of materials, products, or personnel throughout their lifecycle. By employing IoT technologies such as GPS and RFID, businesses can enhance visibility, improve efficiency, and ensure reliability in logistics and operations. This real-time monitoring helps optimize inventory management, reduce delays, and maintain quality control across the supply chain.

The digital thread is a related concept. It refers to the flow of data accompanying physical assets throughout their lifecycle—from design and manufacturing to maintenance and operation. If an issue arises in the field, the digital thread allows us to trace it back to its origin, whether it was a fabrication error or a problem with raw materials. Though complex, this vision is becoming increasingly feasible.

Checking the delivery status of a package provides a glimpse of track and trace.

Bridging the Physical and Digital
IoT, i.e., applied instrumentation, is not a new concept. The advancements in low-cost sensors, improved connectivity, and better computing capabilities have made it more accessible. However, technology alone is not enough—domain expertise is essential for successful implementation. The world still operates through physical systems involving people, machines, and materials; IoT technologies provide new ways to collect and analyze data to improve decision-making.

A critical aspect of both IoT and digital twin development is a deep understanding of the physical system and the nature of the available data. Meaningful data collection and the creation of effective models require strong contextual knowledge of how systems operate. The most effective approaches often combine physics-based understanding with data-driven methods, resulting in what are known as gray-box models—integrations where traditional physics-based models and machine learning techniques work together to enhance predictive power.

Knowing what data to collect and what a useful model should predict are key considerations that underpin successful IoT and digital twin strategies.

Collecting the Wrong Data
Developing the Wrong Model
Current Landscape
IoT is generating significant interest because of its potential to improve quality, reduce variability, increase speed, and lower costs. This interest is further supported by the decreasing costs of data acquisition, communication, and processing technologies, as well as the development of standards that simplify implementation and encourage broader adoption. However, realizing the full promise of IoT is not automatic. When considering IoT, digital twins, and models, it is important to recognize that these systems are inherently complex. They involve physical components such as processes, machines, and operations that are domain specific—whether in healthcare, finance, or another area.

A deep understanding of the particular domain, including its constraints and the types of data that can be collected, is essential for success. This contextual knowledge is crucial for making informed decisions about how to collect relevant data and apply algorithms to extract actionable insights. The most effective use of IoT technologies demands a dual approach: blending domain expertise with IoT expertise. These complementary capabilities can be thought of as a "bilingual" skill set—fluency in both domain-specific understanding and data-driven methodologies—which is crucial for designing, deploying, and operating IoT systems.

Outlining Applications
When we examine any system or machine, we must first understand its physical context—its principles of operation. The term "physics" here refers not just to the physical components of the system but to the broader context in which the system operates, including human factors, materials, and organizational decision-making processes. Once we understand this, we can ask: Where is the data coming from, and does the data we have align with our physical intuition about how the system should behave?

Once data is collected and a contextual understanding is established, we can begin to model the current state of a system and move to predict future outcomes. Digital twins are particularly valuable in this regard, as they use real-time data to make predictions that can inform decision-making. By forecasting future events, digital twins enable proactive adjustments. If predictions begin to diverge from actual outcomes—or if there is a need to improve the accuracy of future forecasts—it may be necessary to design additional experiments, collect more targeted data, or deploy additional sensors to refine the twin.

Types of Digital Twins
Digital twins can exist along a spectrum from white-box (models based only on physics-based equations) models to black-box (models only learned from data) models, with gray-box models representing the middle ground.

White box

Black box

The most promising approach, and the one that is often the most practical in real-world applications, is the gray-box model. This approach blends physical knowledge—whether through full understanding of the system’s physics or through intuition—with data-driven insights. This hybrid method is often the most effective approach for industrial applications, as it provides a balance between accuracy, interpretability, and adaptability. The gray-box model, sitting between the white-box and black-box approaches, effectively bridges the physical and digital worlds.

To illustrate these different types of models, we can consider several examples: a finite element model for simulating the behavior of a turbine, a mass-spring-damper system for modeling oscillatory motion, and a neural network for capturing complex, data-driven patterns. All of these are valid modeling approaches, depending on the context and the available data.

Finite Element Model
Mass-Spring-Damper System
Neural Network
Applications and Industry Use Cases
The adoption of digital twins spans multiple industries, each utilizing the technology in unique ways to optimize operations, improve predictive capabilities, and enhance decision-making. Digital twins are particularly valuable for applications requiring real-time data synchronization, predictive maintenance, and operational efficiency. Across sectors like manufacturing, healthcare, smart cities, and aerospace, digital twins are being used to model, analyze, and improve both physical assets and organizational workflows.

Manufacturing and Industrial Operations
One critical application of digital twins is process control through real-time feedback. Digital twins in manufacturing help detect variations in materials, machines, and environmental conditions, adjusting processes dynamically. These systems leverage statistical process control and real-time trend analysis to ensure consistent product quality. By implementing IoT-enabled twins, manufacturers can minimize waste, optimize energy consumption, and reduce unplanned downtime. (Bianchini et al., 2024; Rana et al., 2021)

Healthcare and Medical Devices
In healthcare, digital twins are transforming both patient monitoring and hospital operations. One compelling example is the Vitals Kiosk, a non-contact monitoring system designed for real-time health screening (Anthony, 2025). These kiosks collect multi-modal sensor data, such as heart rate, respiration rate, temperature, and pulse oximetry, using radar, cameras, and other embedded sensors. By integrating digital twins into public health infrastructure, hospitals can monitor population health trends, detect early signs of illness, and optimize medical resource allocation.

Beyond public health monitoring, digital twins are also used for personalized medicine. Patient-specific models enable doctors to simulate treatment scenarios, predict disease progression, and optimize surgical outcomes (Minerva, 2020). In cardiology, for example, digital twins of a patient's heart can model how different medications or procedures may impact heart function, facilitating tailored treatment plans.

Smart Cities and Infrastructure
The deployment of digital twins in urban planning and infrastructure is revolutionizing how cities optimize resources, manage traffic, and enhance sustainability (Minerva, 2020; Wang et al., 2024). Smart city initiatives use real-time models of road networks, energy grids, and public transportation systems to improve efficiency. A digital twin of a city’s transportation network can ingest real-time GPS data, weather conditions, and commuter behaviors to dynamically adjust traffic signals, optimize bus routes, and reduce congestion.

Building management is another key area of adoption (Minerva, 2020). Smart buildings use digital twins to monitor and control heating, ventilation, and air conditioning systems. These models help reduce energy consumption by predicting demand fluctuations and adjusting operational parameters accordingly. Additionally, predictive maintenance for large infrastructure, such as bridges and tunnels, is enhanced by digital twins that monitor structural integrity through embedded IoT sensors, ensuring early detection of potential failures.

Aerospace and Automotive Industries
In aerospace, digital twins are essential for real-time aircraft engine monitoring and predictive maintenance (Anthony, 2025). Companies such as GE and Rolls-Royce use digital twins to track jet engine performance, analyze wear and tear, and predict maintenance needs before failures occur. These models allow airlines to schedule repairs proactively, reducing costly flight delays and improving passenger safety.

Similarly, in the automotive sector, digital twins are being used to develop and test autonomous vehicle algorithms (Minerva, 2020). Simulated driving environments allow companies to train AI-driven systems before deploying vehicles on real roads. These models help refine self-driving behaviors, optimize battery performance, and simulate accident scenarios, ensuring the robustness of autonomous technologies before mass adoption.

Conclusion
Digital twins are impacting industries that rely on real-time monitoring, predictive analytics, and operational optimization. From manufacturing and healthcare to smart cities and aerospace, these models help organizations reduce downtime, enhance decision-making, and improve overall system performance. While digital twins provide valuable predictive insights, their success depends on reliable IoT data, proper integration with enterprise systems, and strategic leadership.

## 3. Manufacturing Use Cases
Now, we will examine two examples of IoT and digital twin applications in industrial decision-making. Together, they demonstrate the necessity of combining data science with physical intuition and domain expertise to build reliable predictive models. As digital twins continue to evolve, they will play an increasingly critical role in optimizing manufacturing processes, reducing waste, and enhancing product reliability.

Example 1: Twinning Bottle Packaging Machines
First, we will explore the application of real-time data collection and predictive modeling in industrial manufacturing, focusing on a packaging machine used for wrapping bottles. This machine automates the process of wrapping bottles moving along a conveyor system and producing packaged sets, such as 6-packs or 18-packs of bottles.

As bottles move along the conveyor system, sensors track their speed and position in real time. The machine uses this data to coordinate several operations: adjusting bottle placement, positioning the plastic wrap, wrapping it around the bottles, cutting the wrap, heat-sealing, and ultimately producing the final packaged product.

The central question in this case was whether it is possible to develop a digital twin of this system to predict machine health based on the collected control-system data. One aspect of the target machine health was the condition of the cutting blade. A question was posed: Can we predict when the blade that cuts the plastic wrap will become too dull and require replacement?

Note that by basing predictions on “collected data,” any prediction must be made without adding extra sensors, relying only on the analysis of high-speed data collected over an extended period. The sensor data included information such as torque, velocity, and position over time with one package involving approximately 8 milliseconds of data collection. Additionally, the system generates histograms of these time traces, offering valuable insights into operational trends across thousands of packages.

There was extensive real-time data available—several kilobytes per package across thousands of production cycles—providing a rich dataset for model development. However, one of the critical challenges was that the cutting blade is enclosed within a mechanical housing, making direct visual inspection impossible. Therefore, blade degradation had to be inferred indirectly through changes in machine behavior. Instead of incorporating additional sensors or cameras, it was necessary to rely on maintenance logs, which recorded the dates when the blade was last replaced. These logs enabled a process of approximating the blade’s wear based on its age.

Applying Physical Intuition
As stated above, successful integration of IoT and digital twins for decision-making processes requires a bilingual approach. To assess overall machine health, and the condition of the cutting blade in particular, both data science capabilities and domain expertise were required.

Understanding the system at a physical level was essential. In the case of the cutting blade, domain expertise provided critical intuition: the condition of the blade—specifically, its wear over time—would likely be reflected in the control system data. Consider the analogy of using a sharp versus a dull pair of scissors. A dull pair requires more force or higher speed to cut the same material compared to a sharp pair. Similarly, in the machine data, changes in torque, velocity, or other signals could reveal the blade’s degradation.

This physical intuition gave confidence that meaningful patterns related to blade wear would be embedded in the collected data. It also established the expectation that a predictive model could be developed to approximate the blade’s age and anticipate when maintenance or replacement would be required.

The data engineering required to integrate information from multiple sources—such as production records, control system outputs, and maintenance logs—was a complex task. These data streams varied in format, resolution, and origin, often involving different systems, users, and levels of granularity. However, once the integration was successfully completed, a decision tree model was trained using inputs such as speed, torque, and position to predict the blade’s age. The accuracy of the model was evaluated by comparing its predictions with the recorded blade ages for data that was not used in the training. If the predictions closely aligned with the observed data, the model could be useful.

Decision Trees
Although the model was not highly accurate at predicting blade wear for individual packages, its strength lay in identifying long-term trends. Because each package yielded variable predictions (e.g., 2 months, 3 months, 4 months), decisions could not be based on any single data point. Instead, the model’s output was treated as a noisy sensor—a signal that, while imprecise at the per package level, revealed meaningful patterns when aggregated over many packages.

To extract these patterns, filtering techniques were applied to smooth out per-package variability and generate a more stable estimate of blade wear over time. By averaging predictions across hundreds of packages, the system provided a reliable basis for proactive maintenance decisions. This approach enabled better planning, optimized machine performance, and reduced the likelihood of unexpected failures.

Operational Impacts
The implementation of this IoT-based virtual wear sensor led to several key operational improvements:

Reduction in unplanned downtime

Cost savings through targeted maintenance

Enhanced decision-making for operational leaders
Challenges and Considerations
Despite these benefits, deploying an IoT-based wear sensor is not without its challenges:

Data integration complexity

Sensor calibration and accuracy

Model interpretability and trust

By addressing these challenges, the company was able to establish a robust predictive maintenance system that balanced real-time IoT monitoring with long-term trend analysis.

This case study illustrates how IoT can drive operational improvements. By using sensor data and machine learning, the packaging machine example demonstrates the power of real-time monitoring and predictive maintenance. While individual data points may be noisy, trends extracted over time provide valuable insights, allowing companies to transition from reactive maintenance to proactive, condition-based strategies.

For leaders, this case highlights the importance of asking the right questions when implementing IoT solutions:

What can the data we already collect tell us about our machines or other assets?
What level of accuracy is needed for decision-making?
How can IoT insights be integrated with existing operational workflows?
By understanding these foundational concepts, leaders can make informed decisions about IoT adoption, system reliability, and long-term value generation, ensuring that technology investments align with business objectives.

Example 2: Twinning Variable Compression Rate Engines
An automotive manufacturer was developing a variable compression rate engine, which is mechanically complex and presents significant challenges in assembly. During the pilot production run, the manufacturer encountered a high failure rate among the engines. To prevent defective engines from reaching customers, the company implemented comprehensive testing for each individual unit.

The functional testing process included the following procedures:

Accelerometer

Compressor

Lever arm

While these tests were necessary due to the high failure rate, they were also labor-intensive and costly. The manufacturer then posed a critical question: Could they develop a predictive model—a digital twin—that would enable them to assess engine quality based on assembly data, rather than conducting exhaustive testing on every unit? If successful, this approach could reduce the need for comprehensive functional testing, potentially limiting it to every tenth or twentieth engine—or even eliminating it altogether.

An initial model built on a neural network showed promise. The team created a robust digital twin model capable of predicting engine performance, but they were not yet confident enough to rely solely on the model. Since the model was still undergoing validation, they continued to test every engine while refining the twin. This iterative approach allowed for continuous improvement of both the model and the manufacturing process.

To explain the underlying principles of the neural network used in this process, we can draw a simple analogy to line fitting.

Suppose we have a set of data points (represented as blue dots), and we wish to fit a line to describe the relationship.

Next
Neural networks function on a similar principle but are more complex. Instead of fitting a simple line, we construct a multi-layered structure where inputs are weighted, passed through activation functions, and propagated forward. Learning within a neural network involves optimizing the weights and biases, akin to fitting a line, but on a much larger scale. Given the vast amounts of data typically involved, optimization algorithms are employed rather than direct analytical solutions.

A variable compression rate engine is significantly more intricate than a conventional internal combustion engine, containing numerous moving parts that require precise assembly. The manufacturing process involves several steps in which components are bolted, measured, and transported through the production line. Once assembled, the engine undergoes functional testing.

The challenge in this case was relating assembly data—such as component dimensions and torque measurements from instrumented torque guns—to the results of functional testing. By training a neural network on historical data, the team developed a model capable of predicting the outcomes of functional tests based on the assembly inputs.

The critical element in this process was trust. As the team was still building confidence in the model, they continued to perform functional tests on each engine and compared the predictions made by the model with the actual test results. This feedback loop allowed for ongoing refinement of the model. Over time, they observed that while all engines met the quality threshold, some engines performed exceptionally well. This insight enabled them to identify high-performing engines and gain a better understanding of process variations.

This case demonstrates how a relatively simple modeling tool—a neural network—can be used to create a digital twin that evolves over time. By leveraging IoT data and machine learning, the manufacturer was able to improve quality prediction, reduce reliance on exhaustive testing, and optimize their manufacturing process.

Assignment: Evaluating Real-Time Data for Business Insights
In this assignment, you will analyze how real-time data from connected devices could enhance decision-making or problem-solving within a specific department or business unit in your organization. You will assess current data practices, identify valuable new data sources, and evaluate the technical and operational challenges involved in implementing real-time data integration.


## 4. Planning Integration
A key question is: how does one begin integrating IoT and digital twins? As previously discussed, this process is complex and requires engaging the entire organization. It remains crucial to assess current practices, collaborate with knowledgeable technology partners, and analyze how data flows from its initial to final stages. Additionally, organizations must consider data security and develop a strategy that emphasizes gradual, incremental progress. A common mistake is failing to take measured steps and neglecting proper planning for both technological implementation and the people involved.

One of the most significant challenges in deploying IoT or digital twin solutions is the lack of awareness among personnel within an organization. As discussed under leadership capabilities, ensuring engagement is essential. Another major hurdle is the limited expertise among leaders responsible for driving these transformations (technology leadership capability will be addressed in a coming module).

Furthermore, organizational structure, strategic alignment, and budget constraints play critical roles in determining success. While some of these points may have already been covered, one of the key barriers to initiation is recognizing that, in many cases, organizations are already implementing aspects of these technologies—albeit perhaps inefficiently or without utilizing the latest advancements.

The optimal approach is to build on existing practices and proceed incrementally. This allows leaders to continually orient themselves along the technological and leadership capabilities necessary for digital transformation.

Rather than creating entirely new data science or digital twin teams, organizations should focus on integrating these capabilities into existing groups already working in related areas—such as simulation, process engineering, and statistical process control. These teams are well positioned to enhance their workflows by incorporating real-time data, enabling continuous model refinement and more responsive decision-making.

It is also important to recognize that designing an IoT system from the ground up requires thoughtful system architecture. This includes selecting and integrating components across the full technology stack—such as computational infrastructure, sensors, connectivity, and location tracking—each of which must be tailored to the specific operational context and goals.

Twinning of Operations
Twinning an operation involves representing the individual components or processes of a system at an appropriate level of abstraction—capturing key characteristics such as uptime and downtime statistics, general personnel, materials, and information flows, and overall system behavior. Variability is inherent in these processes and must be accounted for when developing a digital twin of the operations of a facility.

Consider some of the following examples of possible twins and the questions that can be used to develop a digital twin.

**Manufacturing**: In a factory setting, how could the layout be optimized? Where should buffer spaces be allocated?

**Healthcare**: In a hospital setting, what is the required number of staff, beds, or imaging equipment?

**Retail**: In a retail environment, how many registers are necessary to minimize wait times?
Of course, across all these examples some common questions will arise:

Is investing in additional staff or new machinery justified?
How should data management and storage be structured?
Regardless of industry, organizations can often be conceptually simplified. A straightforward example is a production line composed of multiple sequential tasks (e.g., Task 1, Task 2, Task 3), typically requiring buffer spaces between stages. Similar abstractions can be applied to operations in other fields, even if the workflows are not strictly linear.

Of course, real-world operations introduce added complexities—tasks may need to be repeated, workflows may branch or converge, and machine or personnel availability can be affected by factors such as maintenance schedules, unexpected breakdowns, or health-related absences.

To effectively model this variability, resources such as machines, personnel, or even hospital beds can be categorized into a few fundamental operational states:

Operational vs. non-operational (machines and personnel)

Available or occupied

The probability of machines or personnel being in one state or the other can be derived by collecting data on uptime and downtime—specifically, the duration an asset remains operational before failing and the time required for repair or return to health. In manufacturing, this information is typically obtained from maintenance logs, whereas for personnel, attendance records may serve as a useful data source. While real-world conditions often involve additional complexities (such as partial operational states rather than a binary functioning or non-functioning condition), this foundational model provides a starting point.

Using this data, organizations can employ commercial tools such as Siemens Factory I/O, AnyLogic, or Plant SIM to develop simulations. While these tools offer visual representations, the digital twin itself resides in the underlying model rather than in its graphical depiction. The fundamental objective is to utilize real-world uptime and downtime data to simulate various operational scenarios, thereby enabling data-driven decisions regarding workflow optimization, redundancy planning, and resource allocation.

The core principle is that the operational status of a machine or personnel can be captured through a probabilistic model—essentially simulating a weighted coin flip. For instance, if a machine is operational 90% of the time and fails 10% of the time, this behavior can be modeled using a biased probability distribution rather than assuming an equal likelihood of functioning or failing.

By applying these probabilistic models, organizations can gain a deeper understanding of the effects of process modifications, investments, and workforce management strategies. The overarching goal is to develop a system that accounts for real-world variability, ultimately enabling organizations to optimize operations in a dynamic and effective manner.

Simulation Software for Modeling System Optimization
Simulation software tools are based on these probabilistic concepts which can be understood as a biased coin toss, albeit with additional mathematical refinements. Despite their simplicity, these models enable robust graphical visualizations, making them particularly useful for simulating operations in contexts such as logistics centers, financial institutions, and manufacturing systems. Simulation software visual representations provide an intuitive means of understanding complex system dynamics.

To illustrate this concept, consider the following scenario. While the accompanying graphic pertains to manufacturing, the underlying principles apply broadly. Suppose there are two sequential tasks, referred to here as Task 1 and Task 2. These tasks could represent operations performed by Machine 1 and Machine 2 or actions undertaken by two different individuals. Between these tasks, there exists an intermediate storage buffer.

The necessity of storage arises due to system variability. If both tasks or machines operated continuously without interruption, intermediate storage would be redundant. However, real-world systems are subject to fluctuations in processing time and unexpected downtime, making storage a crucial element in mitigating these disruptions. Work-in-process buffers help absorb variability, ensuring operational continuity even when one component of the system experiences a delay.

The figures presented in this example are derived from a basic Python simulation developed in under 20 minutes—a task that could now easily be accomplished using AI-driven tools such as ChatGPT. The plots represent a simple operational model consisting of Task 1, a buffer, and Task 2. The simulation uses a biased coin-flipping mechanism to approximate the operational status of the machines. Each machine is typically operational, indicated by blue segments on the timeline, but occasionally experiences downtime, shown as white gaps.

When Machine 1 is operational, it performs its task and places material into the intermediate buffer. When Machine 2 is operational, it pulls material from the buffer (if available) and completes its task. Over time, the simulation allows us to estimate key system characteristics, such as the average amount of work-in-progress (WIP) in the buffer and the average production rate, given the variability of the machines and the finite buffer capacity.

By analyzing this simulation, key system characteristics can be examined. For instance, there are periods when Machine 2 is inactive while Machine 1 remains operational. During these intervals, Machine 1 continues processing tasks and deposits output into the buffer. However, once the buffer reaches its maximum capacity—set at 10 units in this case—Machine 1 is forced to cease operations despite being functional.

This simulation provides several important insights. Given independent and random uptimes and downtimes for each machine and a fixed buffer size, we can determine the average number of items stored in the buffer. Furthermore, after observing the system for a sufficient duration, we can estimate the expected production rate. This enables us to answer critical operational questions, including:

What is the optimal buffer size to maintain efficient workflow?
What is the expected production output under given constraints?
How can storage and machine utilization be optimized to balance efficiency and downtime?
Rather than relying solely on complex mathematical derivations, these simulations allow for data-driven decision-making by integrating observed system behaviors. The same principles extend to more intricate models involving multiple machines, workstations, and logistical components.

A more sophisticated simulation tool is AnyLogic. Among various commercial options, AnyLogic provides a robust platform for modeling dynamic systems. One practical application of AnyLogic is modeling hospital emergency departments. The underlying structure of this model mirrors the earlier manufacturing example, consisting of sequential tasks and buffers. Here, patients arrive and undergo a series of medical procedures, with their progression influenced by resource availability, including nurses, hospital beds, and diagnostic equipment.

This simulation framework facilitates scenario analysis, allowing users to explore various operational improvements:

How would adding an additional ultrasound machine affect patient wait times?
What impact would increased staffing levels have on overall throughput or cost?
Given existing hospital layouts and resources, what is the average duration of patient stays?
The software enables both 2D and 3D visualization, providing an interactive means to assess system performance. By adjusting variables such as the number of physicians, nurses, or diagnostic tools, users can evaluate different configurations and their respective impacts on efficiency.

A similar approach can be applied to manufacturing systems, such as a solar panel production line. This model simulates workstation performance under conditions of variable uptime and downtime, offering insights into production fluctuations over time. Such simulations are invaluable not only for system design and optimization, but also for the development of digital twins.

In practice, modern simulation tools typically employ discrete event simulation (DES) rather than simpler discrete-time simulation or coin-flipping models. DES allows systems to be modeled as a sequence of events occurring over time, providing greater flexibility. However, the foundational requirements remain the same: statistical data on machine uptimes, downtimes, and task arrival rates. With these inputs, simulation software can generate actionable insights into resource allocation, system efficiency, and opportunities for improving overall operational performance.

Discrete Event Simulation
The cost depends on the tools and the approach taken. For example, organizations may not want to invest in commercial software like AnyLogic. It is possible to develop basic simulations using simple programming techniques. Even basic coding skills can enable the creation of fundamental models. The key is to start small—experiment with basic tools and models before making significant financial investments. Additionally, it takes leadership within an organization to understand the tools available, how to use them effectively, and when to scale up investments strategically.

The key benefit of digital twins is that they allow us to compare modeled outcomes with real-world data. If the simulation predicts certain trends, we can compare those predictions with actual observations and refine the model over time. This iterative approach improves accuracy and helps organizations make data-driven decisions about staffing and workload management.

That is what makes digital twins so powerful—it isn’t necessary to start with a perfect model. By continuously comparing the simulation to real-world data, you can refine your assumptions and improve accuracy over time. This feedback loop helps organizations make smarter decisions.

The idea is not to create a perfect model from the start, but rather to refine it over time. By running simulations and analyzing errors between predictions and real-world outcomes, we can iteratively improve the digital twin. This allows organizations to optimize operations, make informed decisions, and maximize efficiency.

Recommended Links
You can learn more about simulation software tools at Factory I/O, AnyLogic, or Technomatix Plant Simulation.

Skip to content
Home Menu
Previous
Next 5. Conclusion
This module not only demonstrates how IoT and digital twins transform operational decision-making through real-time data integration and predictive analytics, but also highlights the essential role of digital capabilities within the digital mastery framework. By examining case studies such as the predictive maintenance of packaging machines and the simulation of variable compression rate engines, we explored how digital tools can bridge the gap between physical systems and their digital counterparts, thereby optimizing performance and enhancing innovation.

The digital mastery framework emphasizes the development of robust digital capabilities. This module provides concrete examples of these capabilities in action—illustrating how sensor networks, machine learning, and simulation modeling empower organizations to make data-driven decisions and achieve operational excellence. Leaders who cultivate these digital capabilities are better equipped to navigate the challenges of digital transformation, ensuring that technology investments lead to sustainable competitive advantages.

Ultimately, mastering these digital capabilities is not just about implementing cutting-edge technologies, but also about developing a culture of continuous improvement and adaptive leadership. The insights and practical applications discussed in this module serve as a blueprint for integrating IoT and digital twin solutions, enabling organizations to thrive in an increasingly interconnected and data-driven landscape.

Course Project Part 5: IoT and Digital Twins in Digital Transformation
In this part of your course project, you will explore how IoT and digital twin technologies could be applied to enhance productivity, customer experience, and operational efficiency within your organization or a similar industry. You will evaluate practical use cases, potential limitations, and the leadership strategies needed to support effective implementation and data governance.

You will find all project details in the virtual campus.

