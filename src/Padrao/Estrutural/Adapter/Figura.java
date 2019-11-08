package Padrao.Estrutural.Adapter;

public class Figura implements Vetor {
    private int posX, posY, largura, altura;
    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public int getLargura() {
        return largura;
    }

    @Override
    public int getAltura() {
        return altura;
    }
}
