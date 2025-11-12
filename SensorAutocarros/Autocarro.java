import java.util.ArrayList;
public class Autocarro
{
    //Inicialização das constates do Autocarro
    private String matricula;
    private int kms;
    int[] sensoresFrontais;
    int[] sensoresTraseiros;
    
    // Construtor PAra a cclasse Autocarro
    public Autocarro(String matricula, int kms)
    {
       this.matricula = matricula;
       this.kms = kms;
       
       this.sensoresFrontais = new int[4];
       this.sensoresTraseiros = new int[4];
    }
    //Metodo para Exibir o estado dos Sensores
    public String exibirEstadoSensoresFrontais()
    {
        //Inicialização das variaveis e do string Builder
        StringBuilder sb = new StringBuilder();
        int tamanhoArray = sensoresFrontais.length;
        
        for(int i = 0 ; i < tamanhoArray; i++)
        //Enquanto i for menor que o tamanho do array
        {
            if(i == tamanhoArray -1)
            //Se for o ultimo elemento do array adiciona apenas o estado do sensor ao sTring builder
            {
                sb.append(sensoresFrontais[i]);
            }
            else
            //Adiciona o estado do sensor e uma virgula ao string builder
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
        //Enquanto i for menor que o tamanho do array
        {
            if(i == tamanhoArray -1)
            //Se for o ultimo elemento do array adiciona apenas o estado do sensor ao sTring builder
            {
                sb.append(sensoresTraseiros[i]);
            }
            else
            //Adiciona o estado do sensor e uma virgula ao string builder
            {
                sb.append(sensoresTraseiros[i]).append(", ");
            }
        }
        return sb.toString();
    }
    public String exibirtodos()
    {
        //Mostra o estado dos sensores Frontais e dos sensores Traseiros
        StringBuilder sb = new StringBuilder();
        sb.append("Sensosres Frontais").append(exibirEstadoSensoresFrontais()).append("\n");
        sb.append("Sensosres Traseiros").append(exibirEstadoSensoresTraseiros());
        return sb.toString();
    }
    
    public boolean ativarSensorFrontal(int n){
        //Inicialização das constantes
        final int MINIMA_ARRAY = 0;
        final int MAXIMA_ARRAY = this.sensoresFrontais.length - 1;
        //Se n estiver dentro da lenght do Array
        if(n >= MINIMA_ARRAY && n<= MAXIMA_ARRAY)
        //verifca se o sensor ja está ativo
            if(this.sensoresFrontais[n] == 0)
            {
                //Ativa o sensor 
                this.sensoresFrontais[n] = 1;
                return true;
            }
        //Caso o numero dado esteja fora do lenght do array ou o sensor ja esteja ativo
        return false;
    }
    
    public boolean ativarSensortraseiro(int n){
        //Inicialização das constantes
        final int MINIMA_ARRAY = 0;
        final int MAXIMA_ARRAY = this.sensoresTraseiros.length - 1;
        //Se n estiver dentro da lenght do Array
        if(n >= MINIMA_ARRAY && n<= MAXIMA_ARRAY)
            //verifca se o sensor ja está ativo
            if(this.sensoresTraseiros[n] == 0)
            {
                //Ativa o sensor 
                this.sensoresTraseiros[n] = 1;
                return true;
            }
        //Caso o numero dado esteja fora do lenght do array ou o sensor ja esteja ativo
        return false;
    }
    
    public boolean ativarSensor(int n, String Sensor)
    {
        //Verifica se o Sensor desejado é o traseiro
        if (Sensor.equalsIgnoreCase("traseiro")){
            //Retorna True e ativa o sensor
            return this.ativarSensortraseiro(n);
        }
        //Verifica se o Sensor desejado é o frontal
        if (Sensor.equalsIgnoreCase("frontal")){
            //Retorna True e ativa o sensor
            return this.ativarSensortraseiro(n);
        }
        //Caso a String Sensor nao inclua nenhumas das opçoes
        return false;
    }
}
