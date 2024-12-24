public class Livro {
    private String titulo;
    private String autor;
    public String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void exibirDetalhes(){
        System.out.println("titulo: "+titulo);
        System.out.println("autor: "+ autor);
        System.out.println("código do livro: "+isbn);
        System.out.println("disponivel: "+disponivel);
    }
    public void emprestar(){
        if(disponivel) {
            System.out.println("você pegou esse livro emprestado");
            this.disponivel = false;
        }
        else
            System.out.println("livro indisponivel");
    }
    public void devolver(){
        System.out.println("você devolveu esse livro");
        this.disponivel = true;
    }
}
