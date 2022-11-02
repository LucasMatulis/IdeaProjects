package ADOMegaSena;

import java.util.Random;
import java.util.Scanner;

public class ADOMegasena {

    public static void main(String[] args) {


        int numero;
        int[] num = new int[6];
        int numerosTentativas[]= new int [15];
        int quantidade=0;
        int quantidadeNumeros=0;
        int totalAcertos=0;
        Random r = new Random();
        Scanner sc= new Scanner(System.in);


        for(int i=0; i<num.length; i++){
            numero = r.nextInt(60) + 1;

            for(int j=0; j<num.length; j++){

                if(numero == num[j] && j != i){

                    numero = r.nextInt(60) + 1;
                }else{

                    num[i] = numero;
                }
            }
        }

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+"  ");
        }

        System.out.println("Digite a quantidade de vezes que quer jogar: ");
        quantidade=sc.nextInt();


        for (int i=0; i<quantidade;i++){

           do{

               System.out.println("Digite a quantidade de numeros que quer colocar:");
               quantidadeNumeros=sc.nextInt();

               if(quantidadeNumeros<6 ||quantidadeNumeros>15)
                   System.out.println("Quantidade invalida!!!");

           }while (quantidadeNumeros<6 || quantidadeNumeros>15);

           for (int j=0;j<quantidadeNumeros;j++){

               System.out.println("Digite o valor do "+(j+1)+"° numero");
               numero = sc.nextInt();

               for(int g=0; g<quantidadeNumeros; g++){

                   if(numero == numerosTentativas[g] && g != j){

                       System.out.println("Numero ja digitado, digite um novo numero de novo!!!");
                       numero=sc.nextInt();

                   }else{

                       numerosTentativas[j] = numero;
                   }
               }
           }

           for(int h=0;h<quantidadeNumeros;h++){

               for(int k=0;k<num.length;k++){

                   if(numerosTentativas[h]==num[k]){

                       totalAcertos++;
                   }


               }


           }
        }


        if(totalAcertos>=4)
            System.out.println("Parabens voce acertou a quantidade de numeros exatos");
        else
            System.out.println("Voce infelizmente não conseguiu acertar a quantidade necessaria");

        }

    }
