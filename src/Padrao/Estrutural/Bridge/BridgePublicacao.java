package Padrao.Estrutural.Bridge;
abstract class BridgePublicacao {
    private Publicacao publicacao;

    public BridgePublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Publicacao getPublicacao (){
        return publicacao;
    }


}
