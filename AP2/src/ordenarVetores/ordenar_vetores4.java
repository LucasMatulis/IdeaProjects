public class ordenar_vetores4 {

    public static void ordenar(int vetor[]){


           for (int i = 1; i < vetor.length; i++){
               int j = i;
               int x = vetor[j];
               while (j > 0 && x < vetor[j-1]) {
                   vetor[j] = vetor[j-1];
                   j--;
               }
               vetor[j] = x;
           }



       }

    public static void main(String[] args) {
        int vetor[]={3,5,9,11,15,17,19,6};

        ordenar(vetor);

        for (int j = 0; j < vetor.length; j++) {

            System.out.print("\t"+vetor[j]);
        }

    }
}
