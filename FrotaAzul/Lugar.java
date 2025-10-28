public class Lugar
{
    private int id;
    private boolean livre;
    private Autocarro autocarro;
    
    public Lugar(int id)
    {
        this.id = id;
        this.livre = true;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public boolean getLivre(){
        return this.livre;
    }
    
    public void setLivre(boolean livre){
        this.livre = livre;
    }
    
    public Autocarro getAutocarro(){
        return this.autocarro;
    }
    
    public void setAutocarro(Autocarro autocarro){
        this.autocarro = autocarro;
    }
}