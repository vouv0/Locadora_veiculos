package locadoradeveiculos;


public class Veiculo {
    int ID;
    String Marca;
    String Modelo;
    String Cor;
    long Chassi;
    double Ano;
    double PrecoCusto;
    
    void calculaPrecoCusto(double taxa){
        PrecoCusto *= (taxa/100);
        
    }
    
    void calculaValorVenda(double taxa){
        PrecoCusto *= (taxa/100);
        
    }
    
}
