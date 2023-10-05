#language: pt

@cadastro
Funcionalidade: Cadastro de usuário

  @cadastro-sucesso
  Cenário: Registrar novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuario
    Quando eu preencho o formulário de cadastro
    E clico em registrar
    Então vejo cadastro realizado com sucesso

#  @cadastro-sucesso2
#  Cenário: Registrar novo usuário com sucesso2
#    Dado que estou na tela de login
#    E acesso o cadastro de usuario
#    Quando eu preencho o formulário de cadastro
#    E clico em registrar
#    Então vejo cadastro realizado com sucesso