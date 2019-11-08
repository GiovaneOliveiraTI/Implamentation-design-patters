package Padrao.Criacional.AbstractFactory;

public class FabricaCampanhia implements Modelo {

    public Cachorro getCachorro() {
        return new Shitzu("auau");
    }

    public Gato getGato(){
        return  new  Persa("Miau");
    }


}
