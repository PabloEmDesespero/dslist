# DSList - Sistema de Gerenciamento de Listas de Jogos

## Descrição

DSList é uma aplicação robusta desenvolvida com Spring Boot, projetada para gerenciar listas de jogos de forma eficiente e intuitiva. Este sistema oferece uma API RESTful que permite aos usuários criar, visualizar, atualizar e deletar informações sobre jogos e listas de jogos.

### Principais Funcionalidades

1. **Gerenciamento de Jogos**: 
   - Cadastro de novos jogos com informações detalhadas (título, ano, gênero, plataformas, score, imagem, descrição curta e longa).
   - Visualização de todos os jogos cadastrados.
   - Busca de jogos por ID.
   - Atualização de informações de jogos existentes.
   - Remoção de jogos do sistema.

2. **Gerenciamento de Listas**:
   - Criação de listas temáticas de jogos (ex: "Meus favoritos", "Jogos de aventura", "Clássicos dos anos 90").
   - Visualização de todas as listas criadas.
   - Adição e remoção de jogos em listas específicas.
   - Reordenação de jogos dentro de uma lista.

3. **Consultas Personalizadas**:
   - Busca de jogos por gênero, plataforma ou faixa de ano.
   - Listagem de jogos ordenados por score.
   - Recuperação de jogos pertencentes a uma lista específica.

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas, típica de aplicações Spring Boot:

dslist/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── devsuperior/
│   │   │           └── dslist/
│   │   │               ├── controllers/    # Controladores REST
│   │   │               ├── dto/            # Objetos de Transferência de Dados
│   │   │               ├── entities/       # Entidades JPA
│   │   │               ├── projections/    # Projeções para consultas específicas
│   │   │               ├── repositories/   # Interfaces de repositório Spring Data
│   │   │               └── services/       # Lógica de negócios
│   │   └── resources/
│   │       ├── application.properties      # Configurações da aplicação
│   │       └── import.sql                  # Script SQL para dados iniciais
│   └── test/
│       └── java/                           # Testes unitários e de integração
├── pom.xml                                 # Configuração do Maven
├── mvnw
└── mvnw.cmd

## Tecnologias Utilizadas

- **Java 17**: Versão LTS mais recente do Java, oferecendo melhorias de desempenho e novos recursos.
- **Spring Boot 3.x**: Framework para criação de aplicações stand-alone baseadas em Spring.
- **Spring Data JPA**: Simplifica a camada de acesso a dados, reduzindo o boilerplate code.
- **H2 Database**: Banco de dados em memória para ambiente de desenvolvimento.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional para produção.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.

