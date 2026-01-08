public class Snack extends Produto
{
    private boolean prontoComer;
    private static final String TIPO = "Snack";
    
    public Snack(String nome, double preco, int stock, String imagem, boolean prontoComer)
    {
       super(nome, TIPO, preco, stock, imagem);
       this.prontoComer = prontoComer;
    }
    
}
