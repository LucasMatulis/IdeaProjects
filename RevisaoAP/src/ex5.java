import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String nomes[]= new String[3];

        for(int i=0; i<nomes.length;i++){
            do{
                System.out.println("Digite um nome com menos de 20 letras");
                nomes[i]=sc.next();


            }while (nomes[i].length()>20);


        }

        for(int i=0; i<nomes.length;i++){

            System.out.print(nomes[i]+"\t");


        }

    }
}
