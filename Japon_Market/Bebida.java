public class Bebida extends Produto
{
    private boolean energetico;
    private static final String TIPO = "Bebida";
    
     public Bebida(String nome, double preco, int stock, String imagem, boolean energetico)
    {
       super(nome, TIPO, preco, stock, imagem);
       this.energetico = energetico;
    }
}



