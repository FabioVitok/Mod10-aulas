public class Mdc
{
    int a;
    int b;
    int mdc;
    public Mdc(int a, int b)
    {
        this.a = a;
        this.b = b;
        algoritmo();
    }

    public int algoritmo()
    {
        int resto;
        int num1 = this.a;
        int num2 = this.b;
        if(num1 > num2)
        {
            while(num2 != 0)
            {
                resto = num1 % num2;
                num1 = num2;
                num2 = resto;
            }
            mdc = num1;
            return mdc;
        }
        else
        {
            while(num1 != 0)
            {
                 resto = num2 % num1;
                 num2 = num1;
                 num1 = resto;
            }
            mdc = num2;
            return mdc;
        }
    }
    
    public void exibir()
    {
        System.out.println("O Mdc entre " + this.a + " e " + this.b + " é " + this.mdc);
    }
}