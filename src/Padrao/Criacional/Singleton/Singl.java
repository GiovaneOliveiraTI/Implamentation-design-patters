package Padrao.Criacional.Singleton;

public class Singl {
    public static void main(String [] args) {
        new Singl().criarContas();
    }

    public void criarContas() {
        ContaCorrente conta1 = ContaCorrente.newInstance();
        conta1.setNumeroConta("145-65");
        System.out.println(conta1 + " - " + conta1.hashCode());
        ContaCorrente conta2 = ContaCorrente.newInstance();
        conta2.setNumeroConta("123-44");
        System.out.println(conta2 + " - " + conta2.hashCode());
    }

}
