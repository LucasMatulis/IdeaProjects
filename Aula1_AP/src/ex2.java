import java.util.Scanner;

public class ex2 {


    public static int maior(int m[][]){
        int maior=Integer.MIN_VALUE;

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(m[i][j]>maior) {

                    maior=m[i][j];

                }


            }


        }



        return maior;
    }

    public static void main (String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("De o numero de linhas");
        int linhas= sc.nextInt();
        System.out.println("De o numero de colunas");
        int colunas= sc.nextInt();


        int matriz[][]=new int [linhas][colunas];

        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.println("De o numero do elemento "+i+"-"+j);
                matriz[i][j]= sc.nextInt();


            }


        }

        System.out.println("O maior numero da matriz é: "+maior(matriz));





    }
}
