public class CalculadorDeImposto {
// O problema desse codigo e que sempre que aparecer um novo imposto sera necessario criar criar ifs and elses.
    public void realizaCalculo(Orcamento orcamento, String imposto){

        //Com a criaçao das classes ICMS e ISS  esta melhor o codigo, porem o numero de ifs  e elses nessa classe tende a aumentar
        if(imposto.equals("ICMS")){
            double icms =  new ICMS().calculaICMS(orcamento);
            System.out.print(icms);
        }else if(imposto.equals("ISS")){
            double iss = new ISS().calculaISS(orcamento);
            System.out.print(iss);
        }
    }
}
