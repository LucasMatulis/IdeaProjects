import javax.swing.*;
import java.util.Scanner;

public class ex1 {




    public static void main(String args[]){
        int linhas  = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de linhas da Matriz: "));
        int colunas  = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de colunas da Matriz: "));
        int matriz1[][] = new int[colunas][linhas];
        int matriz2[][] = new int[linhas][colunas];

        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                matriz1[c][l] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
                System.out.print(matriz1[c][l] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int c=0; c<colunas; c++){
            for(int l=0; l<linhas; l++){
                matriz2[l][c] = matriz1[c][l];
                System.out.print(matriz2[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
