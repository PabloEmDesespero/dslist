# DSList - Sistema de Gerenciamento de Listas de Jogos

DSList é uma aplicação Spring Boot que gerencia listas de jogos. Ela fornece funcionalidades para criar, ler, atualizar e deletar jogos e listas de jogos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Banco de dados H2 (para desenvolvimento)
- PostgreSQL (para produção)
- Maven


## Estrutura do Projeto

O projeto segue uma estrutura padrão do Spring Boot:
dslist/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── devsuperior/
│   │   │           └── dslist/
│   │   │               ├── controllers/
│   │   │               ├── dto/
│   │   │               ├── entities/
│   │   │               ├── projections/
│   │   │               ├── repositories/
│   │   │               └── services/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── import.sql
│   └── test/
│       └── java/
│           └── com/
│               └── devsuperior/
│                   └── dslist/
├── pom.xml
├── mvnw
└── mvnw.cmd
