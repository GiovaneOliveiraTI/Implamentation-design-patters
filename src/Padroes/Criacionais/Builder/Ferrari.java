package Padroes.Criacionais.Builder;

public class Ferrari extends Veiculo {

     private String nome;

    public Ferrari(String modelo) {
        super(modelo, "Esportivo");
        this.nome = "Ferrari";
    }

    public String toString(){
        return "Carro" + nome + "" + getModelo() + "" +getTipo();
    }
}
