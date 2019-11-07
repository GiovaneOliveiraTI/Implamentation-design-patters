package Padroes.Criacionais.AbstractFactory;

public class FabricaGuarda implements Modelo {
    public Cachorro getCachorro(){
        return new Pastor("Flex");
    }

    public  Gato getGato(){
        return new Ragdoll("jupter");
    }
}
