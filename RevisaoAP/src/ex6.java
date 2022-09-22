import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int meno= Integer.MAX_VALUE;
        System.out.println("De a quantidade de vetores");
        int n= sc.nextInt();
        int vetor[]= new int [n];
        float media=0;
        int qtd=0;

        for (int i=0;i<vetor.length;i++){

            System.out.println("De o valor para o vetor "+i);
            vetor[i]= sc.nextInt();
            media+= vetor[i];

            if(vetor[i]<meno){
                meno=vetor[i];

            }

            if(vetor[i]%5==0){
                qtd++;

            }

        }

        for (int i=0;i<vetor.length;i++){

            System.out.print(vetor[i]+"\t");

        }

        System.out.println();
        System.out.println("A quantidade de numeros divisiveis por 5 e: "+qtd);
        System.out.println("O menor numero do vetor e: "+meno);
        System.out.println("A media do vetor: "+(media/vetor.length));


    }
}
