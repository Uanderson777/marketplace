# Marketplace

Projeto Java de marketplace. No estado atual, a aplicacao inclui o modelo de dominio de cliente e um repositorio Spring Data JPA para persistir e consultar clientes.

## Tecnologias

- Java 21
- Spring Boot 4.1.2
- Jakarta Persistence (JPA)
- Spring Data JPA
- Spring MVC
- H2 e PostgreSQL (drivers/dependencias configurados no projeto)
- Maven Wrapper

## Estrutura atual

```text
.
|-- .mvn/wrapper/
|-- src/
|   |-- main/
|   |   |-- java/br/com/marketplace/
|   |   |   |-- MarketplaceApplication.java
|   |   |   `-- registration/
|   |   |       |-- domain/
|   |   |       |   |-- Customer.java
|   |   |       |   `-- CustomerId.java
|   |   |       `-- repository/
|   |   |           `-- CustomerRepository.java
|   |   `-- resources/application.properties
|   `-- test/java/br/com/marketplace/
|       |-- MarketplaceApplicationTests.java
|       `-- registration/repository/CustomerRepositoryTest.java
|-- mvnw
|-- mvnw.cmd
`-- pom.xml
```

## Executar no Windows

No PowerShell ou Prompt de Comando, a partir da raiz do projeto:

```powershell
.\mvnw.cmd spring-boot:run
```

## Testes

Para executar os testes Maven na raiz do projeto:

```powershell
.\mvnw.cmd test
```

## Funcionalidades implementadas

- `Customer` e uma entidade JPA com nome, e-mail e identificador `CustomerId`.
- `CustomerId` e um identificador embutivel JPA que encapsula um `UUID`. O construtor de `Customer` gera um UUID para cada nova instancia.
- `CustomerRepository` estende `JpaRepository<Customer, CustomerId>` e fornece as operacoes padrao de persistencia e consulta do Spring Data JPA.
- O teste de repositorio verifica a persistencia e a consulta de um cliente pelo identificador.
