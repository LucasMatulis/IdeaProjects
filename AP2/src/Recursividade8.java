import java.util.Scanner;

public class Recursividade8 {
    public static int binario (int n){

        int binario;
        if(n==0)
            return 0;
        else
            return(binario=n%2+10*(binario(n/2)));


    }


    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        System.out.println("De um numero para ser convertido em binario");
        int n=sc.nextInt();

        System.out.print(binario(n));

    }
}
