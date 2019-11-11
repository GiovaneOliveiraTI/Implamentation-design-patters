E usado quando : O sistema deve ser independente de como os seus produtos são criados, compostos
e representados. As classes a instanciar são especificadas em tempo de execucão. Queremos evitar
a construcão de uma hierarquia de classes de fabricacão paralela a uma hierarquia de classes de
produtos por elas fabricados. Instâncias de uma classe podem ter uma de algumas poucas combinacões
de estados diferentes. Pode ser mais conveniente instalar um número correspondente de protótipos
e cloná-los, ao invés de instanciar as classes no estado apropriado manualmente, toda vez que for
necessário.