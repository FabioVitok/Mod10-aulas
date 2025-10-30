public class Fada extends Criatura
{
    private int asas;
    private static final String TIPO = "Fada";
    public Fada(String nome, int asas)
    {
        super(nome, TIPO);
        this.asas = asas;
    }
    
    public int getAsas()
    {
        return this.asas;
    }
    
    public String voar()
    {
        return "A " + this.getNome() + " voa com as asas";
    }
}