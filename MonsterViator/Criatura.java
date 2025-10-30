public abstract class Criatura
{
    public static final String REINO = "Monster Viator";
    public static int contadorDeCriaturas;
    private final String nome;
    private final String tipo;
    
    public Criatura(String nome, String tipo)
    {
        this.nome = nome;
        
        this.tipo = tipo;
        
        this.contadorDeCriaturas = this.contadorDeCriaturas + 1;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public String exibirInformacoes(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.nome).append("/n");
        sb.append("Tipo: ").append(this.tipo).append("/n");
        sb.append("Reino: ").append(this.REINO).append("/n");
        sb.append("Numero de Criaturas criadas: ").append(this.contadorDeCriaturas).append("/n");
        
        return sb.toString();
    }
    
}