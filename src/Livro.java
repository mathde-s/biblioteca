public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }
    public void exibirDetalhes(){
        System.out.println("titulo: "+titulo);
        System.out.println("autor: "+ autor);
        System.out.println("código do livro: "+isbn);
        System.out.println("disponivel: "+disponivel);
    }
    public void emprestar(String isbn){
        this.disponivel = false;
    }
    public void devolver(String isbn){
        this.disponivel = true;
    }
}
