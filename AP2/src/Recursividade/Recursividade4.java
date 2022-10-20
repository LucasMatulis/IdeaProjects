import java.util.Scanner;

public class Recursividade4 {

    public static int BuscanBinaria (int v[],int x){

        int i,m,f;

        i=0;f=v.length-1;

        while (i<=f){

            m=(i+f)/2;

            if(v[m]==x)
                return m;
            if(x<v[m])
                f=m-1;
            else
                i=m+1;
        }

        return -1;


    }

    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        int v[]={1,2,3,4,5,6,7,8,9};

        System.out.println("Digite o numero para busca");
        int n= sc.nextInt();

        System.out.println("O numero se encontra no indice: "+BuscanBinaria(v,n));

    }
}
