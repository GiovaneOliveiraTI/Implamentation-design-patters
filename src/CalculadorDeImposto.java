public class CalculadorDeImposto {
// O problema desse codigo e que sempre que aparecer um novo imposto sera necessario criar criar ifs and elses.
    public void realizaCalculo(Orcamento orcamento, String imposto){

        if(imposto.equals("ICMS")){
            double icms = orcamento.getValor() * 0.1;
            System.out.print(icms);
        }else if(imposto.equals("ISS")){
            double iss = orcamento.getValor() * 0.06;
            System.out.print(iss);
        }
    }
}
