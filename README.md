# Job Leitor de WebService 

Este projeto é um job desenvolvido com Spring Batch para ler um webservice. 
O projeto foi desenvolvido durante o curso [Curso para Desenvolvimento de Jobs com Spring Batch](https://www.udemy.com/course/curso-para-desenvolvimento-de-jobs-com-spring-batch/) na Udemy.

API utilizada: https://randomuser.me/api/

## Configuração do Ambiente

### Pré-requisitos

- Docker
- Maven
- Java 17

### Configuração do Banco de Dados

O projeto utiliza Docker para executar um banco de dados MySQL. Certifique-se de ter Docker instalado e funcionando corretamente.

#### Banco de Dados `spring_batch`

```properties
spring.datasource.jdbcUrl=jdbc:mysql://localhost:3306/spring_batch
spring.datasource.username=user
spring.datasource.password=123456
```

### Inicialização do Banco de Dados

Para iniciar os bancos de dados MySQL usando Docker:

```bash
docker-compose up -d
```

### Execução do Projeto

Para compilar e executar o projeto, use o Maven:

```bash
mvn clean install
java -jar target/fatura-cartao-credito-job-1.0-SNAPSHOT.jar
```

