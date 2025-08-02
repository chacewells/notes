| Resource                                       | Why it’s useful                                                                       |
| ---------------------------------------------- | ------------------------------------------------------------------------------------- |
| **MDN “Web Components” overview**              | Canonical docs for Custom Elements, Shadow DOM, templates, slots. ([MDN Web Docs][1]) |
| **web.dev “Custom Elements v1”**               | Hands-on tutorial building a component step-by-step. ([web.dev][2])                   |
| **MDN “Using Custom Elements” (2025 update)**  | Fresh examples including attribute observation & lifecycles. ([MDN Web Docs][3])      |
| **web.dev “Template, Slot & Shadow”**          | Deep dive into templating and composition patterns. ([web.dev][4])                    |
| **Open Web Components (open-wc.org) guides**   | CLI scaffolds, buildless setups, testing helpers. ([Open Web Components][5])          |
| **CoderPad “Web Components 101”**              | Quick intro for vanilla-JS developers. ([CoderPad][6])                                |
| **SitePoint “Build a framework-less web app”** | End-to-end example app using only standards. ([SitePoint][7])                         |

[1]: https://developer.mozilla.org/en-US/docs/Web/API/Web_components?utm_source=chatgpt.com "Web Components - Web APIs | MDN - MDN Web Docs"
[2]: https://web.dev/articles/custom-elements-v1?utm_source=chatgpt.com "Custom Elements v1 - Reusable Web Components - web.dev"
[3]: https://developer.mozilla.org/en-US/docs/Web/API/Web_components/Using_custom_elements?utm_source=chatgpt.com "Using custom elements - Web APIs | MDN - MDN Web Docs"
[4]: https://web.dev/learn/html/template/?utm_source=chatgpt.com "Template, slot, and shadow - web.dev"
[5]: https://open-wc.org/docs/?utm_source=chatgpt.com "Documentation: Open Web Components"
[6]: https://coderpad.io/blog/development/intro-to-web-components-vanilla-js/?utm_source=chatgpt.com "Web Components 101: Vanilla JavaScript - CoderPad"
[7]: https://www.sitepoint.com/build-frameworkless-web-app-modern-javascript-web-components/?utm_source=chatgpt.com "Build a Web App with Modern JavaScript and Web Components"

# Industry best practices for Web Components
| Challenge                                                        | What teams do in practice                                                                                                                                                                                           | Typical tooling                                                                                                             |
| ---------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| **Rare browsers that lack the APIs**                             | *Feature-detect* and load polyfills **only when needed** so the 93 % modern users stay bloat-free.                                                                                                                  | `@webcomponents/webcomponents-bundle`, `ungap/custom-elements` (\~2 KB) ([GitHub][1], [GitHub][2])                          |
| **Shipping two syntax levels (ES2015+ vs ES5)**                  | **Differential loading**: serve a modern bundle via `<script type="module">` and an ES5 fallback behind `nomodule`. Modern browsers ignore the fallback; legacy browsers ignore the module.                         | Module/nomodule pattern, adopted by Angular/Next/CRA build pipelines. ([Stack Overflow][3], [sharenschool.blogspot.com][4]) |
| **Polyfill payload still too large if you include *everything*** | Use **polyfills-loader** (or the Rollup/Webpack plugins from *open-wc*) to autogenerate a tiny bootstrap that tests for each missing feature, then streams only the micro-polyfills required for that client.       | `@web/polyfills-loader` or `@open-wc/rollup-plugin-polyfills-loader` ([npm][5], [Open Web Components][6])                   |
| **Framework-level helpers without framework bloat**              | Adopt **micro-libraries that compile to standards**—e.g. **Lit 4** or **Stencil**. They ship <10 KB runtime, and their extra polyfill shim (`lit/polyfill-support.js`) is opt-in so only legacy users pay the cost. | Lit upgrade notes emphasise the optional shim. ([lit.dev][7])                                                               |
| **Users with JS disabled / extremely slow connections**          | **Progressive enhancement / SSR + hydrate-when-ready**. Ship ordinary HTML so content paints immediately; Web Components “upgrade” later. Lit, enhance-islands, and Astro follow this model.                        | Lit SSR uses Declarative Shadow DOM where supported and a lightweight hydration polyfill where not. ([lit.dev][8])          |
| **Keeping the support matrix honest over time**                  | Automate **Browserslist** in CI so you transpile/polyfill only for the browsers you actually support, and drop IE when your analytics say usage ≈ 0.                                                                | Browserslist + Can I Use data feeds. ([Can I Use][9])                                                                       |

[1]: https://github.com/webcomponents/polyfills?utm_source=chatgpt.com "GitHub - webcomponents/polyfills: Web Components Polyfills"
[2]: https://github.com/ungap/custom-elements?utm_source=chatgpt.com "Custom Elements Polyfill - GitHub"
[3]: https://stackoverflow.com/questions/56823415/prevent-esmodules-from-being-deferred-when-imported-with-script-tag?utm_source=chatgpt.com "Prevent ESModules from being deferred when imported with script tag"
[4]: https://sharenschool.blogspot.com/2025/05/what-is-differential-loading-in-angular.html?utm_source=chatgpt.com "What is differential loading in Angular? - sharenschool.blogspot.com"
[5]: https://www.npmjs.com/package/polyfills-loader?utm_source=chatgpt.com "Polyfills loader - npm"
[6]: https://open-wc.org/docs/building/rollup/?utm_source=chatgpt.com "Building: Rollup - Open Web Components"
[7]: https://lit.dev/docs/v2/releases/upgrade/?utm_source=chatgpt.com "Upgrade guide – Lit"
[8]: https://lit.dev/docs/ssr/client-usage/?utm_source=chatgpt.com "Lit SSR client usage – Lit"
[9]: https://caniuse.com/?search=web+components&utm_source=chatgpt.com "\"web components\" | Can I use... Support tables for HTML5, CSS3, etc"
