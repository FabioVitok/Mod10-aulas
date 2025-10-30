
public class Monstro extends Criatura
{
    private static final String TIPO = "Monstro";
    public Monstro(String nome)
    {
       super(nome, TIPO);
    }
    
    public String atacar(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNome()).append("ataca com uma força monstruosa");
        
        return sb.toString();
    }
}