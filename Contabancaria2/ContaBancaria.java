public class ContaBancaria
{
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular)
    {
       this.titular = titular;
    }
    
    public String getTitular()
    {
        return this.titular;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    @Override
    public String toString()
    {
        return "Titular: " + titular + "\nSaldo: " + saldo;
    }
    
    public boolean depositar(double deposito)
    {
        if(deposito > 0)
        {
            this.saldo = this.saldo + deposito;
            return true;
        }
        
        return false;
    }
    
    public boolean levantar(double levantamento)
    {
        if(levantamento < this.saldo)
        {
            this.saldo = this.saldo - levantamento;
            return true;
        }
        
        return false;
    }
    }