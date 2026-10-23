# API de Cadastro de Livros

API REST desenvolvida com **Kotlin e Spring Boot** como parte de uma atividade prática do curso Técnico em Desenvolvimento de Sistemas.

O objetivo do projeto é compreender o funcionamento de uma API REST, desde o recebimento de uma requisição HTTP até o processamento e retorno dos dados em formato JSON.

## Tecnologias utilizadas

- **Kotlin** — Linguagem utilizada no desenvolvimento.
- **Spring Boot** — Framework para criação da API REST.
- **Spring Web** — Dependência responsável pelos recursos HTTP.
- **Bruno** — Ferramenta utilizada para testar as requisições.
- **IntelliJ IDEA** — Ambiente de desenvolvimento.

## Funcionalidades

A API permite receber informações de um livro por meio de uma requisição HTTP `POST` e retornar os mesmos dados em formato JSON.

As informações utilizadas são:

- `titulo`: título do livro.
- `autor`: nome do autor.
- `ano`: ano de publicação.

Nesta versão, os dados não são armazenados em um banco de dados.

## Estrutura do projeto

O projeto foi organizado em três camadas principais:

| Camada | Responsabilidade |
|---|---|
| **Entity** | Representa os dados do livro por meio de uma `data class`. |
| **Controller** | Recebe as requisições HTTP e retorna as respostas da API. |
| **Service** | Contém a lógica de processamento dos dados recebidos. |

Essa organização permite separar as responsabilidades de cada parte da aplicação, facilitando a compreensão e a manutenção do código.

## Endpoint

### Cadastrar livro

**Método:** `POST`  
**URL:** `http://localhost:8080/livros`

Exemplo de requisição:

```json
{
  "titulo": "Java para Iniciantes",
  "autor": "Maria Silva",
  "ano": 2026
}
```

**Resposta esperada — 201 Created**

```json
{
  "titulo": "Java para Iniciantes",
  "autor": "Maria Silva",
  "ano": 2026
}
```

O status `201 Created` indica que a requisição foi processada com sucesso. Nesta atividade, o livro é retornado ao cliente, mas não é salvo permanentemente.

## Como executar

1. Clone o repositório para seu computador.
2. Abra o projeto no IntelliJ IDEA.
3. Aguarde o carregamento das dependências.
4. Execute a classe principal da aplicação Spring Boot.
5. Com o servidor iniciado, abra o Bruno ou outro cliente HTTP.
6. Envie uma requisição `POST` para `http://localhost:8080/livros`, utilizando um corpo JSON com as informações do livro.

## Aprendizados

Durante o desenvolvimento, pude praticar conceitos importantes de Kotlin e Spring Boot, como:

- Criação e utilização de `data class`.
- Organização do projeto em Entity, Controller e Service.
- Utilização das anotações `@RestController`, `@RequestMapping`, `@PostMapping`, `@RequestBody` e `@Service`.
- Recebimento de dados JSON e conversão para objetos Kotlin.
- Utilização de `ResponseEntity` para definir respostas HTTP.
- Injeção de dependência entre Controller e Service.
- Testes de endpoints utilizando o Bruno.

O projeto também ajudou a reforçar minha compreensão sobre parâmetros, tipos de retorno e a comunicação entre as diferentes camadas de uma aplicação.

## Considerações finais

Este é um projeto introdutório, desenvolvido para colocar em prática os fundamentos de APIs REST com Kotlin e Spring Boot.

O foco foi compreender o funcionamento de cada parte da aplicação e como elas trabalham juntas para receber e responder a uma requisição HTTP.
