import java.util.ArrayList;

public class GestaoAlunos {

    private ArrayList<Aluno> alunos;

    public void adicionarAluno(){
        Aluno aluno = new Aluno();
        alunos.add(aluno);
    }

    public void excluirAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void buscarAluno(){

    }

    public void listarAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }

    }
    
}
