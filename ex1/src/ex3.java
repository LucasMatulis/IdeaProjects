public class ex3 {
    public static void main(String arg[]){

        int vetor[]= new int [10];
        int vetor2[]= {10,11,12,13,14,15,16,17,18,19};
        int vetor3[]= new int [10];

        for (int i=0;i< vetor.length;i++){

            vetor[i]=(i+1)*2;
            vetor3[i]= vetor[i]+ vetor2[i];

        }

        for (int i=0;i< vetor.length;i++){

            System.out.println(vetor3[i]);

        }





    }
}
