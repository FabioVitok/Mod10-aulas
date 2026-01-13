import java.util.ArrayList;
public class MaquinaVendas
{
    public String localizacao;
    public Utilizador user;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    //Construtor da class
    public MaquinaVendas(String localizacao, Utilizador user, ArrayList<Produto> produtos)
    {
        this.localizacao = localizacao;
        this.user = user;
        this.produtos = produtos;
    }
    
    //Método Para comprar um produto
    public boolean comprar(Produto p1, int quantidade)
    {
        double precoTotal = p1.getPreco() * quantidade;
        
        //Verifica se o stock é sufeciente e se o utilizador tem saldo sufeciente
        if(p1.reduzirStock(quantidade) == true && this.user.descontarSaldo(precoTotal) == true)
        {
            p1.reduzirStock(quantidade);
            this.user.descontarSaldo(precoTotal);
            return true;
        }
        return false;
    }
}
