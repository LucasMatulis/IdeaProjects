import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int vetor[]= new int [8];
        int qtd=0;
        int soma30=0;
        int soma=0;

        for (int i=0;i<vetor.length;i++){

            System.out.println("De o valor para o vetor "+i);
            vetor[i]= sc.nextInt();

            soma+=vetor[i];

            if(vetor[i]>30){
                soma30+=vetor[i];
                qtd++;
            }


        }
        System.out.println("A quantidade de numeros maiores que 30 e: "+qtd);
        System.out.println("A soma de todos os numeros maiores de 30 e: "+soma30);
        System.out.println("A soma de todos os numeros e: "+soma);


    }
}
