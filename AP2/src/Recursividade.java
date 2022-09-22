import java.util.Scanner;

public class Recursividade {

    public static int fatorial (int n){
        int fat=1;
        for(int termo=1;termo<=n;termo++){

            fat*=termo;

        }

        return fat;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        System.out.println("De um numero para ser feito o fatorial");
        int n=sc.nextInt();

        System.out.println(fatorial(n));

    }
}
