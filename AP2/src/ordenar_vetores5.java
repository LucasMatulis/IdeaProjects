public class ordenar_vetores5 {

    public static void ordenar(int vetor[]){


        for (int i = 1; i < vetor.length; i++){
            int j = i;
            int x = vetor[j];
            while (j > 0 && x%2==0) {
                vetor[j] = vetor[j-1];
                j--;
            }
            vetor[j] = x;
        }



    }

    public static void main(String[] args) {
        int vetor[]={1,3,5,7,2,4,6,8};

        ordenar(vetor);

        for (int j = 0; j < vetor.length; j++) {

            System.out.print("\t"+vetor[j]);
        }

    }
}
