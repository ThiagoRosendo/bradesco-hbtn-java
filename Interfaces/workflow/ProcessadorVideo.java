import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo(){
        this.canais = new ArrayList<CanalNotificacao>();
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
