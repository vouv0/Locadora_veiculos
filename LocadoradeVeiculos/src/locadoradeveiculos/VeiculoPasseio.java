package locadoradeveiculos;

public class VeiculoPasseio extends Veiculo {
    double ValorVenda;
    String Dt_cadastro;
    int Km;
    
    @Override
    void calculaValorVenda(double taxa){
        PrecoCusto *= (taxa/100);
    }
    
}
