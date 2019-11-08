package Padrao.Criacional.Builder;

interface MontadoraBuilder {

    Veiculo montar(char tipo, String modelo);
    Veiculo getVeiculo();
}
