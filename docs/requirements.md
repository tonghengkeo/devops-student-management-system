\# DevOps Student Management System (DSMS)



\## Project Overview



The DevOps Student Management System (DSMS) is a Java Spring Boot application designed to demonstrate a complete software development and DevOps lifecycle.



The project will integrate application development, version control, automated testing, continuous integration, containerization, continuous deployment, infrastructure as code, monitoring, logging, and production deployment.



\## Technology Stack



\- Java

\- Spring Boot

\- Spring Data JPA

\- Spring Security

\- MySQL

\- Maven

\- Git

\- GitHub

\- GitHub Actions

\- JUnit

\- Mockito

\- Docker

\- Docker Compose

\- Nginx

\- Terraform

\- Prometheus

\- Grafana



\## Project Objectives



The main objectives of the DevOps Student Management System are:



1\. Develop a production-oriented Student Management System using Java and Spring Boot.

2\. Store and manage application data using MySQL.

3\. Manage source code using Git and GitHub.

4\. Apply a professional Git branching strategy for development and collaboration.

5\. Implement automated unit and integration testing.

6\. Implement Continuous Integration (CI) using GitHub Actions.

7\. Containerize the Spring Boot application using Docker.

8\. Run the application and MySQL database using Docker Compose.

9\. Implement Continuous Deployment (CD) for automated application deployment.

10\. Manage infrastructure using Infrastructure as Code (IaC) with Terraform.

11\. Configure Nginx as a reverse proxy and load balancer.

12\. Monitor application health and metrics using Prometheus and Grafana.

13\. Implement application and container logging.

14\. Apply security best practices for credentials, secrets, and environment configuration.

15\. Deploy the complete application to a production environment.





\## Functional Requirements



\### FR-01 User Authentication



The system shall allow authorized users to securely access the application.



Functions:



\- User login

\- User logout

\- Password encryption

\- Role-based authorization

\- ADMIN role

\- STAFF role



\### FR-02 User Management



The system shall allow administrators to manage system users.



Functions:



\- Create user

\- View user list

\- View user details

\- Update user

\- Activate or deactivate user

\- Assign roles to users



\### FR-03 Department Management



The system shall allow authorized users to manage academic departments.



Functions:



\- Create department

\- View department list

\- View department details

\- Update department

\- Delete department

\- Search departments



\### FR-04 Program Management



The system shall allow authorized users to manage academic programs.



Functions:



\- Create program

\- View program list

\- View program details

\- Update program

\- Delete program

\- Assign program to department

\- Search programs



\### FR-05 Student Management



The system shall allow authorized users to manage student information.



Functions:



\- Register new student

\- View student list

\- View student details

\- Update student information

\- Delete student

\- Search students

\- Filter students

\- Paginate student records

\- Assign student to department

\- Assign student to program

\- Manage student status



\### FR-06 Course Management



The system shall allow authorized users to manage courses.



Functions:



\- Create course

\- View course list

\- View course details

\- Update course

\- Delete course

\- Search courses



\### FR-07 Enrollment Management



The system shall allow authorized users to manage student course enrollments.



Functions:



\- Enroll student in course

\- View enrollment list

\- View student enrollments

\- Remove enrollment

\- Prevent duplicate enrollment



\### FR-08 Dashboard



The system shall provide a dashboard containing summary information.



The dashboard shall display:



\- Total students

\- Total departments

\- Total programs

\- Total courses

\- Total enrollments



\### FR-09 REST API



The system shall expose RESTful APIs for application resources.



The API shall support:



\- HTTP GET

\- HTTP POST

\- HTTP PUT

\- HTTP DELETE

\- JSON request and response

\- Input validation

\- Standard HTTP status codes

\- Centralized exception handling



\### FR-10 API Documentation



The system shall provide interactive REST API documentation using OpenAPI/Swagger.



Authorized developers shall be able to:



\- View available API endpoints

\- View request parameters

\- View response structures

\- Test API endpoints



\### FR-11 Search and Pagination



The system shall support efficient data retrieval.



Functions:



\- Keyword search

\- Filtering

\- Pagination

\- Sorting



\### FR-12 Application Health



The system shall expose application health and operational information for monitoring.



Required endpoints will include:



\- Application health

\- Application information

\- Application metrics

\- Prometheus metrics



\## Non-Functional Requirements



\### NFR-01 Security



The system shall apply appropriate security controls.



Requirements:



\- User passwords shall not be stored as plain text.

\- Passwords shall be securely hashed.

\- Protected resources shall require authentication.

\- Access to resources shall be controlled by user roles.

\- Database credentials shall not be hard-coded in source code.

\- Application secrets shall not be committed to Git.

\- Sensitive configuration shall be provided through environment variables.

\- Production secrets shall be managed separately from source code.



\### NFR-02 Code Quality



The application shall follow maintainable software development practices.



Requirements:



\- Use a layered application architecture.

\- Separate Controller, Service, Repository, and Entity responsibilities.

\- Use meaningful class, method, and variable names.

\- Apply input validation.

\- Implement centralized exception handling.

\- Maintain readable and documented source code.



\### NFR-03 Automated Testing



The project shall include automated testing.



Requirements:



\- Unit tests shall be implemented using JUnit.

\- Dependencies shall be mockable using Mockito.

\- Service-layer business logic shall be tested.

\- Important API behavior shall be covered by integration tests.

\- Automated tests shall run as part of the CI pipeline.

\- A failed required test shall cause the CI pipeline to fail.



\### NFR-04 Continuous Integration



The project shall implement a Continuous Integration pipeline.



The CI pipeline shall:



\- Trigger automatically on defined Git events.

\- Check out source code.

\- Configure the required Java environment.

\- Build the Maven project.

\- Run automated tests.

\- Report pipeline success or failure.



\### NFR-05 Containerization



The application shall support containerized deployment.



Requirements:



\- The Spring Boot application shall have a Dockerfile.

\- A reproducible Docker image shall be buildable from source.

\- Application configuration shall be externalized where appropriate.

\- The container shall expose the required application port.

\- Container startup shall not require manual source-code modification.



\### NFR-06 Multi-Container Environment



Docker Compose shall be used to define the local integrated environment.



The environment shall include at least:



\- Spring Boot application

\- MySQL database



Later deployment stages may additionally include:



\- Nginx

\- Prometheus

\- Grafana



\### NFR-07 Continuous Deployment



The project shall include a Continuous Deployment process.



Requirements:



\- Deployment shall use a defined automated workflow.

\- Deployment configuration shall be version controlled where appropriate.

\- Application artifacts or container images shall be deployable consistently.

\- Production credentials shall not be stored directly in the repository.

\- Deployment status shall be verifiable after release.



\### NFR-08 Infrastructure as Code



Infrastructure configuration shall be managed using Terraform.



Requirements:



\- Infrastructure definitions shall be stored as code.

\- Terraform configuration shall be version controlled.

\- Environment-specific values shall be configurable.

\- Sensitive values shall not be committed to the repository.

\- Infrastructure changes shall be reviewable before application.



\### NFR-09 Reverse Proxy and Load Balancing



Nginx shall be used where appropriate as a reverse proxy.



The deployment design shall support:



\- Forwarding client requests to the Spring Boot application.

\- Centralized entry point for application traffic.

\- Load balancing across multiple application instances when scaling is demonstrated.



\### NFR-10 Monitoring



The application shall expose operational metrics for monitoring.



Requirements:



\- Spring Boot Actuator shall expose application health information.

\- Prometheus shall collect application metrics.

\- Grafana shall visualize selected metrics.

\- Application availability shall be observable.

\- Relevant application and runtime metrics shall be available for troubleshooting.



\### NFR-11 Logging



The application shall provide useful operational logs.



Requirements:



\- Application events shall be logged.

\- Errors shall be logged with sufficient diagnostic information.

\- Container logs shall be accessible.

\- Sensitive information such as passwords and secrets shall not be written to logs.



\### NFR-12 Reliability



The deployment shall support reliable application operation.



Requirements:



\- Application health shall be checkable.

\- Containers shall use appropriate restart behavior.

\- Database data shall use persistent storage in containerized environments.

\- Deployment configuration shall minimize unnecessary manual steps.



\### NFR-13 Maintainability



The project shall be organized so that future changes can be implemented safely.



Requirements:



\- Application source code shall use a clear package structure.

\- DevOps configuration shall be separated from application source where appropriate.

\- Documentation shall describe important development and deployment procedures.

\- Configuration shall be reusable across environments where practical.



\### NFR-14 Documentation



The repository shall contain sufficient documentation for another developer or reviewer to understand and run the project.



Documentation shall include:



\- Project overview

\- Requirements

\- Architecture

\- Database design

\- Git branching strategy

\- Testing procedure

\- CI/CD pipeline

\- Docker usage

\- Infrastructure as Code

\- Monitoring and logging

\- Deployment procedure

\- Final demonstration guide





\## DevOps Pipeline Requirements



\### DEVOPS-01 Local Development



Developers shall develop and test application changes in a local development environment.



Local development shall include:



\- Java development environment

\- Maven build environment

\- Local Git repository

\- Spring Boot application

\- MySQL database

\- Automated tests



Development changes shall not be committed directly to the main branch.



\### DEVOPS-02 Source Code Management



Git shall be used as the version control system.



GitHub shall be used as the remote source code repository.



The repository shall maintain:



\- Source code

\- Application configuration templates

\- Automated tests

\- CI/CD workflows

\- Docker configuration

\- Infrastructure as Code

\- Monitoring configuration

\- Project documentation



Sensitive credentials and secrets shall not be committed to the repository.



\### DEVOPS-03 Branching Strategy



The project shall use the following primary branches:



\- main

\- develop

\- feature/\*



The main branch shall represent stable production-ready code.



The develop branch shall be used to integrate completed development work.



Feature branches shall be created from develop for individual features or technical tasks.



Example:



feature/student-management



feature/security



feature/testing



feature/docker



feature/monitoring



feature/terraform



\### DEVOPS-04 Pull Request Workflow



Changes intended for shared branches shall be reviewed through a Pull Request workflow where appropriate.



The expected workflow is:



1\. Create a feature branch.

2\. Implement the required change.

3\. Commit the change.

4\. Push the feature branch to GitHub.

5\. Open a Pull Request.

6\. Execute automated CI checks.

7\. Review the change.

8\. Merge the approved change.



\### DEVOPS-05 Continuous Integration Pipeline



GitHub Actions shall be used for Continuous Integration.



The CI pipeline shall perform the following steps:



1\. Checkout source code.

2\. Set up Java.

3\. Restore or use Maven dependencies.

4\. Compile the application.

5\. Run automated tests.

6\. Package the Spring Boot application.

7\. Report build and test status.



A failed required build or test shall cause the CI workflow to fail.



\### DEVOPS-06 Docker Image Build



After the application passes the required build and test stages, the project shall support building a Docker image.



The Docker image shall contain the Spring Boot application and the runtime components required to execute it.



Docker builds shall be reproducible from repository configuration.



\### DEVOPS-07 Container Registry



Release-ready Docker images shall be publishable to a container registry.



The registry will provide versioned application images for deployment.



Image credentials shall be stored using secure CI/CD secret management rather than directly in repository files.



\### DEVOPS-08 Continuous Deployment Pipeline



The CD process shall deploy an approved application version to the target environment.



The deployment process shall support:



1\. Selecting or receiving an approved application version.

2\. Obtaining the required Docker image.

3\. Updating the deployed application.

4\. Starting or restarting required containers.

5\. Verifying application health after deployment.

6\. Reporting deployment success or failure.



\### DEVOPS-09 Infrastructure as Code



Terraform shall be used to define supported deployment infrastructure as code.



Infrastructure configuration shall be stored under:



infrastructure/terraform/



Terraform configuration shall be separated from application business logic.



\### DEVOPS-10 Production Traffic



Nginx shall provide the external entry point to the deployed application where applicable.



The request flow shall be designed as:



Client

→ Nginx

→ Spring Boot Application

→ MySQL



When demonstrating application scaling, Nginx may distribute requests across multiple Spring Boot application instances.



\### DEVOPS-11 Monitoring Pipeline



Spring Boot Actuator shall expose application health and metrics.



Prometheus shall collect supported metrics from the application.



Grafana shall visualize selected operational metrics.



The monitoring flow shall be:



Spring Boot Actuator

→ Prometheus

→ Grafana



\### DEVOPS-12 Logging



Application and container logs shall be available for operational troubleshooting.



Logs shall help identify:



\- Application startup events

\- Application errors

\- Request processing problems

\- Database connectivity problems

\- Deployment problems



Secrets and passwords shall not be written to application logs.



\### DEVOPS-13 Health Verification



The deployment process shall verify application health after deployment.



Health verification shall use an application health endpoint.



A deployment shall not be considered successfully verified until the required application health check succeeds.



\### DEVOPS-14 Target DevOps Lifecycle



The target project lifecycle shall be:



Requirements

→ Development

→ Git Feature Branch

→ Commit

→ Push

→ Pull Request

→ Continuous Integration

→ Automated Testing

→ Package

→ Docker Image

→ Container Registry

→ Continuous Deployment

→ Production

→ Monitoring

→ Logging

→ Feedback



\## Acceptance Criteria



The DevOps Student Management System shall be considered complete when the following acceptance criteria have been satisfied.



\### AC-01 Application



\- The Spring Boot application starts successfully.

\- The application connects successfully to MySQL.

\- Core application modules are operational.

\- REST API endpoints return appropriate HTTP responses.

\- Input validation is implemented.

\- Centralized exception handling is implemented.

\- Swagger/OpenAPI documentation is accessible.



\### AC-02 Student Management



\- An authorized user can create a student.

\- An authorized user can view students.

\- An authorized user can update student information.

\- An authorized user can delete a student.

\- Student records can be searched.

\- Student records support pagination and sorting.



\### AC-03 Academic Management



\- Departments can be managed.

\- Programs can be managed.

\- Courses can be managed.

\- Students can be assigned to programs.

\- Students can be enrolled in courses.

\- Duplicate enrollment is prevented.



\### AC-04 Authentication and Authorization



\- Users can authenticate securely.

\- Passwords are not stored as plain text.

\- Protected resources require authentication.

\- Role-based access control is implemented.

\- Unauthorized requests are handled appropriately.



\### AC-05 Git Repository



\- The project is stored in a Git repository.

\- The project is available through GitHub.

\- The repository contains meaningful commit history.

\- The repository demonstrates the defined branching strategy.

\- Feature development is performed using feature branches.

\- Sensitive credentials are excluded from Git history.



\### AC-06 Automated Testing



\- Unit tests are included in the repository.

\- Important service logic is covered by automated tests.

\- Required integration tests are implemented.

\- Tests can be executed using Maven.

\- Failed required tests produce a failed test result.



\### AC-07 Continuous Integration



\- A GitHub Actions CI workflow exists.

\- CI runs automatically on the configured Git events.

\- CI builds the application.

\- CI runs automated tests.

\- CI clearly reports success or failure.

\- A failing required build or test causes the workflow to fail.



\### AC-08 Docker



\- The project contains a Dockerfile.

\- The Spring Boot application can be built as a Docker image.

\- The application can run inside a Docker container.

\- Runtime configuration can be supplied without modifying source code.



\### AC-09 Docker Compose



\- Docker Compose configuration is included.

\- Spring Boot and MySQL can run together using Docker Compose.

\- MySQL data uses persistent storage.

\- Required services can communicate through the configured container network.

\- The integrated environment can be started using a documented command.



\### AC-10 Continuous Deployment



\- A documented CD process exists.

\- An approved application version can be deployed to the target environment.

\- Deployment uses secure handling of required credentials.

\- The deployed application can be health-checked.

\- Deployment success or failure can be verified.



\### AC-11 Infrastructure as Code



\- Terraform configuration exists under infrastructure/terraform/.

\- Terraform configuration is version controlled.

\- Infrastructure configuration can be validated.

\- Environment-specific values can be supplied through configuration.

\- Sensitive Terraform values are not committed to Git.



\### AC-12 Nginx and Scaling



\- Nginx configuration is included where required by the deployment architecture.

\- Nginx can forward requests to the Spring Boot application.

\- The project can demonstrate load balancing when multiple application instances are enabled.



\### AC-13 Monitoring



\- Spring Boot Actuator is enabled.

\- Application health can be checked.

\- Prometheus can collect supported application metrics.

\- Grafana can display selected application metrics.

\- Monitoring configuration is stored in the repository.



\### AC-14 Logging



\- Application logs are available.

\- Application errors are logged.

\- Container logs can be inspected.

\- Logs provide useful troubleshooting information.

\- Passwords and secrets are not intentionally written to logs.



\### AC-15 Production Deployment



\- The application is deployed to the selected production environment.

\- The production application can connect to its required database service.

\- The application can be accessed through the configured production entry point.

\- Production application health can be verified.

\- Deployment and recovery procedures are documented.



\### AC-16 Documentation



The GitHub repository contains documentation for:



\- Project requirements

\- System architecture

\- Database design

\- Git branching strategy

\- Application setup

\- Testing

\- CI pipeline

\- Docker

\- Docker Compose

\- CD

\- Terraform

\- Monitoring

\- Logging

\- Production deployment

\- Final demonstration



\### AC-17 Final DevOps Demonstration



The final project demonstration shall show the following workflow:



Developer

→ Feature Branch

→ Commit

→ Push

→ Pull Request

→ CI Build

→ Automated Tests

→ Docker Image

→ Deployment

→ Health Check

→ Monitoring

→ Logs





\## Project Scope



\### In Scope



The project includes the following application features:



\- User authentication

\- Role-based authorization

\- User management

\- Department management

\- Program management

\- Student management

\- Course management

\- Enrollment management

\- Search

\- Filtering

\- Sorting

\- Pagination

\- Dashboard summary

\- REST API

\- OpenAPI/Swagger documentation

\- Application health endpoints



The project includes the following DevOps practices and technologies:



\- Git version control

\- GitHub repository

\- Branching strategy

\- Pull Request workflow

\- Automated testing

\- Continuous Integration

\- GitHub Actions

\- Docker

\- Docker Compose

\- Container image management

\- Continuous Deployment

\- Nginx

\- Infrastructure as Code

\- Terraform

\- Spring Boot Actuator

\- Prometheus

\- Grafana

\- Application logging

\- Container logging

\- Health checks

\- Production deployment

\- Technical documentation



\### Out of Scope



The following features are not included in the current version:



\- Student payment management

\- Accounting and finance

\- Human resource management

\- Payroll management

\- Library management

\- Attendance management

\- Learning Management System

\- Online examination

\- Mobile application

\- Complex university management modules

\- Microservices architecture

\- Kubernetes orchestration



These features may be considered for future versions but are not required for the current project.



