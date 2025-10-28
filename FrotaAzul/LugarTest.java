public class LugarTest
{
    public static void main(String[] args)
    {
        Autocarro a1 = new Autocarro(5, "FCP");
        System.out.println(a1.getId());
        
        Lugar l1 = new Lugar(2);
        
        Autocarro a2 = l1.getAutocarro();
        
        System.out.println(l1.getAutocarro().getMatricula());
    
        
    }
}
