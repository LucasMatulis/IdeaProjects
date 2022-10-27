package Classes_Objetos;


import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Conta minhaconta= new Conta();

        Conta meuSonho;
        meuSonho = new Conta();
        System.out.println("Digite o saldo da conta Sonho");
        meuSonho.setSaldo(sc.nextDouble());

        System.out.println("Digite o saldo da conta");
        minhaconta.setSaldo(sc.nextDouble());
        System.out.println("Digite o Titular da conta");
        minhaconta.setTitular(sc.next());
        System.out.println("Digite o numero da conta");
        minhaconta.setNumero(sc.nextInt());

        System.out.println("Conta: " + minhaconta.getNumero()+ "\nTitular: "+minhaconta.getTitular()+"\nSaldo atual: "+minhaconta.getSaldo());


        System.out.println("Quanto precisa Sacar??");
        boolean consegui = minhaconta.saca(sc.nextDouble());
        if (consegui) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }

        System.out.println("Quanto deseja depositar");
        minhaconta.depositar(sc.nextDouble());

        System.out.println("Saldo total da conta: "+minhaconta.getSaldo());

        System.out.println("Quanto deseja transferir para conta sonho?");
        minhaconta.transfere(meuSonho,sc.nextDouble());

        System.out.println("O saldo da sua conta é: "+minhaconta.getSaldo()+"\nO saldo da sua conta sonho é: "+meuSonho.getSaldo());

    }
}
