import java.util.Scanner;

public class ex1 {

    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o lenght do vetor: ");
        int n=sc.nextInt();

        int vetor[]= new int [n];

        for (int i=0;i< vetor.length;i++){

            System.out.println("Digite o valor do vetor: "+i);
            vetor[i]=sc.nextInt();

        }
        for (int i=0;i< vetor.length;i++){

            System.out.println(vetor[i]);

        }


    }
}
