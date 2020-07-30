# Currency exchange
The code is written in romanian to follow test requirements. 

Prerequisites: Docker compose v1.xx

Rollout steps:

1) Run **docker-compose up** from src/main/resources to start local mysql server
2) Execute **create_schema.sql** to create schema
3) Start Spring Boot application from com.exchange.Application