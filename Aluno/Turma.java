
import java.util.ArrayList;
public class Turma
{
  private int id;
    private int numAlunos;
    private String ano;
    private String nomeCurso;
    private ArrayList<String> alunos;
    //falta professores

   public Turma() {
        this.alunos = new ArrayList<String>();
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
            public ArrayList<String> getAlunos() {
        return alunos;
    }
            public void adicionarAluno(String nome) {
        alunos.add(nome);
    }
             public void setano(String ano){
        this.ano = ano;
    }
              public String getano(){
        return this.ano;
    }
                 public void setnomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
              public String getnomeCurso(){
        return this.nomeCurso;
    }
}
