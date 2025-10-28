


//Use o método exibirInformacoes() para mostrar todos os dados de ambos os livros.
public class BibliotecaTeste
{
    public static void main(String[] args){
       //Crie pelo menos dois objetos da classe Livro usando o construtor. 
       Livro livro1 = new Livro("Animal Farm", "George Orwell", 1945, "978019");
       Livro livro2 = new Livro("No Longer Human", "Osamu Dazai", 1948, "9584987");
       //Use os setters para alterar o título de um dos livros.
       livro1.setTitulo("A quinta dos animais");
       //Use os getters para imprimir apenas o autor e o ISBN do outro livro.
       System.out.println("Titulo: " + livro2.getAutor() + " ISBN: " + livro2.getIsbn());
       // chamar metodo exibirInformacoes()
       livro1.exibirInformacoes();
       livro2.exibirInformacoes();
       
     }   //Use o método exibirInformacoes() para mostrar todos os dados de ambos os livros
}
