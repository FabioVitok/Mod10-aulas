public class Autocarro
{
  private int id;
  private String matricula;

public Autocarro(int id, String matricula)
{
    this.id = id;
    this.matricula = matricula;
}

public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
     public String getMatricula(){
        return this.matricula;
    }
    
         public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    @Override
    public String toString(){
        return "Id: " + this.id + " | Matricula:" + this.matricula;
    }
    
    public Autocarro clone(){
        Autocarro clone = new Autocarro(this.id, this.matricula);
        return clone;
    }
}

