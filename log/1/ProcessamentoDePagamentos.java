import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final java.util.logging.Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);


    public static void main(String[] args) {

    logger.info("ProcessamentoDePagamentos -- Iniciando o processamento do pagamento 1");
    Thread.sleep(1000);
    logger.error("ProcessamentoDePagamentos -- Erro ao processar o pagamento 1: Falha na transação.");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Iniciando o processamento do pagamento 2");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Pagamento 3 processado com sucesso.");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Iniciando o processamento do pagamento 3");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Pagamento 3 processado com sucesso.");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Iniciando o processamento do pagamento 4");
    Thread.sleep(1000);
    logger.error("ProcessamentoDePagamentos -- Erro ao processar o pagamento 4: Falha na transação.");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Iniciando o processamento do pagamento 5");
    Thread.sleep(1000);
    logger.warn("ProcessamentoDePagamentos -- Pagamento 5 está pendente. Aguardando confirmação.");
    Thread.sleep(1000);
    logger.info("ProcessamentoDePagamentos -- Processamento de pagamentos concluído.");
    }
}