
import javax.swing.*;

public class ex2 {

    public static int binario (int n){

        int binario;
        if(n==0)
            return 0;
        else
            return(binario=n%2+10*(binario(n/2)));


    }

    public static char[] push(String nome) {

        char pilha[]= nome.toCharArray();

        for (int i=0;i<pilha.length;i++){

            System.out.println(pilha[i]);

        }

        return pilha;

    }



    public static void main(String[] args) {
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Informe o numero para ser transformado em binario"));
        String numero2= Integer.toString(binario(numero));

        push(numero2);





    }
}
