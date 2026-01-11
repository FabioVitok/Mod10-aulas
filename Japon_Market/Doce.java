public class Doce extends Produto
{
    private boolean frio; 
    private static final String TIPO = "Doce";
    
     public Doce(String nome, double preco, int stock, String imagem,boolean frio)
    {
       super(nome, TIPO, preco, stock, imagem);
       this.frio = frio;
    }
    
    @Override 
    public String mostrar()
    {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.getNome()).append("\n");
        sb.append("Tipo: ").append(this.TIPO).append("\n");
        sb.append("Preço: ").append(this.getPreco()).append("\n");
        sb.append("Stock: ").append(this.getStock()).append("\n");
        if(frio == true)
            sb.append("Colocar no congelador").append("\n");
        return sb.toString();
        
    }
}

