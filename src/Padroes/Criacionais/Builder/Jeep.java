package Padroes.Criacionais.Builder;

public class Jeep extends Veiculo {

    private String nome;

    public Jeep(String modelo, char tipo) {
        super(modelo, "Utilitario");
        this.nome = "Jeep";
    }

    public String toString(){
        return "Carro:" + nome + " "  + getModelo() + " " + getTipo();
    }




}
