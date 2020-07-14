# language: pt


Funcionalidade: Lista de filmes

  Eu como usuário
  desejo realizar uma busca de filmes por titulo
  para poder adicionar na minha lista de favoritos

  @teste
  Cenário: Realizar uma busca por titulo do filme
    Dado que estou na lista de filmes
    Quando realizar uma busca por titulo
    Então vejo o resultado da busca

  @teste
  Cenário: Realizar uma busca por titulo e ano do filme
    Dado que estou na lista de filmes
    Quando realizar uma busca por titulo e ano do filme
    Então vejo o resultado da busca
