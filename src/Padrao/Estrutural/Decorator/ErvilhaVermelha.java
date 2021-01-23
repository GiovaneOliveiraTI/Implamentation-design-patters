package Padrao.Estrutural.Decorator;

public class ErvilhaVermelha extends ErvilhaDecorator {

    public ErvilhaVermelha(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }

    public ErvilhaVermelha() {
        super(null);
    }

    @Override
    public void combinar() {
        super.combinar();
        mostrarCor();
    }

    private void mostrarCor() {
        System.out.println("Ervilha Vermelha!");
    }

}
