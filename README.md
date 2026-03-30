<div align="center">
  <a href="#-versão-em-português">🇧🇷 Ler em Português</a> | <a href="#-english-version">🇺🇸 Read in English</a>
</div>

---

## 🇧🇷 Versão em Português

# API RESTful: Sistema VIP com Spring Boot e SQLite

Este projeto é uma **API RESTful** desenvolvida em **Java** utilizando o framework **Spring Boot**. O sistema expõe endpoints para gerenciamento de convidados VIP, consumindo e retornando dados no formato **JSON**, operando de forma totalmente isolada de qualquer Front-end.

# Arquitetura e Funcionalidades
* **Spring Web (Controladores):** Mapeamento de rotas HTTP (`@GetMapping`, `@PostMapping`, `@DeleteMapping`) para interceptar requisições da internet e devolver respostas padronizadas (JSON).
* **Persistência de Dados (DAO & SQLite):** Conexão direta com um banco de dados relacional (SQLite) utilizando a API JDBC do Java. O padrão DAO (Data Access Object) foi implementado para separar as regras de negócio das queries SQL.
* **Ciclo CRUD:**
  * `POST /vips`: Recebe um payload JSON e insere um novo convidado no banco de dados.
  * `GET /vips`: Consulta o banco de dados e retorna a lista completa de convidados.
  * `DELETE /vips/{id}`: Captura o ID via *Path Variable* e deleta o registro correspondente no banco.
* **Gerenciamento de Dependências:** Projeto estruturado com **Maven** para controle automatizado de bibliotecas e build do servidor Tomcat embutido.

# Tecnologias Utilizadas
* **Linguagem:** Java (JDK 17+)
* **Framework Back-end:** Spring Boot
* **Banco de Dados:** SQLite (JDBC)
* **Build Tool:** Apache Maven
* **Testes de API:** Thunder Client / Postman

---
*Desenvolvido por Italo Rocha de Almeida Ferreira - Estudante de Engenharia de Software*

<br>

---

## 🇺🇸 English Version

# RESTful API: VIP System with Spring Boot and SQLite

This project is a **RESTful API** developed in **Java** using the **Spring Boot** framework. The system exposes endpoints for managing VIP guests, consuming and returning data in **JSON** format, operating entirely decoupled from any Front-end.

# Architecture and Features
* **Spring Web (Controllers):** HTTP route mapping (`@GetMapping`, `@PostMapping`, `@DeleteMapping`) to intercept network requests and return standardized responses (JSON).
* **Data Persistence (DAO & SQLite):** Direct connection to a relational database (SQLite) using the Java JDBC API. The DAO (Data Access Object) pattern was implemented to separate business logic from raw SQL queries.
* **CRUD Cycle:**
  * `POST /vips`: Receives a JSON payload and inserts a new guest into the database.
  * `GET /vips`: Queries the database and returns the complete list of guests.
  * `DELETE /vips/{id}`: Captures the ID via Path Variable and deletes the corresponding record in the database.
* **Dependency Management:** Project structured with **Maven** for automated library control and building of the embedded Tomcat server.

# Technologies Used
* **Language:** Java (JDK 17+)
* **Back-end Framework:** Spring Boot
* **Database:** SQLite (JDBC)
* **Build Tool:** Apache Maven
* **API Testing:** Thunder Client / Postman

---
*Developed by Italo Rocha de Almeida Ferreira - Software Engineering Student*