# 🎮 Mini RPG em Java - Design Patterns - Bootcamp Accenture - Desenvolvimento Java & Cloud

Projeto de um **mini jogo RPG em console**, desenvolvido em **Java**, com foco no estudo e aplicação de **padrões de projeto (Design Patterns)**.

O sistema utiliza os padrões **Singleton**, **Strategy** e **Facade**, inspirados nos conceitos apresentados no bootcamp Accenture - Desenvolvimento Java & Cloud.

---

## 📌 Objetivo

Este projeto tem como objetivo:

- Praticar Programação Orientada a Objetos

- Aplicar Design Patterns na prática

- Desenvolver uma arquitetura organizada

- Criar um projeto para portfólio

O jogo simula um sistema simples de combate entre jogador e inimigo, com troca dinâmica de armas.

---

## 🕹️ Funcionalidades

✔ Combate em turnos

✔ Sistema de ataques intercambiáveis

✔ Troca de armas em tempo real

✔ Exibição de status (HP)

✔ Gerenciamento central do jogo

✔ Estrutura modular e escalável

---

## 🧩 Padrões de Projeto Utilizados

### 🔹 Singleton

Responsável por garantir uma única instância do gerenciador do jogo.

Classe:

GameManager

Função:

- Controla o estado da partida

- Gerencia jogador e inimigos

---

### 🔹 Strategy

Permite trocar o comportamento de ataque em tempo de execução.

Interface:

AttackStrategy

Implementações:

- SwordAttack

- MagicAttack

- BowAttack

Função:

- Trocar armas sem modificar o código principal

---

### 🔹 Facade

Simplifica a interação com o sistema.

Classe:

GameFacade

Função:

- Centraliza as operações do jogo

- Oculta a complexidade interna

---
## ▶️ Como Executar

### Pré-requisitos

- Java 21+ (ou compatível)

- IDE ou terminal configurado

### Executando

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/mini-rpg-java.git
```

2. Execute diretamente pela sua IDE.

### 🖥️ Exemplo de Execução

Bem-vindo ao Mini RPG!

1 - Espada

2 - Magia

3 - Arco

4 - Status

0 - Sair

Escolha: 2

Você causou 25 de dano!

O inimigo atacou!


## 📚 Tecnologias Utilizadas

Java

Programação Orientada a Objetos

Design Patterns

Git/GitHub

## 👨‍💻 Autor

Desenvolvido por Daniel

Estudante de Engenharia de Software

📎 [LinkedIn](www.linkedin.com/in/daniel-angelo-software-engineer)

📎 [GitHub](https://github.com/DanielAngelo2024)

## 📄 Licença

Este projeto está sob a licença MIT.

Sinta-se livre para estudar, modificar e reutilizar.

---
