package Padrao.Estrutural.Composite;

public class Comp {
    public static  void  main (String [] args) {
        new Comp().montarMenu();
    }

    private void montarMenu() {
        Menu parte = new Menu("parte1");
        parte.add(new MenuItem("item1", "evento1"));
        parte.add(new MenuItem("item2", "evento2"));
        parte.add(new MenuItem("item3", "evento5"));
        Menu parte2 = new Menu("parte1");
        parte.add(new MenuItem("item4", "evento4"));
        Menu principal = new Menu("Principal");
        principal.add(parte);
        principal.add(parte2);
        principal.print();
    }
}
