##Sistema de Cadastro de Funcionários

Este projeto é um sistema simples de cadastro de funcionários desenvolvido em Java. O sistema permite cadastrar, consultar e listar funcionários.

## Funcionalidades

- Cadastrar funcionário usando dois construtores diferentes.
- Consultar um funcionário pelo ID.
- Listar todos os funcionários cadastrados.
- Sair do sistema.

## Como usar

1. Clone o repositório ou baixe os arquivos.

2. Compile o código-fonte usando o seguinte comando no terminal:
    ```
    javac App.java
    ```

3. Execute o programa:
    ```
    java App
    ```

4. Siga as instruções exibidas no menu.

## Estrutura do Projeto

- `App.java`: Classe principal que contém o menu e as funcionalidades do sistema.
- `Pessoa.java`: Classe que representa uma pessoa, com atributos básicos.
- `Funcionario.java`: Classe que herda de `Pessoa` e representa um funcionário, com atributo adicional `cargo`.

## Exemplo de Uso

Ao executar o programa, será apresentado o seguinte menu:


### Cadastrar funcionário - Construtor 1
(forma que cria o objeto com os atributos pré setados)

Ao escolher a opção 1, você será solicitado a fornecer as seguintes informações:
- Nome do funcionário
- Alergias
- Problemas de saúde
- Telefone
- Email
- Cargo

### Cadastrar funcionário - Construtor 2
(forma criada a fim de demonstar um dos possíveis usos do polimorfismo devido os métodos getters e setters)

Ao escolher a opção 2, você será solicitado a fornecer as mesmas informações da opção 1, mas os dados serão configurados usando métodos `set`.

### Consultar funcionário

Ao escolher a opção 3, você será solicitado a fornecer o ID do funcionário que deseja consultar. O sistema exibirá todas as informações do funcionário.

### Listar todos os funcionários

Ao escolher a opção 4, o sistema exibirá uma lista de todos os funcionários cadastrados, com todas as suas informações.

### Sair do sistema

Ao escolher a opção 0, o sistema será encerrado.

## Contribuição

Sinta-se à vontade para contribuir com este projeto.
