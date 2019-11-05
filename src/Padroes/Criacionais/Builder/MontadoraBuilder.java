package Padroes.Criacionais.Builder;

public interface MontadoraBuilder {

    void montar(char tipo, String modelo);

    Veiculo geVeiculo();
}
