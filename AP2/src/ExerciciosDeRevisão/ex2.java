package ExerciciosDeRevisão;

import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {

        int qtd= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendedores"));

        int qtdVendido[]=new int[qtd];
        String descricao[]= new String[qtd];
        float preco[]= new float[qtd];
        float totalVendido[]= new float [qtd];

        int qtdVendida=0;
        int totalVendas=0;

        for (int i=0;i<qtd;i++){
            qtdVendido[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos vendidos pelo "+(i+1)+"° vendedor"));
            descricao[i]=JOptionPane.showInputDialog("Digite a descrição do produto do "+(i+1)+"° vendedor");
            preco[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do produto do "+(i+1)+"° vendedor"));

            qtdVendida+=qtdVendido[i];

            totalVendido[i]=qtdVendido[i]*preco[i];

            totalVendas+=totalVendido[i];
        }

        for (int i=0;i<qtd;i++){
            System.out.println("O valor total de vendos do "+(i+1)+"° vendedor é: "+totalVendido[i]);

        }

        System.out.println("Total de peças vendidas: "+qtdVendida);
        System.out.println("Valor total de vendas: "+totalVendas);

    }
}
