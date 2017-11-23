# facisa-map-308511


Questão 2: Sim é possivel.

vantagens

É implementada simplesmente por encaminhar todas as chamadas para um campo de objeto.

Não tem nenhuma dependência de detalhes da implementação.

É mais flexível,uma vez que é definida dinamicamente em tempo de execução,e não estaticamente em tempo de compilação.

Fácil de se ler.

Fácil de se testar(não há classes abstratas e todas dependências são declaradas diretamente).

Desvantagens

Dependências devem ser gerenciadas diretamente por getters ou no construtor

É muito menos intuitivo no começo,e se você está acostumado de outra forma,será mais complicado de se acostumar com o código.

É pouco detalhado no que diz respeito à utilização de herança