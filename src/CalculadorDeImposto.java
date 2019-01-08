public class CalculadorDeImposto {
    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
        double icms = impostoQualquer.calcula(orcamento);
        System.out.println(icms);

    }
}
