### Using S3 LocalStack with Spring Boot and R2DBC

### What is LocalStack?
This repo gives an overview of localstack:
https://github.com/localstack/localstack


LocalStack is a fully functional cloud stack. LocalStack is a test/mocking framework for developing Cloud applications. 
It spins up a testing environment on our local machine that provides the same functionality and APIs as the real AWS cloud environment.
We can run Lambda functions, store data to DynamoDB tables, feed events through Kinesis streams, 
put our application behind an API Gateway. And all this happens on our local machine, without ever talking to the cloud.

### What is Amazon S3?
This link is useful for S3:
https://aws.amazon.com/s3/
Amazon Simple Storage Service (Amazon S3) is storage for the Internet. It is designed to make web-scale computing easier.
Amazon S3 has a simple web services interface that we can use to store and retrieve any amount of data, at any time, 
from anywhere on the web. It gives developers access to the same highly scalable, reliable, fast, and inexpensive data storage 
infrastructure that Amazon uses to run its own global network of websites. 
The service aims to maximize benefits of scale and to pass those benefits on to developers.

### What is Spring WebFlux?
This link is useful for WebFlux:
https://docs.spring.io/spring-framework/reference/
This link is useful for Project Reactor:
https://projectreactor.io/

Spring WebFlux is a web framework that’s built on top of Project Reactor, to give us asynchronous I/O, and allow our application to perform better.


### What is R2DBC?
This link is useful for R2DBC:
https://r2dbc.io/

R2DBC is the acronym for Reactive Relational Database Connectivity. 
R2DBC is an API specification initiative that declares a reactive API to be implemented by driver vendors 
to access their relational databases

### Demo Application
In order to get better acquainted with these technologies, we will develop Spring Boot WebFlux application which 
will allow us to upload/download files from/to Amazon S3 and save file metadata to the database and retrieve appropriate information.

### Prerequisites
- Install docker
  https://www.docker.com/
- Install the AWS cli for manual interactions with LocalStack
  https://aws.amazon.com/cli/

