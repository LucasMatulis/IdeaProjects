import javax.swing.*;

public class ex4 {

    public static void main(String[] args) {

        int tamanho= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios"));

        ex3_Funcionario funcionarios[]= new ex3_Funcionario[tamanho];

        float menor= Float.MAX_VALUE;
        float maior= Float.MIN_VALUE;
        float media=0;


        for (int i=0;i<tamanho;i++){
            ex3_Funcionario funcionario= new ex3_Funcionario();
            funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario "+(i+1)));
            funcionario.setId(JOptionPane.showInputDialog("Digite o ID do funcionario "+(i+1)));
            funcionario.setEndereço(JOptionPane.showInputDialog("Digite o endereço do funcionario "+(i+1)));
            funcionario.setComplementoEndereco(JOptionPane.showInputDialog("Digite o complemento do endereço do funcionario "+(i+1)));
            funcionario.setNumeroEndereco(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do endereço do funcionario "+(i+1))));
            funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do funcionario "+(i+1))));


            if(funcionario.getSalario()>maior)
                maior=funcionario.getSalario();

            if(funcionario.getSalario()<menor)
                menor=funcionario.getSalario();


            media+=funcionario.getSalario();

            funcionarios[i]=funcionario;

        }

        for(int i=0;i<tamanho;i++){
            System.out.println("Funcionario "+(i+1));
            System.out.println(funcionarios[i]);

        }

        System.out.println("O maior salario é: "+maior);
        System.out.println("O menor salario é: "+menor);
        System.out.println("A media dos salarios é: "+media/tamanho);


    }
}
