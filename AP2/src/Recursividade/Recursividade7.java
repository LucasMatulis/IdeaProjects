import java.util.Scanner;

public class Recursividade7 {

    public static int potencia (int n, int n2){

        if(n2==1)
            return n;
        else {
            return n * potencia(n, n2 - 1);
        }


    }


    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        System.out.println("De um numero para ser elevado");
        int n=sc.nextInt();

        System.out.println("A quantidade de vezes que sera elevado");
        int n2=sc.nextInt();

        System.out.println(potencia(n,n2));

    }
}
