package Padrao.Criacional.Builder;

class MontadoraVeiculoBuilder implements MontadoraBuilder {
    private Veiculo veiculo;

    public Veiculo montar(char tipo, String modelo) {
        switch (tipo) {
            case 'F':
                veiculo = new Ferrari(modelo);
                break;

            case 'J':
                veiculo = new Jeep(modelo, tipo);
                break;
        }
        return null;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
}


