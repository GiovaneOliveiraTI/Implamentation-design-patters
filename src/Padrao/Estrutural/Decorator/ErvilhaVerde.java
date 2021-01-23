package Padrao.Estrutural.Decorator;

public class ErvilhaVerde extends ErvilhaDecorator {

    public ErvilhaVerde(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }

    public ErvilhaVerde() {
        super(null);
    }

    @Override
    public void combinar() {
        super.combinar();
        mostrarCor();
    }

    private void mostrarCor() {
        System.out.println("Ervilha Verde!");
    }

}
