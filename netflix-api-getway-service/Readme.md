To access ani api through api getway, use below style url.

http://localhost:8765/{application-name}/uri
ex. http://localhost:8765/currency-calculation-service/calculation/feighn/USD/to/INR/unit/100

spring cloud sleuth enables distributed tracing of a request. it assigns an id to each request, with that id you can trace the request.
just declare a Sampler bean for that