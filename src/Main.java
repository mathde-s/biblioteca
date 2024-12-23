import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        while (true) {
            System.out.println("Bem vindo a biblioteca! escolha uma opção: \n1- Cadastrar livro | 2- Cadastrar uuário | 3- Realizar empréstimo | 4- Realizar devolução | 5- Exibir livros disponiveis | 6- Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("digite o titulo: ");
                    String nome = scanner.next();
                    System.out.println("digite o autor: ");
                    String autor = scanner.next();
                    System.out.println("digite o ISBN: ");
                    String isbn = scanner.next();
                    biblioteca.cadastrarLivro(new Livro(nome, autor, isbn));
                    break;
                case 2:
                    System.out.println("digite o nome do usuário: ");
                    String nomeUsuario = scanner.next();
                    System.out.println("digite o id");
                    int idUsuario = scanner.nextInt();
                    biblioteca.cadastarUsuario(new Usuario(nomeUsuario, idUsuario));
                    break;
                case 3:
                    System.out.println("digite o ISBN do livro: ");
                    String isbnEmprestimo = scanner.next();
                    System.out.println("digite o id do usuário: ");
                    int idEmprestimo = scanner.nextInt();
                    biblioteca.realizarEmprestimo(isbnEmprestimo, idEmprestimo);
                    break;
                case 4:
                    System.out.println("digite o ISBN: ");
                    String isbnDevolucao = scanner.next();
                    System.out.println("digite o id do usuário");
                    int idDevolucao = scanner.nextInt();
                    biblioteca.realizarDevolucao(isbnDevolucao, idDevolucao);
                    break;
                case 5:
                    biblioteca.exibirLivrosDisponiveis();
                    break;
                case 6:
                    System.out.println("saindo ...");
                    return;

                default:
                    System.out.println("opção inválida");
            }
        }
    }
}