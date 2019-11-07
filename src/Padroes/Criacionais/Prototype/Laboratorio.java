package Padroes.Criacionais.Prototype;

public class Laboratorio {
    public static void main(String [] args) {
        new Laboratorio().executar();
    }

    private void executar() {
        Ovelha original = new Ovelha("Dolly");
        Ovelha clone = new PrototypeImp().duplicar(original);
        System.out.println(original + " é seu clone" + clone);
        System.out.println((clone == original) ? "mesmo objetivo" : "Objetos diferentes");
    }
}
