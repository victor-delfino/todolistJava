TodoList API
A TodoList API é uma aplicação desenvolvida em Java com Spring Boot que permite aos usuários gerenciar suas tarefas (todos). Esta API fornece endpoints RESTful para criar, ler, atualizar e excluir tarefas, além de recursos adicionais para listar todas as tarefas e filtrá-las por diferentes critérios.

Funcionalidades

Criação de novas tarefas (todos)

Listagem de todas as tarefas

Atualização de tarefas existentes

Exclusão de tarefas

Filtragem de tarefas por prioridade, status de realização, etc.

Tecnologias Utilizadas

Java

Spring Boot

Spring Data JPA

MySQL

Springdoc OpenAPI (para geração de documentação automática da API)

JUnit (para testes unitários e de integração)

Postman (para testes manuais da API)

Como Executar o Projeto

Requisitos

Java JDK 8 ou superior

Maven

MySQL Server


Passos
Clone este repositório para o seu ambiente local:

git clone https://github.com/seu-usuario/todo-list-api.git

Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ, etc.) como um projeto Maven.

Configure as propriedades do banco de dados no arquivo application.properties localizado em src/main/resources. Certifique-se de fornecer as credenciais corretas para o seu banco de dados MySQL.

spring.datasource.url=jdbc:mysql://localhost:3306/todolist

spring.datasource.username=root

spring.datasource.password=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Execute a aplicação Spring Boot. A aplicação estará disponível em http://localhost:8080.

Utilize o Postman ou qualquer outro cliente REST para interagir com a API. Consulte a documentação da API gerada automaticamente em http://localhost:8080/swagger-ui.html para obter detalhes sobre os endpoints e como usá-los.

