public class Monstro
{
    private String nome;
    private String tipo;
    private int nivel;
    
    public Monstro(String nome, String tipo, int nivel){
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }
     public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNivel(){
        return this.nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    @Override
    public String toString(){
        return "Nome:" + this.nome + "Tipo:" + this.tipo + "Nivel:" + this.nivel;
    }
    
    public int treinar(){
        this.nivel++;
        return this.nivel;
    }
}
