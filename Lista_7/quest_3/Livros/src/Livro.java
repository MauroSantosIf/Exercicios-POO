// autor, editora, ISBN, título, Ano de Edição.

public class Livro{

    private static int isbnIncrementador = 100;

    public String autor;
    public String editora;
    public int isbn;
    public String titulo;
    public String anoEdicao;

    public Livro(String autor, String editora, String titulo, String anoEdicao){
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbnIncrementador++;
        this.titulo = titulo;
        this.anoEdicao = anoEdicao;
    }

    public String getAutor(){
        return this.autor;
    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAnoEdicao(){
        return this.anoEdicao;
    }

    public String toString(){
        return "Autor: " + this.autor + "\n" +
            "Editora: " + this.editora + "\n" +
            "ISBN: " + this.isbn + "\n" +
            "Título: " + this.titulo + "\n" +
            "Ano de Edição: " + this.anoEdicao + "\n";
    }

}

