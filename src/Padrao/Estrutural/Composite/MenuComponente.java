package Padrao.Estrutural.Composite;

abstract class MenuComponente {
    private String link;
    private String descricao;

    public MenuComponente(String descricao, String link) {
        this.descricao = descricao;
        this.link = link;
    }

    public String toString() {
        if (link != null) {
            return  "\t" + descricao + " - " + link;
        }
        return descricao;
    }

    public  abstract void print();

}
