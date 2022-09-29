import java.util.Scanner;

public class Recursividade2 {

    public static int fatorial (int n){

        if(n==0){

            return 1;
        }
        else{
            return n* fatorial(n-1);
        }
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        System.out.println("De um numero para ser feito o fatorial");
        int n=sc.nextInt();

        System.out.println(fatorial(n));

    }
}
