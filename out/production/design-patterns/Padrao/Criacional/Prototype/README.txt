E usado quando : O sistema deve ser independente de como os seus produtos s�o criados, compostos
e representados. As classes a instanciar s�o especificadas em tempo de execuc�o. Queremos evitar
a construc�o de uma hierarquia de classes de fabricac�o paralela a uma hierarquia de classes de
produtos por elas fabricados. Inst�ncias de uma classe podem ter uma de algumas poucas combinac�es
de estados diferentes. Pode ser mais conveniente instalar um n�mero correspondente de prot�tipos
e clon�-los, ao inv�s de instanciar as classes no estado apropriado manualmente, toda vez que for
necess�rio.