import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
        ArrayList<Usuario> usuarios;
        ArrayList<Livro> livros;
        Scanner scanner = new Scanner(System.in);

        public Biblioteca(){
                this.usuarios = new ArrayList<>();
                this.livros = new ArrayList<>();
        }

        public void cadastrarLivro (Livro livro){
                livros.add(livro);
                System.out.println("livro cadastrado: "+livro.getTitulo());
        }
        public void cadastarUsuario (Usuario usuario){
                this.usuarios.add(usuario);
                System.out.println("usuário cadastrado: "+ usuario.getNome());
        }

        public void realizarEmprestimo (String isbn,int idUsuario){
                this.livros.remove(idUsuario);
        }
        public void realizarDevolucao(String isbn, int idUsuario){

        }
        public void exibirLivrosDisponiveis() {
                System.out.println("Livros disponíveis:");
                for (Livro livro : livros) {
                        if (livro.isDisponivel()) {
                                livro.exibirDetalhes();
                        }
                }
        }
        public Usuario buscarUsuario(int id) {
                for (Usuario usuario : usuarios) {
                        if (usuario.getId() == id)
                                return usuario;
                }
                System.out.println("Usuário não encontrado.");
                return null;
        }
        public Livro buscarLivro(String isbn) {
                for (Livro livro : livros) {
                        if (livro.getIsbn().equals(isbn))
                                return livro;
                }
                System.out.println("Livro não encontrado.");
                return null;
        }
}
