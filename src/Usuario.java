import java.util.ArrayList;

public class Usuarios {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuarios(String nome, int id, ArrayList<Livro> livrosEmprestados){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void exibirDetalhes(){
        System.out.println("nome: "+nome);
        System.out.println("id: "+id);
        System.out.println("livros emprestados: "+livrosEmprestados);
    }
    public void adicionarLivro(Livro livro){
        livrosEmprestados.add(livro);
    }
    public void removerLivro(Livro livro){
        livrosEmprestados.remove(livro);
    }
}
