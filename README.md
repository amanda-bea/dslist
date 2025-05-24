# DSList API 🎮

Bem-vindo ao **DSList API**! Este é o backend de um sistema de coleções de jogos, permitindo que os usuários organizem e gerenciem suas listas de jogos favoritos.

---

## 📖 Descrição

O DSList API é um projeto backend desenvolvido em **Java** com **Spring Boot**. Ele fornece uma API RESTful para gerenciar listas de jogos e os jogos contidos nessas listas. A aplicação se conecta a um banco de dados **PostgreSQL** para persistência de dados e segue o padrão de arquitetura **MVC (Model-View-Controller)** para uma organização clara e modular do código.

---

## ✨ Funcionalidades Principais (Exemplo)

* Listagem de todos os jogos disponíveis.
* Busca de jogos por lista específica.
* Criação, atualização e exclusão de listas de jogos (CRUD para listas).
* Adição e remoção de jogos de listas específicas.
* Reordenação de jogos dentro de uma lista.

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **PostgreSQL**
* **Maven**

---

## 🏛️ Arquitetura

O projeto segue o padrão de arquitetura **MVC (Model-View-Controller)**:

* **Model**: Camada de dados e lógica de negócios, representada pelas entidades JPA e services.
* **View**: Como este é um projeto backend (API), a "view" é representada pelas respostas JSON enviadas aos clientes.
* **Controller**: Camada responsável por receber as requisições HTTP, processá-las utilizando os services e retornar as respostas adequadas.

---

## 🐘 Banco de Dados

Este projeto utiliza o **PostgreSQL** como sistema de gerenciamento de banco de dados. Certifique-se de ter uma instância do PostgreSQL em execução e configurada corretamente antes de iniciar a aplicação.
