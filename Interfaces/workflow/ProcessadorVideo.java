import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    private List<CanalNotificacao> canais;

    public ProcessadorVideo(){
        this.canais = new ArrayList<>();
    }
    
    public void registrarCanal(CanalNotificacao canalNotificacao){
        this.canais.add(canalNotificacao);
    }

    public void processar(Video video){
        for (CanalNotificacao canalNotificacao : canais) {
            Mensagem mensagem = new Mensagem(String.format("%s - %s", video.getArquivo(), video.getFormato()), TipoMensagem.LOG);
            canalNotificacao.notificar(mensagem);
        }
    }
}
