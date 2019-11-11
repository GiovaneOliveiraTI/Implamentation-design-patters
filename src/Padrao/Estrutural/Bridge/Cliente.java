package Padrao.Estrutural.Bridge;

public class Cliente {
    public static void main(String [] args ){
        new Cliente().publicar();
    }

    private void publicar() {
        Livro livro  = new Livro("Use a cabeça padrões de projeto ", "GoF");
        System.out.println(livro);
    }
}
