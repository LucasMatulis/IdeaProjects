package ExerciciosDeRevisão;

import javax.swing.*;

public class ex4 {
    public static void main(String args[]){

        int tamanho=Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));

        int[] vet = new int[tamanho];
        int aux = 0;

        for (int i=0;i<tamanho;i++){

            vet[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor "+(i+1)));

            for (int j=0;j<tamanho;j++){
                if(i!=j)
                  if(vet[i]==vet[j])
                    vet[i]= Integer.parseInt(JOptionPane.showInputDialog("Numero ja esta dentro do vetor insira um novo"));
            }


        }

        System.out.println("Vetor desordenado: ");
        for(int i = 0; i<tamanho; i++){
            System.out.println(" "+vet[i]);
        }
        System.out.println(" ");

        for(int i = 0; i<tamanho; i++){
            for(int j = 0; j<tamanho-1; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(int i = 0; i<5; i++){
            System.out.println(" "+vet[i]);
        }
    }
}
