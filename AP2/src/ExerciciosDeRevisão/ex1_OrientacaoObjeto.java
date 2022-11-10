package ExerciciosDeRevisão;

public class ex1_OrientacaoObjeto {

    private float salario;
    private String nome;


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ex1_OrientacaoObjeto(){

        super();

    }

    @Override
    public String toString(){

        return "Funcionario"+nome+"\t Salario="+salario;


    }

}
