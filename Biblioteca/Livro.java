
//titulo (String) – título do livro
//autor (String) – nome do autor
//anoPublicacao (int) – ano de publicação do livro
//isbn (String) – número ISBN do livro

public class Livro
{
    private String titulo;
    private String autor;
    private int anoPub;
    private String isbn;
    
    public Livro(String titulo, String autor, int anoPub, String isbn)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.isbn = isbn;
    }
      public String getTitulo(){
        return this.titulo;
    }
         public void setTitulo(String titulo){
        this.titulo = titulo;
    }
     public String getAutor(){
        return this.autor;
    }
         public void setAutor(String autor){
        this.autor = autor;
    }
     public int getAnoPub(){
        return this.anoPub;
    }
    public void setAnoPub(int anoPub){
        this.anoPub = anoPub;
    }
     public String getIsbn(){
        return this.isbn;
    }
         public void setIsbn(String isbn){
        this.isbn = isbn;
    }
     public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoPub);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("");
    }
}
