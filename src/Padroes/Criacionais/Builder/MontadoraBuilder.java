package Padroes.Criacionais.Builder;

interface MontadoraBuilder {

    Veiculo montar(char tipo, String modelo);
    Veiculo getVeiculo();
}
