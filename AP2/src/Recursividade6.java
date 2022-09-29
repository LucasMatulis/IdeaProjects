import java.util.Scanner;

public class Recursividade6 {

    public static int fibonacci(int n){


        if(n>1)
            return fibonacci(n - 1) + fibonacci(n - 2);
        else
            return n;




    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("De a posicao do numero que deseja na ordem: ");
        int n= sc.nextInt();
        int n2=n;

        for(int i=0;i<=n2;i++) {
            System.out.print(fibonacci(n)+"\t");
            n--;
        }

    }
}
