public class Doce extends Produto
{
    private boolean frio; 
    private static final String TIPO = "Doce";
    
     public Doce(String nome, double preco, int stock, String imagem,boolean frio)
    {
       super(nome, TIPO, preco, stock, imagem);
       this.frio = frio;
    }
}

