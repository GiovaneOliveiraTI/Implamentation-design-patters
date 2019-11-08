package Padrao.Criacional.Builder;

public class Montadora {

    public MontadoraBuilder builder = new MontadoraVeiculoBuilder();
        
        public Veiculo montar(char tipo, String modelo) {
            builder.montar(tipo, modelo);
            return builder.getVeiculo();
        }
}
