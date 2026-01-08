public class Utilizador
{
      public String username;
      public String email;
      public String password;
      public double saldo ;
  
     public Utilizador(String username, String email, String password)
        {
            this.username = username;
                
            this.email = email;
                
            this.password = password;
                
            this.saldo = 0;
         }
 
     public double getSaldo()
        {
            return this.saldo;
        }
     
     public void setSaldo(double saldo)
        {
            this.saldo = saldo;
        }
    
     public String getUsername()
        {
            return this.username;
        }
        
     public String getEmail()
        {
            return this.email;
        }
        
     public String getPassword()
        {
            return this.password;
        }
        
     public boolean carregarSaldo (double carregamento)
     {  
            if(carregamento > 0){
                 this.setSaldo(this.getSaldo() + carregamento);
                 System.out.println("Carregamento efetuado com sucesso! O seu saldo atual é " + this.getSaldo() + "€.");
                 return true;
            }
                else{
                 System.out.println("Não foi possivel efetuar o carregamento, o montante do carregamento é negativo ou nulo.");
                 return false;
            }
     }
     
     public boolean descontarSaldo(double desconto)
     {
         if(desconto <= this.getSaldo()){
                 this.setSaldo(this.getSaldo() - desconto);
                 return true;
            }
         return false;
     }
     
     public boolean mostrarSaldo () 
     { 
        System.out.println("O seu saldo atual é " + this.getSaldo() + "€."); 
        return true;
     }
     
     
}
