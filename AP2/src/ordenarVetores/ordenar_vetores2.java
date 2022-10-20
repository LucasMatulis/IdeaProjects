public class ordenar_vetores2 {

    public static void bubbleSort(int[] vetor) {
        int aux = 0;

        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 0; j < vetor.length-i-1; j++) {


                if(vetor[j]%2==0 && vetor[j+1]%2==0 && vetor[j] > vetor[j + 1]){

                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }

                if(vetor[j]%2!=0 && vetor[j+1]%2!=0 && vetor[j] < vetor[j+1]){

                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }

                if (vetor[j]%2!=0) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {

        int vetor []={5,2,1,4,0,9};

        bubbleSort(vetor);

        for (int i=0;i<vetor.length;i++){

            System.out.print("\t"+vetor[i]);

        }

    }
}
