import java.util.ArrayList;
public class ParqueEstacionamento
{
    private int id;
    private int numlugares;
    private String morada;
    private ArrayList<Lugar> lugares;
    
    public ParqueEstacionamento(int id, int num_lugares, String morada){
        this.id = id;
        this.numlugares = numlugares;
        this.morada = morada;
        this.lugares = new ArrayList<Lugar>();
        
        for(int i = 0; i < num_lugares; i++){
            Lugar l1 = new Lugar(i + 1);
            lugares.add(l1);
       }
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getNumlugares(){
        return this.numlugares;
    }
    
    public void setNumlugares(int numlugares){
        this.numlugares = numlugares;
    }
      public String getMorada(){
        return this.morada;
    }
    
         public void setMorada(String morada){
        this.morada = morada;
    }
    public int numLugaresLivres()
    {
            int l = 0;
         for(int i = 0; i < this.lugares.size(); i++)
         {
             
                Lugar lugarTemp = this.lugares.get(i);
             if (this.lugares.get(i).getLivre() == true)
             {
                 l = l + 1;
             }
         }
         
         return l;
    }
    
    public int numLugaresOcupados()
    {
         return this.numlugares - this.numLugaresLivres();
    }
    
    public boolean checkLugarLivre(int index)
    {
        if(index > this.numlugares || index < 0) {
            return false;
        }
        Lugar lugarSelecionado = this.lugares.get(index);
        
        return lugarSelecionado.getLivre();
    }
    
    public boolean ocuparLugar (Autocarro autocarro){
        for(int i = 0; i< this.lugares.size(); i++){
            Lugar lugarTemp = this.lugares.get(i);
            
          if(lugarTemp.getLivre() == true)
          {
              lugarTemp.setLivre(false);
              lugarTemp.setAutocarro(autocarro);
              
              return true;
          }
        }
        return false;
    }
    public boolean desocuparLugar(Autocarro autocarro)
    {
        for(Lugar lugarTemp: this.lugares) {
             if(lugarTemp.getLivre() == false)
          {
              lugarTemp.setLivre(false);
              lugarTemp.setAutocarro(autocarro);
              
              return true;
          }
        }
        return false;
    }
    @Override 
    public String toString()
    {
        return ("Id: " + this.id +
        "|numero de lugares: " + this.numlugares +
        "|morada: " + this.morada +
        "|lugares: " + this.lugares);
    }
}
