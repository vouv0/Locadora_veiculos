package locadoradeveiculos;

public class VeiculoCarga extends Veiculo {
    double ValorVenda;
    String Dt_cadastro;
    int Km;
    String TipodeCarga;
    
    
    @Override
    void calculaValorVenda(double taxa){
        PrecoCusto *= (taxa/100);
    }
}
