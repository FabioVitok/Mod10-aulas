import java.util.ArrayList;
public class MonsterViatorTest
{
    public static void main(String[] args)
    {
        // Instanciar a classe Fada
        // Criar 3 objetos do tipo Fada
        Fada f1 = new Fada("Lux", 5);
        Fada f2 = new Fada("Pixie", 4);
        Fada f3 = new Fada("Ecco", 2);
        
        // Instanciar a classe Monstro
        // Criar três objetos do tipo Monstro
        Monstro m1 = new Monstro ("Arsene");
        Monstro m2 = new Monstro ("Oger");
        Monstro m3 = new Monstro ("Endevor");
        
        // Criar Armario para as Criaturas
        ArrayList<Fada> fadas = new ArrayList(); 
        fadas.add(f1);
        fadas.add(f2);
        fadas.add(f3);
        
        int numFadas = fadas.size();
        System.out.println(numFadas);
        
        Fada newF1 = fadas.get(0);
        Fada newF2 = fadas.get(1);
        Fada newF3 = fadas.get(2);
        
        fadas.add(f2);
        Fada newF4 = ultimaFadaArray(fadas);
        System.out.println(newF4.getAsas());
        Fada newF5 = ultradummy(fadas);
        System.out.println(newF5.getAsas());
    }
    
    public static Fada ultimaFadaArray(ArrayList<Fada> fadas)
    {
        //Tamanho do Arraylist
        int numFadas = fadas.size();
        // Ultima posição do arraylist
        int ultimoIndex = numFadas - 1;
        
        // Ultimo objeto do ArrayList
        Fada ultimaFada = fadas.get(ultimoIndex);
        
        //Retorna a Ultima fada do ArrayList
        return ultimaFada;
    }
    
    public static Fada primeiraFadaArray(ArrayList<Fada> fadas)
    {
        // Primeira posição do arraylist
        final int PRIMEIROINDEX = 0;
        //Primeiro objeto do ArrayList
        Fada primeiraFada = fadas.get(PRIMEIROINDEX);
        return primeiraFada;
    }
    
    public static Fada ultradummy(ArrayList<Fada> fadas)
    {
        int numFadas = fadas.size();
        final int FLAGVAR = 2;
        // Se o tamanho do Arraylist for menor ou igual a 2
        if(numFadas <= FLAGVAR)
        {
            // Retorna a ultima Fada
            return ultimaFadaArray(fadas);
        }
        // Caso Contrario Retorna a primeira
        return primeiraFadaArray(fadas);
    }
}