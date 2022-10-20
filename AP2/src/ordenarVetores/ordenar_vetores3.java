import javax.swing.JOptionPane;

public class ordenar_vetores3 {

        public static void main(String[] args) {
            int num;
            int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
            int vetor[] = new int[tam];
            for(int i=0 ; i<vetor.length ; i++)		{
                vetor[i] = (int)(Math.random()*20);
            }
            System.out.println("Antes da ordenação:");
            for(int i=0 ; i<vetor.length ; i++)		{
                System.out.print(vetor[i] + " ");
            }
            ordenaParImpar(vetor);
            System.out.println("\nDepois da ordenação:");
            for(int i=0 ; i<vetor.length ; i++)		{
                System.out.print(vetor[i] + " ");
            }
            ordenaPar(vetor, localizarIndiceImpar(vetor));
            System.out.println("\nDepois da ordenação dos pares:");
            for(int i=0 ; i<vetor.length ; i++)		{
                System.out.print(vetor[i] + " ");
            }
            System.out.println("\nPrimeiro Impar: "+localizarIndiceImpar(vetor));
        }

        public static int localizarIndiceImpar(int vetor[]){

            int primeiro=0;

            for (int i=0; i<vetor.length;i++){

                if(vetor[i]%2!=0){

                    primeiro=i;
                    break;
                }


            }




            return(primeiro);
        }

        public static void ordenaParImpar (int [] vetor) {
            int aux = 0;
            // Fase de Ordenação
            for (int i = 0; i < vetor.length - 1; i++) {
                for (int j = 0; j < vetor.length - i - 1; j++) {
                    // Troca dos Elementos
                    if (vetor[j]%2==1 ) {
                        aux = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = aux;
                    }
                }
            }
        }

        public static void ordenaPar (int [] vetor, int indice) {
            int aux = 0;
            // Fase de Ordenação
            for (int i = 0; i < indice; i++) {
                for (int j = 0; j < indice - i - 1; j++) {
                    // Troca dos Elementos
                    if (vetor[j] > vetor[j+1]) {
                        aux = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = aux;
                    }
                }
            }
        }
    }
