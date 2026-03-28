📚 CRUD de Estudantes em Java

Este projeto é uma aplicação simples de CRUD (Create, Read, Update, Delete) desenvolvida em Java, com o objetivo de praticar conceitos fundamentais de programação e estrutura de dados.

⚠️ Este projeto é apenas para fins de estudo e prática.

🚀 Funcionalidades

O sistema funciona via terminal e permite:

✅ Cadastrar um novo estudante
📄 Listar todos os estudantes cadastrados
✏️ Atualizar o nome de um estudante pelo ID
❌ Deletar um estudante pelo ID
🔢 Geração automática de ID
🧠 Conceitos aplicados

Este projeto foi criado para treinar:

Programação Orientada a Objetos (POO)
Estrutura de dados (ArrayList)
Manipulação de listas
Entrada de dados com Scanner
Estrutura de controle (switch, while)
Separação de responsabilidades (Service Layer)
🛠️ Tecnologias utilizadas
Java (JDK 8+)
Terminal / Console
📂 Estrutura do projeto
📁 projeto
 ├── App.java              // Classe principal (menu interativo)
 ├── Student.java         // Modelo de dados (entidade)
 └── StudentService.java  // Regras de negócio (CRUD)
🔍 Detalhamento das classes
🧾 Student

Classe responsável por representar um estudante.

Atributos:

id (int)
name (String)
age (int)
course (String)
⚙️ StudentService

Responsável pela lógica do sistema:

Armazena os dados em memória (List<Student>)
Controla o ID automático
Implementa os métodos:
createStudent()
readStudent()
updateStudent()
deleteStudent()
🖥️ App

Classe principal que contém:

Menu interativo no terminal
Entrada de dados com Scanner
Controle do fluxo do sistema
▶️ Como executar o projeto
1. Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git
2. Acesse a pasta
cd seu-repositorio
3. Compile os arquivos
javac *.java
4. Execute o programa
java App
💻 Exemplo de uso
1 - Cadastrar
2 - Listar
3 - Atualizar
4 - Deletar
0 - Sair

O que deseja fazer?
⚠️ Limitações
❌ Não utiliza banco de dados
❌ Não possui persistência de dados
❌ Validações básicas (pode melhorar)
❌ Interface apenas em terminal
🔮 Possíveis melhorias
🔹 Adicionar persistência com arquivo ou banco de dados (MySQL, SQLite)
🔹 Criar interface gráfica (JavaFX ou Swing)
🔹 Implementar validações mais robustas
🔹 Separar em camadas (Controller, Service, Repository)
🔹 Criar API REST com Spring Boot
🎯 Objetivo do projeto

Este projeto faz parte do meu processo de aprendizado em desenvolvimento backend.
A ideia é evoluir gradualmente, entendendo bem a base antes de avançar para tecnologias mais complexas.

🤝 Contribuição

Este é um projeto de estudo, mas sugestões e melhorias são sempre bem-vindas!

📌 Autor

Desenvolvido por Luiz Gustavo 👨‍💻
