public class ex3 {

    public static void main(String[] args) {
        int vetor[]= new int [10];
        int soma=0;

        for (int i=0;i<vetor.length;i++){

            vetor[i]= i+10;
            soma+= vetor[i];
            System.out.print(vetor[i]+"\t");

        }
        System.out.println();

        System.out.println("O valor da soma é: "+soma);
    }
}
