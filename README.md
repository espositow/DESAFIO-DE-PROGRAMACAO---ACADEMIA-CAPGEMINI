# Desafios - Academia Capgemini 

Neste projeto desenvolvido através da Seleção da Academia Técnica Capgemini 2022 promovida pela [Capgemini](https://www.linkedin.com/company/capgemini/) em parceria com a Proway-  tivemos a oportunidade de desenvolver um código de preferência em linguagem java na resolução de três desafios técnicos.

## Stacks utilizadas

  * Java8
  * ItelliJ IDEa
  * JUnit



## Desafio 1: 

Entrada: número natural maior que zero;

Saída: cadeia de string e espaços

## Desafio 2 :

Entrada: string 

Saída: (int) quantidade de caracteres para formar a senha segura conforme regras

## Desafio 3 :

Entrada: string 

Saída: (int) quantidade de anagramas de substrings contidos na string

**# Questão 01**

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere \* e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:n = 3

Saída:

​       *

​     **

   ***

 # Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

Possui no mínimo 6 caracteres.

Contém no mínimo 1 digito.

Contém no mínimo 1 letra em minúsculo.

Contém no mínimo 1 letra em maiúsculo.

Contém no mínimo 1 caractere especial. 

Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:

Entrada:Ya3

Saída:3

Explicação:

Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

 # Questão 03

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo:

Exemplo 1)

Entrada:ovo

Saída:2

Explicação:A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 

Exemplo 2)

Entrada:ifailuhkqq

Saída:3

Explicação:A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

## 