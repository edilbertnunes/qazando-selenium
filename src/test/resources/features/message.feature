#language: pt

@message
Funcionalidade: Enviar mensagem

  @enviar-mensagem-sucesso
  Cenário: Enviar uma mensagem com sucesso
    Dado que estou na tela de mensagem
    E preencho todos os campos
    Quando clico em enviar mensagem
    Então vejo feedback de mensagem enviada com sucesso

