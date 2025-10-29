public class ContaBancariaTest
{
    public static void main(String [] args)
    {
        ContaBancaria c1 = new ContaBancaria("Jonas", 100);
        
        boolean resultadoDoDeposito = c1.depositar(1000);
        
        mostrarMensagemDoDeposito(resultadoDoDeposito);
        
        boolean resultadoDoLevantamento = c1.levantar(1000);
        
        mostrarMensagemDoLevantamento(resultadoDoLevantamento);
    
        System.out.println(c1.getSaldo());
    }

    public static void mostrarMensagemDoDeposito(boolean resultadoDaOperacao)
    {
        if(resultadoDaOperacao)
        {
            System.out.println("Deposito Concluido com Sucesso");
        }
        else
        {
            System.out.println("Deposito Não pode ser concluido");
        }
    }
    
    public static void mostrarMensagemDoLevantamento(boolean resultadoDaOperacao)
    {
        if(resultadoDaOperacao)
        {
            System.out.println("Levantamento Concluido com Sucesso");
        }
        else
        {
            System.out.println("Levantamento Não pode ser concluido");
        }
    }
}