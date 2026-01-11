public class Bebida extends Produto
{
    private boolean energetico;
    private static final String TIPO = "Bebida";
    
     public Bebida(String nome, double preco, int stock, String imagem, boolean energetico)
    {
       super(nome, TIPO, preco, stock, imagem);
       this.energetico = energetico;
    }
    
    @Override 
    public String mostrar()
    {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.getNome()).append("\n");
        sb.append("Tipo: ").append(this.TIPO).append("\n");
        sb.append("Preço: ").append(this.getPreco()).append("\n");
        sb.append("Stock: ").append(this.getStock()).append("\n");
        if(energetico == true)
            sb.append("Energético").append("\n");
        else
        {
            sb.append("Não é energético").append("\n");
        }
        return sb.toString();
        
    }
}



