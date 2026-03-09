##Desafio Técnico Junior pronto: 
Aplicação desenvolvida em Spring Boot para simular em qual tipo de juros a pessoa pode solicitar.


# Técnologias utilizadas
- Java 25
- Spring Boot 4.0.3
- Spring Data JPA
- PostgreSQL (ou H2 para testes)
- Maven

  ## Como Rodar
  Clone o repositório:
   ```bash
   git clone https://github.com/PietroAssis-dev/DesafioTecnico-junior
   ```
   
  Compile e rode
   ```bash
   mvn spring-boot:run
   ```

  A aplicação estara disponivel em:
   ```bash
   http://localhost:8080

   ```
   ### 4. Endpoints disponíveis
    Visualizar qual tipo de empréstimo você pode solicitar:
    ```
    POST /customer-loans
    ```
    Body (JSON):
    ```bash
    {
      "age": 26,
      "cpf": "275.484.389-23",
      "name": "Pietro Henrique",
      "income": 3100.00,
      "location": "SP"
    }
    ```
    Resposta:
    ```bash
      {
    "loans": [
      {
        "type": "Consignment",
        "interestRate": 2
      },
      {
        "type": "Personal",
        "interestRate": 4
      },
      {
        "type": "Guaranteed",
        "interestRate": 3
      }
    ],
    "customer": "Pietro Henrique"
    }
