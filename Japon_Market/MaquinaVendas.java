import java.util.ArrayList;
public class MaquinaVendas
{
    public String localizacao;
    public Utilizador user;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public MaquinaVendas(String localizacao, Utilizador user, ArrayList<Produto> produtos)
    {
        this.localizacao = localizacao;
        this.user = user;
        this.produtos = produtos;
    }
    
    public boolean comprar(Produto p1, int quantidade)
    {
        double precoTotal = p1.getPreco() * quantidade;
        if(p1.reduzirStock(quantidade) == true && this.user.descontarSaldo(precoTotal) == true)
        {
            p1.reduzirStock(quantidade);
            this.user.descontarSaldo(precoTotal);
            return true;
        }
        return false;
    }
}
