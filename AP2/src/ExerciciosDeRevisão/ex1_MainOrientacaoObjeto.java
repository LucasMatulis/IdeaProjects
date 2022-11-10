package ExerciciosDeRevisão;

import javax.swing.*;

public class ex1_MainOrientacaoObjeto {
    public static void main(String[] args) {
        int qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios"));
        float total=0;
        int menor850=0;
        float maior=0;
        ex1_OrientacaoObjeto Funcionarios[]=new ex1_OrientacaoObjeto[qtd];

        for (int i=0;i<qtd;i++){
            ex1_OrientacaoObjeto novo= new ex1_OrientacaoObjeto();
            novo.setNome(JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"° funcionario"));
            novo.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salario")));

            total+=novo.getSalario();

            if(novo.getSalario()<850)
                menor850++;

            if(maior<novo.getSalario())
                maior=novo.getSalario();

            Funcionarios[i]=novo;
        }

        for (int i=0;i<qtd;i++){
            System.out.println(Funcionarios[i]);
        }

        System.out.println(maior);
        System.out.println(menor850);
        System.out.println(total/qtd);

    }
}
