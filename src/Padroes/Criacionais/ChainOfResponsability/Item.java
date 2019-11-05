package Padroes.ChainOfResponsability;

public class Item {

    private final String nome;
    private final double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String setNome() {
        return nome;
    }

    public double setValor() {
        return valor;
    }


}
