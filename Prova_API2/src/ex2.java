import javax.swing.*;

public class ex2 {

    public static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++){
            int j = i;
            int x = v[j];
            while (j > 0 && x < v[j-1]) {
                v[j] = v[j-1];
                j--;
            }
            v[j] = x;
        }
    }

    private static boolean inserir(int num, int[] vetor, int pos) {
        for(int i=0; i<vetor.length; i++) {
            if(vetor[i]==num && i!=pos)
                return true;
        }
        return false;
    }

    public static int buscaBinaria(int v[], int x){
        int i, m, f;
        i = 0;
        f = v.length-1;
        while (i <= f) {
            m = (i + f) / 2;
            if (v[m] == x)
                return m;
            if (x < v[m]) // esquerda
                f = m - 1;
            else // x > v[m] - direita
                i = m + 1;
        }
        return -1;
    }




    public static void main(String args[]){

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int aux;
        int busca;

        int vetor[]= new int[tamanho];

        for (int i=0;i<tamanho;i++){

            vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor "+(i+1)));
            while(inserir(vetor[i], vetor,i))
                vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor "+(i+1)));



        }

        System.out.println("Vetor desordenado: ");
        for(int i = 0; i<tamanho; i++){
            System.out.print("\t "+vetor[i]);
        }
        System.out.println(" ");

        insertionSort(vetor);

        busca=buscaBinaria(vetor,Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para ser buscado")));

        if(busca!=-1)
            System.out.println("O numero se encontra na posicao "+(busca+1));
        else
            System.out.println("O numero não se encontra no vetor");

        System.out.println("Vetor ordenado:");
        for(int i = 0; i<tamanho; i++){
            System.out.print("\t"+vetor[i]);
        }

    }
}
