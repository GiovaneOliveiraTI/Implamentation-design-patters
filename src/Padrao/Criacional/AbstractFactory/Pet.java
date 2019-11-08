package Padrao.Criacional.AbstractFactory;

public abstract class Pet {
    private  String nome;

    public Pet(String nome){
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }
}
