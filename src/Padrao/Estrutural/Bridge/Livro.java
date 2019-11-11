package Padrao.Estrutural.Bridge;

public class Livro extends BridgePublicacao {

    public Livro(String titulo, String autor) {
        super(new LivroImpl());
        ((LivroImpl)getPublicacao()).setTitulo(titulo);
        ((LivroImpl)getPublicacao()).setAutor(autor);
    }

    @Override
    public String toString() {
        return ((LivroImpl)getPublicacao()).getTitulo() + "de " +
                ((LivroImpl) getPublicacao()).getAutor();
    }
}
