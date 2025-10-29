public class ConjucturaDeCollatz
{
    private int n;
    public ConjucturaDeCollatz(int n)
    {
        this.n = n;
    }
    
    public int getN()
    {
        return this.n;
    }
    
    public int processar ()
    {
        int nrAProcessar = this.n;
        
        while(nrAProcessar != 1)
        {
            // Se o numero é par
            if(ispair(nrAProcessar)){
                // Dividimos por 2
                nrAProcessar = nrAProcessar / 2;
            }
            else {
                //multiplicamos por 3 e adicionamos 1
                nrAProcessar = (nrAProcessar * 3)+1;
            }
        }
        
        return nrAProcessar;
    }
    public boolean ispair(int nrAValidar)
    {
        if(nrAValidar % 2 == 0)
        {   
            return true;
        }
        
        return false;
    }
}