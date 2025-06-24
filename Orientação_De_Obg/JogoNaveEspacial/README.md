# Jogo de Nave Espacial - Java (Swing + JDBC)

Este é um jogo 2D de nave espacial desenvolvido em Java utilizando os conceitos de Programação Orientada a Objetos (POO), a biblioteca gráfica Swing para a interface e JDBC com SQLite para persistência de dados (Ranking).

## Funcionalidades

- Escolha entre 3 tipos de naves:
  - **Nave de Ataque (azul)** – rápida, com tiros fortes.
  - **Nave de Defesa (vermelha)** – mais lenta, mas mais resistente.
  - **Nave Exploradora (amarela)** – equilibrada.
- Movimento com as teclas `↑ ↓ ← →`.
- Tiro com a tecla `ESPAÇO`.
- Inimigos aparecem aleatoriamente.
- Colisão entre nave e inimigos.
- Pontuação baseada em sobrevivência e inimigos destruídos.
- Interface gráfica com sprites em pixel art 8-bits.

## Estrutura

O projeto está dividido nos seguintes pacotes:

- `modelo` – classes das naves, inimigos e tiros.
- `visao` – interface do jogo (Swing).
- `controle` – lógica principal de escolha e execução do jogo.
- `banco` – acesso ao banco SQLite via JDBC.
- `imagens` – sprites das naves, inimigos e fundo.

## Aviso

**O sistema de ranking ainda não está funcionando corretamente.**
As pontuações ainda **não estão sendo gravadas corretamente** no banco SQLite.

## Requisitos

- Java JDK 17 ou superior.
- Driver JDBC do SQLite (`sqlite-jdbc-<versão>.jar`) dentro da pasta `lib/`.
- IntelliJ IDEA ou outro ambiente com suporte a projetos Java + Swing.

## Como Rodar

1. Baixe o driver JDBC do SQLite: https://github.com/xerial/sqlite-jdbc/releases
2. Coloque o `.jar` na pasta `lib/`.
3. Compile e execute o `Main.java`.
4. Divirta-se!

---

Desenvolvido como atividade prática de POO com Swing + JDBC.

## Creditos
all rights reserved to Micael :D