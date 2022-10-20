import java.util.Scanner;

public class Recursividade5 {


    public static int fibonacci(int n){


        if(n>1) {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        else
            return n;




    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("De a posicao do numero que deseja na ordem: ");
        int n= sc.nextInt();

        System.out.println(fibonacci(n));

    }
}
