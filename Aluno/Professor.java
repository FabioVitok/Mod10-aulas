
import java.util.ArrayList;
public class Professor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    public int salario;
    private String nome;
    private int genero; //Se for 0 é Mulher se for 1 é Homem

    /**
     * Construtor para objetos da classe Aluno
     */
    public Professor(int id, int salario, String nome, int genero)
    {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.setSalario(salario);

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
       public int getSalario(){
        return this.salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
        if(this.genero == 1){
            this.salario = salario * 2;
        }else{
            this.salario = salario / 2;        
        }
    }
      public String getNome(){
        return this.nome;
    }
         public void setNome(String nome){
        this.nome = nome;
    }
     public int getGenero(){
        return this.genero;
    }
    public void setGenero(int genero){
        this.genero = genero;
    }
}