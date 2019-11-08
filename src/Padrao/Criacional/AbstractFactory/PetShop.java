package Padrao.Criacional.AbstractFactory;

import java.util.Scanner;

public class PetShop {

    private Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        new PetShop().selecionar();

    }

    public void selecionar() {
        System.out.println("Informe  1- companhia ou 2- Guarda");
        byte opc = sc.nextByte();
        Modelo modelo = null;
        switch (opc){
            case 1: modelo = new FabricaCampanhia();
            break;
            case 2: modelo = new FabricaGuarda();
            break;
        }
        System.out.println("Cachorro: " + modelo.getCachorro());
        System.out.println("Gato: " + modelo.getGato() );

    }
}
