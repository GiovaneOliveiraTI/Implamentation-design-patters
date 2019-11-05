package Padroes.Criacionais.Builder;

public class Montadora {

    private MontadoraBuilder builder = new MontadoraVeiculoBuilder() {
        @Override
        public Veiculo montar(char tipo, String modelo) {
            builder.montar(tipo, modelo);
            return builder.getVeiculo();
        }
    };
}
