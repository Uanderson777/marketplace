# Marketplace

Projeto Java de marketplace, atualmente com uma base para representar clientes e persistir seus dados com Spring Data JPA.

## Tecnologias utilizadas

- Java 21
- Spring Boot 4.1.2
- Jakarta Persistence (JPA)
- Spring Data JPA
- Spring MVC
- H2 e PostgreSQL, declarados como dependências do projeto
- Maven Wrapper

Os testes de persistência usam H2 em memória.

## Estrutura do projeto

```text
.
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/marketplace/
│   │   │       ├── MarketplaceApplication.java
│   │   │       └── registration/
│   │   │           ├── domain/
│   │   │           │   ├── Customer.java
│   │   │           │   └── CustomerId.java
│   │   │           └── repository/
│   │   │               └── CustomerRepository.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── br/com/marketplace/
│               ├── MarketplaceApplicationTests.java
│               └── registration/
│                   └── repository/
│                       └── CustomerRepositoryTest.java
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Executar no Windows

No PowerShell ou no Prompt de Comando, a partir da raiz do projeto:

```powershell
.\mvnw.cmd spring-boot:run
```

## Executar os testes

Na raiz do projeto, execute:

```powershell
.\mvnw.cmd test
```

## Funcionalidades implementadas

- **`Customer`**: entidade JPA com identificador, nome e e-mail. O construtor público cria um identificador UUID aleatório encapsulado em `CustomerId`. A classe não define validações de nome ou e-mail.
- **`CustomerId`**: `record` anotado com `@Embeddable`, que encapsula um `UUID` e pode ser usado como identificador embutido da entidade.
- **`CustomerRepository`**: interface Spring Data JPA que estende `JpaRepository<Customer, CustomerId>`, disponibilizando as operações padrão de persistência e consulta.
- **Teste do repositório**: verifica a gravação e a consulta de um cliente pelo identificador usando H2 em memória.
