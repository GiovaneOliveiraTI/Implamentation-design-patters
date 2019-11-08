package Padrao.Estrutural.Adapter;

public class CaixaArrasteAdapter implements Vetor {

    CaixaArraste caixaArraste = new CaixaArraste();
    @Override
    public int getPosX() {
        Coordenada  c = caixaArraste.getTopoEsq();
        return c.getX();
    }

    @Override
    public int getPosY() {
        Coordenada c = caixaArraste.getRodapeDir();
        return c.getY();
    }

    @Override
    public int getLargura() {
        Coordenada c1 = caixaArraste.getTopoEsq();
        Coordenada c2 = caixaArraste.getRodapeDir();
        return c2.getX() - c1.getX();
    }

    @Override
    public int getAltura() {
        Coordenada c1 = caixaArraste.getTopoEsq();
        Coordenada c2 = caixaArraste.getRodapeDir();
        return c2.getY() - c1.getY();
    }
}
