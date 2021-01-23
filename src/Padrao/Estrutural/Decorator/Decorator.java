package Padrao.Estrutural.Decorator;

public class Decorator {

    public static void main(String [] args) {
        new Decorator().conbine();
    }

    private void conbine() {
        new ErvilhaVerde(new ErvilhaAmarela());
        new ErvilhaAmarela(new ErvilhaVermelha());
        new ErvilhaAmarela();
    }
}
