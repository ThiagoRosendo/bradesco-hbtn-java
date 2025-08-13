import atividades.*;

public class MaquinaWorkflow {

    private Workflow workflow;

    public void executar(Workflow workflow) {
        for (Atividade atividade : workflow.getAtividades()){
            atividade.executar();
        }
    }
}
