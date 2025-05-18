# Floquinho AI

[![fotoreadme.png](https://i.postimg.cc/4dBBxc01/fotoreadme.png)](https://postimg.cc/624dH8t7)

Este é o backend de uma aplicação web de IA para uso no dia a dia reduzindo custos de IA com plano PRO.

## Tecnologias Utilizadas

* **Java | Spring Boot | Spring AI | Open AI** 

## Como Executar Localmente

Siga estes passos para rodar o backend em sua máquina de desenvolvimento:

1.  **Configure o application.properties com sua variável de ambiente com a secret key da open AI:
    ```bash
    spring.ai.openai.api-key=${OPEN_AI_KEY}
    ```
2.  **Só rodar o projeto no RUN e integrar com seu front-end:]

3.  ** Para testes recomendo o uso do POSTMAN e faça a requisição POST neste formato:
    ```bash
    {
    "message": "o que é JPA"
    }
    ```
    

## Autor

Este frontend foi desenvolvido por **Gustavo**.
