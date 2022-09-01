import java.util.Random;
import java.util.Scanner;

public class ordenar_vetores {

    public static void bubbleSort(int[] vetor) {
        int aux = 0;

        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 0; j < vetor.length-i-1; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;


                }


            }


        }

    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc= new Scanner(System.in);

        System.out.println("De o lenght do vetor: \n");
        int n= sc.nextInt();

        int vetor[]= new int[n];

        for (int j = 0; j < vetor.length; j++) {

            vetor[j]=random.nextInt(101);
        }



        bubbleSort(vetor);

        for (int j = 0; j < vetor.length; j++) {

            System.out.print("\t"+vetor[j]);
        }

        System.out.println("\nDe um numero para pesquisa: ");
        int n1= sc.nextInt();
        int cont=0;

        for (int j = 0; j < vetor.length; j++) {

            if(n1==vetor[j]){
                System.out.println("O mesmo numero se encontra na posicao: "+j);
                cont++;
            }

        }
            System.out.println("O numero é encontrado "+cont+" vez(es)");
    }
}
