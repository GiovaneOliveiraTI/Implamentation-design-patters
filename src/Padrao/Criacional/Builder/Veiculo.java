package Padrao.Criacional.Builder;

public abstract  class Veiculo {

    private  String modelo;
    private String tipo;

    public  Veiculo (String modelo, String tipo){
        this.tipo = tipo;
        this.modelo = modelo;
    }

    protected String getModelo(){
        return modelo;
    }

    protected  String getTipo(){
        return tipo;
    }


}
