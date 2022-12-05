# language: pt
# encoding UTF-8


Funcionalidade: Aplicação

@app @about
Cenário: About
Dado que eu entre no menu about
Quando abrir uma tela de sobre do aplicativo
Então devo verificar se há alguma irregularidade de posicionamento dos elementos e validar as mensagens

@app @formulario
Cenário: Formulário
Dado que eu entre no menu formulário
E selecionar um videogame
E marcar o checkbox
E marcar o switch
E selecionar a data de aniversário
E selecionar a hora de nascimento
Quando clicar em salvar
Então devo verificar se as informações foram salvas
 
@app @formulario
Cenário: Formulário limpando dados
Dado que eu entre no menu formulário
E selecionar um videogame
E marcar o checkbox
E marcar o switch
E selecionar a data de aniversário
E selecionar a hora de nascimento
E clicar em salvar
E validar as informações salvas
Quando clicar em limpar
Então devo verificar se as informações salvas foram apagadas

@app @formulario
Cenário: Formulário salvando demorado
Dado que eu entre no menu formulário
E selecionar um videogame
E marcar o checkbox
E marcar o switch
E selecionar a data de aniversário
E selecionar a hora de nascimento
E clicar em salvar demorado
E aguardar
E validar as informações salvas
Quando clicar em limpar
Então devo verificar se as informações salvas foram apagadas

@app @nativo
Cenário: Seu barriga nativo
Dado que eu entre no meu seu barriga nativo
Quando clico no botão entrar
Então devo validar se o login foi efetuado com sucesso

@app @alert
Cenário: Alerta simples
Dado que eu entre no menu alerta
E clico alerta simples
Quando abrir uma tela de alerta clicavel
Então devo verificar se ao clicar no botão OK, alerta deve ser aceito

@app @alert
Cenário: Alerta restritivo
Dado que eu entre no menu alerta
E clico em alerta restritivo
Quando abrir uma tela de alerta clicavel
Então devo verificar se ao clicar no botão SAIR, alerta deve ser fechado

@app @alert
Cenário: Alerta confirmar
Dado que eu entre no menu alerta
E clico em alerta confirm
E abrir uma tela de alerta clicavel
E clico em confirmar
E valido que foi confirmado
E clico em sair
E clico em alerta confirm
E abrir uma tela de alerta clicavel
E clico em negar
Quando valido que foi negado
Então clicar em sair

@app @splash
Cenário: Splash
Dado que eu entre no menu splash
Então devo validar se aparece uma mensagem na tela.

@app @abas
Cenário: Abas
Dado que eu entre no menu abas
E valido a mensagem da primeira aba
Quando clico no menu segunda aba
Então devo validar se a mensagem da segunda aba apareceu

@app @accordion
Cenário: Accordion Primeira opção
Dado que eu entre no menu accordion
Quando clico na primeira opção
Então valido a mensagem da primeira opção

@app @accordion
Cenário: Accordion Segunda opção
Dado que eu entre no menu accordion
Quando clico na segunda opção
Então valido a mensagem da segunda opção

@app @accordion
Cenário: Accordion Terceira opção
Dado que eu entre no menu accordion
Quando clico na terceira opção
Então valido a mensagem da terceira opção

@app @accordion
Cenário: Accordion Quarta opção
Dado que eu entre no menu accordion
Quando clico na quarta opção
Então valido a mensagem da quarta opção

@app @accordion
Cenário: Accordion Quinta opção
Dado que eu entre no menu accordion
Quando clico na quinta opção
Então valido a mensagem da quinta opção

@app @accordion
Cenário: Accordion Sexta opção
Dado que eu entre no menu accordion
Quando clico na sexta opção
Então valido a mensagem da sexta opção

@app @cliques
Cenário: Clique longo
Dado que eu entre no menu cliques
Quando eu der um clique longo
Então devo validar que a mensagem de clique lento apareceu no campo de texto

@app @cliques
Cenário: Duplo clique
Dado que eu entre no menu cliques
Quando der dois clique no botão escrito duplo clique
Então devo validar que a mensagem de duplo clique apareceu no campo de texto

@app @cliques
Cenário: Duplo clique lento
Dado que eu entre no menu cliques
Quando der duplo clique lento
Então devo validar que a mensagem de duplo clique lento apareceu no campo de texto

@app @cliques
Cenário: Limpar
Dado que eu entre no menu cliques
Quando clique no botão escrito LIMPAR
Então devo validar que a utlima mensagem que apareceu no campo de texto foi limpa

@app @swipe
Cenário: Swipe
Dado que eu entre no menu Swipe
E valide a mensagem de mova a tela para a esquerda
E clique na seta para direita
E valide a mensagem de e veja se você consegue
Quando clique na seta para direita
Então valide a mensagem Chegar até o fim!

@app @swipelist
Cenário: Swipe List Mais
Dado que eu entre no menu swipe list
E arraste pra direita
Quando clique em mais
Então valido que o elemento fique estilizado com estilo de mais

@app @swipelist
Cenário: Swipe List Menos
Dado que eu entre no menu swipe list
E arraste pra direita
Quando clique em menos
Então valido que o elemento fique estilizado com estilo de menos

@app @swipelist
Cenário: Swipe List Resetar
Dado que eu entre no menu swipe list
E arraste pra esquerda
Quando clique em resetar
Então valido que o elemento fique estilizado com estilo padrão

@app @dragdrop
Cenário: Drag and Drop
Dado que eu entre no menu drag and drop
Quando arrasto para uma posição da lista
Então devo validar se ela ficou naquela posição

@app @opescondida
Cenário: Opção escondida
Dado que eu role a tela até o final do aplicativo
E clico em opção bem escondida
Quando eu clicar em OK
Então devo verificar se este alerta será fechado.
