
public class MaquinaVendasTest
{
    public static void main(String [] args)
    {
        Utilizador user1 = new Utilizador("Fábio", "fabio.vitoriano@icloud.com", "passwow");
        user1.carregarSaldo(20.50);
        MaquinaVendas mq1 = new MaquinaVendas("Loures", user1);
        Doce dc1 = new Doce("mochi", 3.60, 6, "C:/Users/Pictures/mochi", true);
        mq1.produtos.add(dc1);
        Snack sn1 = new Snack("Noodles", 4.60, 6, "C:/Users/Pictures/noodles", false);
        mq1.produtos.add(sn1);
        Bebida bb1 = new Bebida("Monster Morango", 1.60, 6, "C:/Users/Pictures/monster_morango", true);
        mq1.produtos.add(bb1);
        
        Produto p1 = mq1.produtos.get(0);
        System.out.println(p1.getNome());
    }
}
