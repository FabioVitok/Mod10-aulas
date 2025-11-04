import java.util.ArrayList;
public class Autocarro
{
    private String matricula;
    private int kms;
    int[] sensoresFrontais;
    int[] sensoresTraseiros;
    
    
    public Autocarro(String matricula, int kms)
    {
       this.matricula = matricula;
       this.kms = kms;
       
       this.sensoresFrontais = new int[4];
       this.sensoresTraseiros = new int[4];
    }
    
    public String exibirEstadoSensoresFrontais()
    {
        StringBuilder sb = new StringBuilder();
        int tamanhoArray = sensoresFrontais.length;
        for(int i = 0 ; i < tamanhoArray; i++)
        {
            if(i == tamanhoArray -1)
            {
                sb.append(sensoresFrontais[i]);
            }
            else
            {
                sb.append(sensoresFrontais[i]).append(", ");
            }
        }
        return sb.toString();
    }
    
    public String exibirEstadoSensoresTraseiros()
    {
        StringBuilder sb = new StringBuilder();
        int tamanhoArray = sensoresTraseiros.length;
        for(int i = 0 ; i < tamanhoArray; i++)
        {
            if(i == tamanhoArray -1)
            {
                sb.append(sensoresTraseiros[i]);
            }
            else
            {
                sb.append(sensoresTraseiros[i]).append(", ");
            }
        }
        return sb.toString();
    }
    public String exibirtodos()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Sensosres Frontais").append(exibirEstadoSensoresFrontais()).append("\n");
        sb.append("Sensosres Traseiros").append(exibirEstadoSensoresTraseiros());
        return sb.toString();
    }
}
