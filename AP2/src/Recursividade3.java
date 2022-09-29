import java.util.Scanner;

public class Recursividade3 {

    public static void ordem (int n){

        if(n==0)
            return;
        System.out.println(n+" ");

        ordem(n-1);

    }


    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        System.out.println("De um numero para mostrar a ordem");
        int n=sc.nextInt();

        ordem(n);

    }
}
