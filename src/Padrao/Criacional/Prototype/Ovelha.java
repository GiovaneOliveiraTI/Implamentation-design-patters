package Padrao.Criacional.Prototype;

public class Ovelha implements Cloneable {
    private  String nome;

    public Ovelha(String nome){
        this.nome = nome;
    }

    public String toString(){
        return  nome;
    }

    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Erro: " + e.getMessage());
        }
        return  object;
    }
}
