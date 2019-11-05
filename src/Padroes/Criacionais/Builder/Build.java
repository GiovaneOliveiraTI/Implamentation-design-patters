package Padroes.Criacionais.Builder;

public class Build {
    public static void main(String [] args) {
        new Build().executar();
    }

    private void executar() {
        Montadora montadora = new Montadora();
        Veiculo carro1 = montadora.montar('F', "TesteRossa");
        Veiculo carro2 = montadora.montar('J', "Renegate");

        System.out.println(carro1);
        System.out.println(carro2);

    }

}

