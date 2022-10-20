package Classes_Objetos;

public class Programa {
    public static void main(String[] args) {
        Conta minhaconta= new Conta();

        Conta meuSonho;
        meuSonho = new Conta();
        meuSonho.saldo = 1500000;


        minhaconta.saldo = 1000.0;
        minhaconta.titular="Duke";
        minhaconta.numero=1234;

        System.out.println("Conta: " + minhaconta.numero+ "\nTitular: "+minhaconta.titular+"\nSaldo atual: "+minhaconta.saldo);

        minhaconta.saldo = 1000;
        boolean consegui = minhaconta.saca(2000);
        if (consegui) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }

        // deposita 500 reais
        minhaconta.depositar(500);
        System.out.println("Saldo total da conta: "+minhaconta.saldo);

        System.out.println("O saldo da sua conta é: "+minhaconta.saldo+"\nO saldo da sua conta sonho é: "+meuSonho.saldo);
    }
}
