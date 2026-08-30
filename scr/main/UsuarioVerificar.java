//Aqui vamos fazer a verificação do usuario, se ele ja existe ou nao, e se ele existe, vamos verificar se a senha esta correta.
public class UsuarioVerificar {

    private Usuario usuario;

    public UsuarioVerificar(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean verificarUsuario(String email, String senha) {

        if (usuario.getEmail().equals(email)
                && usuario.getSenha().equals(senha)) {

            return true;
        }

        return false;
    }
}