import java.util.Scanner;

public class Exercicio07 {

    static boolean soma(int m[][]){

        int row=0;
        int somaDP=0;
        int somaDS=0;
        int totalD=0;
        int somaLinha[]= new int [m.length];
        int totalL=0;
        int somaColuna[]= new int [m[0].length];
        int totalC=0;
        int totalM=0;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                somaLinha[i]+=m[i][j];

                somaColuna[j]+=m[j][i];

                if(i==j){
                    somaDP+=m[i][j];
                }

            }


        }



        for(int i=m.length-1; i>=0;i--){

            somaDS+=m[row][i];

            row++;
        }


        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < m[i].length; j++) {

               if(somaLinha[i]==somaLinha[j]){
                   totalL++;
               }

                if(somaColuna[i]==somaColuna[j]){
                    totalC++;
                }

            }


        }

        if(totalL==totalC){

            totalM=somaLinha[0];

        }

        if(somaDP==somaDS){

            totalD=somaDS;

        }

        if(totalD==totalM){


            return true;
        }
        else {

            return false;
        }
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De a dimensão da matriz");
        int dim = sc.nextInt();


        int matriz[][] = new int[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.println("De o numero do elemento " + i + "-" + j);
                matriz[i][j] = sc.nextInt();


            }


        }

        System.out.println("Resultado da matriz: "+soma(matriz));


    }
}
