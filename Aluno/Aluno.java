
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numProcesso;
    private String nome;
    private String dNascimento;
    private String morada;
    private String telefone;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno()
    {
        
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
      public int getnumProcesso(){
        return this.numProcesso;
    }
    public void setnumProcesso(int numProcesso){
        this.numProcesso = numProcesso;
    }
      public String getNome(){
        return this.nome;
    }
         public void setNome(String nome){
        this.nome = nome;
    }
          public String getdNascimento(){
        return this.dNascimento;
    }
         public void setdNascimento(String dNascimento){
        this.dNascimento = dNascimento;
    }
          public String getmorada(){
        return this.morada;
    }
         public void setmorada(String morada){
        this.morada = morada;
    }
              public String gettelefone(){
        return this.telefone;
    }
         public void settelefone(String telefone){
        this.telefone = telefone;
    }
}
