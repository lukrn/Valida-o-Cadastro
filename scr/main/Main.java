//Sistema onde o usuario pode cadastrar digitando suas informaçoes de login, e apos realizar o login considerando suas informações cadastradas, o sistema ira verificar se as informações digitadas são iguais as cadastradas, caso sejam iguais o usuario sera logado com sucesso, caso contrario o sistema ira informar que o login falhou.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CADASTRO
        System.out.println("=== CADASTRO ===");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        Usuario usuario = new Usuario(nome, email, senha);

        // LOGIN
        System.out.println("\n=== LOGIN ===");

        System.out.print("Digite seu email: ");
        String emailLogin = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaLogin = sc.nextLine();

        UsuarioVerificar verificar = new UsuarioVerificar(usuario);

        boolean loginSucesso =
                verificar.verificarUsuario(emailLogin, senhaLogin);

        if (loginSucesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Email ou senha incorretos.");
        }

        sc.close();
    }
}