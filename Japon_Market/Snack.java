public class Snack extends Produto
{
    private boolean prontoComer;
    private static final String TIPO = "Snack";
    
    public Snack(String nome, double preco, int stock, String imagem, boolean prontoComer)
    {
       super(nome, TIPO, preco, stock, imagem);
       this.prontoComer = prontoComer;
    }
    
    @Override 
    public String mostrar()
    {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.getNome()).append("\n");
        sb.append("Tipo: ").append(this.TIPO).append("\n");
        sb.append("Preço: ").append(this.getPreco()).append("\n");
        sb.append("Stock: ").append(this.getStock()).append("\n");
        if(prontoComer == true)
            sb.append("Pronto a comer").append("\n");
        else
        {
            sb.append("Necessita de preparo antes de comer").append("\n");
        }
        return sb.toString();
        
    }
}
