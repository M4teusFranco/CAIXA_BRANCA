# 🧑‍💻 Caixa Branca - UX/UI

### 📋 Descrição do Projeto

Este projeto realizou o teste de caixa branca, um código que valida uma conexão básica a um Banco de Dados utilizando JDBC. O foco foi compreender e validar a execução do código numa só classe, calcular a complexidade ciclomática e sequenciar os caminhos básicos do programa.

### 📊 Planilha Avaliativa

<img width="937" height="339" alt="image" src="https://github.com/user-attachments/assets/330c5a45-afa4-4f18-a011-c14b63beb2a1" />

<br>

### 🔘 Fluxo de Grafo

O Fluxo de Grafo são Grafos numa Relação sequencial do fluxo do código. <br><br>
<img width="349" height="602" alt="image" src="https://github.com/user-attachments/assets/6bf18494-ba43-455f-8704-98c9bfe1b93b" />

<br>

### 🧮 Cálculo de Complexidade Ciclomática

A Complexidade ciclomática é uma métrica de software usada para indicar a complexidade de um programa de computador. Ela mede a quantidade de caminhos de execução independentes a partir de um código fonte.
Segue fórmula abaixo:

*M = E - N + 2P*

E - Arestas
N - Nós
P - Componentes conectados 

### Cálculo Aplicado

Portanto, o cálculo ocorrerá dessa forma:

E - Arestas = *11*
N - Nós = *11*
P - Componentes conectados = *1*

M = 11 - 11 + 2 * 1
M = 2

<b> Complexidade ciclomática : 2 </b>

<br>

### 👣 Caminhos básicos

| Caminho | Fluxo | Explicação |
| :--- | :---: | ---: |
| 1 | 1 → 2 → 3 → 4 → 5 → 6 → 8 | Caminho de Execução padrão. Fluxo do processamento principal |
| 2 | 1 → 2 → 3 → 4 → 5 → 7 → 9 | Falha de validação. User não encontrado |
| 3 | 1 → 2 → 10 → 11 | Falha de conexão, nula |
| 4 | main() → verificarUsuario() → return false | Falha de validação, Login inválido |

<br>

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Banco de dados relacional (ex: MySQL, PostgreSQL, SQLite)
- Driver JDBC apropriado (ex: mysql-connector-java.jar)
- IDE Java (Eclipse, IntelliJ, etc.)

<br>

### 🚀 Instalação e execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/CAIXA_BRANCA
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Adicione o driver JDBC ao classpath do projeto.

4. Configure a URL de conexão, usuário e senha em ConexaoDB.java:

```
private static final String URL = "jdbc:mysql://localhost:3306/login";
private static final String USUARIO = "root"
private static final String SENHA = ""
```

5. Execute a classe User.java e aguarde a validação de conexão.

<br><br>

### 🛠️ Funcionalidades Implementadas

- Conexão com banco de dados MySQL via JDBC

<br><br>

### 📝 Execução prática do código - Console

#### Script SQL

<img width="390" height="251" alt="image" src="https://github.com/user-attachments/assets/934ad0ec-a724-48b2-88c8-e6bbd6731953" />


#### Validação bem-sucedida

Acesso ao Banco de Dados permitido e usuário encontrado.

<img width="225" height="65" alt="image" src="https://github.com/user-attachments/assets/1a5addaf-b5bd-4a93-9e2f-29e87369e2ac" />

#### Validação mal-sucedida

Acesso ao Banco de Dados permitido, mas usuário não localizado.

<img width="260" height="73" alt="image" src="https://github.com/user-attachments/assets/37ed6b3a-6ed3-481b-8be9-b2282e8f2779" />

Acesso ao Banco de Dados negado.

<img width="720" height="59" alt="image" src="https://github.com/user-attachments/assets/7b3610d8-94c0-4f96-aa14-821f915fc036" />


<br>

## ✒️ Autores

* **Mateus Franco Bezerra** - *CAIXA_BRANCA*
