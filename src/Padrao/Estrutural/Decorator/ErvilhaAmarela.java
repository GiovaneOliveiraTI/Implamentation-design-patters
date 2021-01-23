package Padrao.Estrutural.Decorator;

public class ErvilhaAmarela extends ErvilhaDecorator {

    public ErvilhaAmarela(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }

    public ErvilhaAmarela() {
        super(null);
    }

    @Override
    public void combinar() {
        super.combinar();
        mostrarCor();
    }

    private void mostrarCor() {
        System.out.println("Ervilha Amarela!");
    }

}
