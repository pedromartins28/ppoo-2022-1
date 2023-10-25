[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=8181082&assignment_repo_type=AssignmentRepo)
# Exercício Zoológico - Polimorfismo

Este exercício é uma continuação do exercício anterior do Zoológico, no qual havíamos trabalhado o conceito de herança.

Nosso objetivo será entender melhor os conceitos relacionados ao polimorfismo e melhorar a modelagem de nossas classes, adotando tais conceitos.

## Passo 1 - Continuando a partir do exercício anterior

Baixe o repositório do exercício anterior do Zoológico, e copie os arquivos da pasta `src` para a pasta `src` deste projeto.

Execute o programa e teste para confirmar que não ficou faltando nenhum arquivo.

Faça um commit com essas alterações, usando a mensagem: "Código do exercício anterior".

## Passo 2 - Experimentando Polimorfismo 1

Vamos começar exercitando nosso entendimento sobre os conceitos de polimorfismo.
Para isso, crie uma classe `Teste` com um método `main` e, dentro dele, faça o seguinte:

- Declare uma variável chamada `animal` do tipo `Animal` e atribua a ela um objeto da classe `Lobo`.
- Chame o método `getNome` usando a variável `animal`.
- Agora, usando a mesma variável `animal`, atribua a ela um objeto da classe `Galinha`.
- Chame o método `getNome` usando a variável criada.

Explique abaixo como é possível que a mesma variável `animal` possa ser usada para chamar métodos de objetos de classes diferentes.

Basicamente, o polimorfismo permite que uma variável do tipo da classe pai possa referenciar objetos de todas suas classes filhas ou netas. Isto é, a variável da classe Animal pode referenciar objetos de qualquer Mamífero, Ave, Lobo, Galinha, Gato ou Aguia, pois estes sempre vão ser animais. Isso porque uma variável polimórfica de um tipo pode referenciar objetos de seus subtipos. O contrário não é possível, pois nem todo Animal é um Mamífero, por exemplo.


Ao terminar, faça um commit com as alterações da classe `Teste` e as alterações neste arquivo README).

## Passo 3 - Experimentando Polimorfismo 2

Agora, altere o método `main` da classe `Teste` e faça o seguinte:
- Usando a mesma variável `animal` declarada no passo anterior, atribua a ela um objeto da classe `Lobo`.
- Chame o método `getDescricaoLonga` usando a variável `animal`.

O que é exibido?

fred é um(a) lobo que faz auuu e tem pelo laranja

O método chamado pertence a qual classe?

Mamífero

Agora usando a mesma variável `animal`, atribua a ela um objeto da classe `Galinha`.
- Chame o método `getDescricaoLonga` usando a variável criada.

O que é exibido?

coco é um(a) galinha que faz cocoricó e voa mal

O método chamado pertence a qual classe?

Ave

Explique como a mesma linha de código `animal.getDescricaoLonga()` pode ser usada para chamar métodos de classes diferentes.

Isso acontece pois uma variável contém um tipo dinâmico e um tipo estático. Ao rodar um código, o compilador vai se preocupar com o tipo estático e a execução(JVM) vai se preocupar com o tipo dinâmico. Por exemplo, ao observar a linha que contém: "Animal animal = new Lobo()", podemos encontrar esses dois tipos na variável animal. Seu tipo estático é Animal e seu tipo dinâmico é Lobo. Visto isso, quando o método "animal.getDescricaoLonga()" é chamado, ele só vai compilar caso exista na classe do tipo estático(Animal). Por outro lado, sua execução só vai estar correta caso ele exista na classe do tipo dinâmico(Lobo). Portanto, uma variável pode chamar métodos de classes diferentes desde que ele exista tanto na classe que representa o tipo dinâmico quanto na classe que representa o tipo estático.

Ao terminar, faça um novo commit com as alterações (na classe Teste e neste arquivo README).

## Passo 4 - Usando Polimorfismo no Projeto Zoologico

Vamos agora perceber como o polimorfismo ajuda a reduzir a replicação de código. 

Para isso, você deve alterar a classe `Zoologico`:

- Substitua as listas de animais de cada espécie por uma única lista de animais.
- E, devido a essa modificação, implemente as alterações necessárias nos métodos da classe.

Do ponto de vista do usuário, seu programa deverá continuar funcionando da mesma forma que você havia feito no exercício da aula anterior, mas agora com um código melhor.

Teste suas alterações!

Ao final, faça um novo commit no seu repositório.

## Passo 5 - Identificando o uso de Polimorfismo

Para todas as perguntas abaixo, você deve indicar em qual classe e qual é o número da linha onde cada situação acontece.

1. Indique pelo menos uma variável polimórfica utilizada no seu código e explique porque ela é uma variável polimórfica.

Classe: Zoológico

Linha: 6

Variável: animal

Explicação: A variável "animal" é considerada polimórfica pois pode representar tipos dinâmicos diferentes em momentos diferentes da execução. Nesse caso, a variável pode receber diferentes objetos, podendo cadastrar Gato, Lobo, Galinha ou Aguia.


2. Identifique algum ponto no código onde está sendo usado o princípio da substituição e explique o que é este princípio.

Classe: Zoologico

Linha: 24

Explicação: Basicamente, esse príncipio permite que um objeto de uma subclasse possa ser usado onde um objeto da superclasse é esperado. Nesse caso é esperado um objeto da superclasse Animal, porém um objeto da subclasse Aguia é adicionado a lista.


3. Identifique algum ponto no código onde uma variável tem tipo estático e tipo dinâmico diferentes (indique quais são os tipos estático e dinâmico da variável neste ponto).

Classe: Zoologico

Linha: 9

Variável: animal

Tipo estático: Animal

Tipo dinâmico: Gato


4. Identifique onde ocorre uma chamada de método que utiliza o polimorfismo de método.

Classe: Zoologico

Linha: 31

