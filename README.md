# Payment-Application
- Payment application built on the principles of Microservices architecture where user can authenticate, transact money and get notification   of payment status. 
- It contains 4 services User service, Wallet service, Notification service, Transaction service. All the services communicate with each       other according to the requirements. Each service is built on MVC architecuture.
- Uses Rest APIs(controllers) to consume the resources, JPA Hibernate for communicating with data store, MySQL for persistent data store,        Redis for caching, Kafka for publishing and subscribing to events. All the APIs are secured using Spring security.
