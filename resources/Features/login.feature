#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

Funcionalidade: Adicionar Contas

@teste
Cenario: adicionar nova conta
Dado que estou logado com usuario "rafael"
E clico em adicionar um novo usuario
Quando adiciono o novo usuario
Entao apresanta a mensagem "Conta adicionada com sucesso!"