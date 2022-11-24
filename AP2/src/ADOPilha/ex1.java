
import javax.swing.*;
import java.lang.String;

public class ex1 {

    int topo = -1;

    public static char[] push(char elemento[]) {

            int topo = elemento.length;
            char pilha[]=new char[elemento.length];
            for(int i=0;i<elemento.length;i++){

                topo--;

                pilha[i]=elemento[topo];


            }

            return pilha;

    }



    public static void main(String[] args) {
        String nome= JOptionPane.showInputDialog("Digite a palavra");
        char letras[]= nome.toCharArray();

        System.out.println("Antes de inverter:");
        for (int i=0;i<letras.length;i++)
            System.out.println(letras[i]);

        letras=push(letras);

        System.out.println("Depois de inverter:");
        for (int i=0;i<letras.length;i++)
            System.out.println(letras[i]);

    }
}
