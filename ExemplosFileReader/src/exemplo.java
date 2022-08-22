import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exemplo  {

    public static void main (String[]args) throws IOException {

        FileReader arquivo=null;
        try{

            arquivo= new FileReader("arquivo.txt");
        }
        catch (FileNotFoundException e){

            System.out.println("Arquivo não encontrado");

        }

        BufferedReader leBufferizado= new BufferedReader(arquivo);
        String linha ="";
        linha= leBufferizado.readLine();
        System.out.println(linha);
        leBufferizado.close();
        arquivo.close();



    }

}
