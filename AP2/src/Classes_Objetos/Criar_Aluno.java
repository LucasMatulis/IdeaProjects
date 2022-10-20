package Classes_Objetos;

public class Criar_Aluno {

    public static void main(String[] args) {

        Aluno aluno=new Aluno();
        aluno.Nome="Lucas";
        aluno.nota1=5;
        aluno.nota2=5;
        aluno.aprovado=false;

        if((aluno.nota1 + aluno.nota2)/2>6){
            aluno.aprovado=true;

        }

        System.out.println("Resultado se o aluno foi aprovado: "+aluno.aprovado);
    }
}
