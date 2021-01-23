package Padrao.Estrutural.Decorator;

public class ErvilhaDecorator implements Ervilha {

    private Ervilha ervilhaPai = null;

    public ErvilhaDecorator(Ervilha ervilhaPai) {
        this.setErvilhaPai(ervilhaPai);
    }


    @Override
    public void combinar() {
        if(ervilhaPai != null) {
            ervilhaPai.combinar();
            System.out.println(" x ");
        }else {
            System.out.println();
        }

    }

    @Override
    public void setErvilhaPai(Ervilha ervilhaPai) {
        this.ervilhaPai = ervilhaPai;
    }
}
