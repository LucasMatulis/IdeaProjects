import java.util.Scanner;

public class ex3 {

    static void soma(int m[][]){

        int row=0;
        int somaMA=0;
        int maiorM=Integer.MIN_VALUE;
        int menorM= Integer.MAX_VALUE;
        int somaME=0;
        int maior=Integer.MIN_VALUE;
        int menor= Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j]>maiorM) {

                    maiorM=m[i][j];

                }

                if (m[i][j]<menorM) {

                    menorM=m[i][j];

                }


            }


        }



            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (i == j) {

                        somaMA += m[i][j];
                        if(m[i][j]>maior){

                            maior=m[i][j];

                        }


                    }


                }


            }


            for(int i=m.length-1; i>=0;i--){

                somaME+=m[row][i];

                if(m[i][row]<menor){

                    menor=m[row][i];

                }

                row++;
            }



        System.out.println("O traço da diagonal principal matriz é : "+somaMA);
        System.out.println("O traço da diagonal secundaria matriz é : "+somaME);
        System.out.println("O maior numero da diagonal principal : "+maior);
        System.out.println("O menor numero da diagonal secundaria é : "+menor);
        System.out.println("O maior numero da matriz: "+maiorM);
        System.out.println("O menor numero da matriz : "+menorM);
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

        soma(matriz);


    }
}
