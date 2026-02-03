import java.util.ArrayList;
public class MaquinaVendas
{
    private String localizacao;
    private Utilizador user;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    //Construtor da class
    public MaquinaVendas(String localizacao, Utilizador user, ArrayList<Produto> produtos)
    {
        this.localizacao = localizacao;
        this.user = user;
        this.produtos = produtos;
    }
    
    //Metodos Get para os atributos da maquina de vendas
    
    public String getLocalizacao()
    {
        return this.localizacao;
    }
    
    public Utilizador getUtilizador()
    {
        return this.user;
    }
    
    ArrayList<Produto> getProdutos() 
    { 
        return new ArrayList<>(this.produtos); 
    }
    
     public String comprar(Produto p1, int quantidade)
    {
        double precoTotal = p1.getPreco() * quantidade;

        //Verifica se o stock é sufeciente e se o utilizador tem saldo sufeciente
        if(p1.verificarStock(quantidade) && this.user.verificarSaldo(precoTotal))
        {
            p1.reduzirStock(quantidade);
            this.user.descontarSaldo(precoTotal);
            return "Compra Efetuada com sucesso.\n";
        }
        else if(p1.verificarStock(quantidade) && !this.user.verificarSaldo(precoTotal))
            return "Não foi possivel efetuar a compra pois o seu saldo não é sufeciente.\n";
        else if(!p1.verificarStock(quantidade) && this.user.verificarSaldo(precoTotal))
             return "Não foi possivel efetuar a compra pois o stock não é sufeciente.\n";
        else
             return "Erro! Não foi possivel efetuar a compra.\n";
    }
}
