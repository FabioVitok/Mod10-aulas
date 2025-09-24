import java.util.ArrayList;
public class Curso
{
  private int id;
    private String nomeCurso;
    private ArrayList<String> disciplinas;
// falta turmas

   public Curso() {
        this.disciplinas = new ArrayList<String>();
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
            public ArrayList<String> getdisicplinas() {
        return disciplinas;
    }
            public void adicionarAluno(String disciplina) {
        disciplinas.add(disciplina);
    }
             public void setnomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
              public String getnomeCurso(){
        return this.nomeCurso;
    }
}