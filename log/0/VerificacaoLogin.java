import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerificacaoLogin {


    // Inicialização do logger
    private static final Logger logger = LoggerFactory.getLogger(VerificacaoLogin.class);


    public static void main(String[] args) {
        // Simulação de entradas do usuário
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";


        // Tentativas de login
        realizarLogin("admin", "12345", usuarioCorreto, senhaCorreta); // Login correto
        realizarLogin("admin", "senhaErrada", usuarioCorreto, senhaCorreta); // Senha incorreta
        realizarLogin("usuarioDesconhecido", "12345", usuarioCorreto, senhaCorreta); // Usuário desconhecido
    }


    public static void realizarLogin(String usuario, String senha, String usuarioCorreto, String senhaCorreta) {
        if (!usuario.equals(usuarioCorreto)) {
            log.error("Usuário desconhecido.");
        } else if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            log.info("Login efetuado com sucesso!");
        } else if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)){
            log.warn("Senha incorreta!");
        }
    }
}