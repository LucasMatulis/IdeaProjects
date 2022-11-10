package ExerciciosDeRevisão;

import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        float salarios[]=new float[10];
        float maior=Float.MIN_VALUE;
        int menores=0;
        float media=0;

        for (int i=0;i<salarios.length;i++){

            salarios[i]= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do "+(i+1)+"° salario"));

            media+=salarios[i];

            if(salarios[i]>maior)
                maior=salarios[i];

            if(salarios[i]<850)
                menores++;

        }

        System.out.println("A media dos salarios é: "+(media/salarios.length));
        System.out.println("O maior salario é: "+maior);
        System.out.println("A quantidade de salarios menores que 850 é: "+menores);



    }
}
