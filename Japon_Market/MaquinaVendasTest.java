import java.util.ArrayList;
public class MaquinaVendasTest
{
    public static void main(String [] args)
    {
        Utilizador user1 = new Utilizador("Fábio", "fabio.vitoriano@icloud.com", "passwow");
        user1.carregarSaldo(35.50);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Doce dc1 = new Doce("mochi", 3.60, 6, "C:/Users/Pictures/mochi", true);
        produtos.add(dc1);
        Snack sn1 = new Snack("Noodles", 4.60, 6, "C:/Users/Pictures/noodles", false);
        produtos.add(sn1);
        Bebida bb1 = new Bebida("Monster Morango", 1.60, 6, "C:/Users/Pictures/monster_morango", true);
        produtos.add(bb1);
        MaquinaVendas mq1 = new MaquinaVendas("Loures", user1, produtos);
        
        
        // Exebir as infromações de todos os prodtuos 
        for (int i = 0; i < mq1.getProdutos().size(); i++) 
        {
            Produto p1 = mq1.getProdutos().get(i);
            
            System.out.println(p1.exibirInfo());
        }
        
        // Exemplo de compra efetuada com sucesso
        System.out.println(mq1.comprar(mq1.getProdutos().get(0), 6));
    
        // Exemplo de uma compra que não funcionou por falta de stock
        System.out.println(mq1.comprar(mq1.getProdutos().get(2), 7));
        
        // Exemplo de uma compra que não funcionou por falta de saldo
        System.out.println(mq1.comprar(mq1.getProdutos().get(1), 6));
        
        // Exemplo de uma compra que não funcionou por falta de saldo e de stock
        System.out.println(mq1.comprar(mq1.getProdutos().get(0), 6));
        
        // Voltar a pedir as iformações de todos os produtos para verificar o stock
        for (int i = 0; i < mq1.getProdutos().size(); i++) 
        {
            Produto p1 = mq1.getProdutos().get(i);
            
            System.out.println(p1.exibirInfo());
        }
        
        // Testar o metodo de reStock    
        System.out.println(mq1.getProdutos().get(0).reStock(6));
        
        
        for (int i = 0; i < mq1.getProdutos().size(); i++) 
        {
            Produto p1 = mq1.getProdutos().get(i);
            
            System.out.println(p1.exibirInfo());
        }
        
    }
}
