import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void exibirDetalhes(){
        System.out.println("nome: "+nome);
        System.out.println("id: "+id);
        System.out.println("livros emprestados: "+livrosEmprestados);
    }
    public void adicionarLivro(Livro livro){
        if(livrosEmprestados.size() < 3)
            livrosEmprestados.add(livro);
        else
            System.out.println("o limite de livros é 3");
    }
    public void removerLivro(Livro livro){
        livrosEmprestados.remove(livro);
    }
}
