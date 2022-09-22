import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        int n=0;
        int qtd=0;

        Scanner sc= new Scanner(System.in);

        int vetor[]= new int [8];

        for (int i=0;i<vetor.length;i++){

            System.out.println("De o valor para o vetor "+i);
            vetor[i]= sc.nextInt();

        }

        System.out.println("De um numero para buscas");
        n=sc.nextInt();

        for (int i=0;i<vetor.length;i++){

            if(n==vetor[i]){

                System.out.println("O numero se encontra na posicao: "+i);
                qtd++;

            }

        }

        if(qtd>0){

            System.out.println("O numero se encontra "+qtd+" vez(es)");
        }
        else {

            System.out.println("O numero nao existe dentro do vetor");
        }


    }
}
