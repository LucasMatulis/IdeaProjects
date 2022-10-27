package Classes_Objetos;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return  numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return  titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return  saldo;
    }

    void depositar(double valor) {

        this.saldo+=valor;
    }

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }


    void transfere(Conta destino, double valor) {

        if(this.saldo>valor) {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
        }
        else
            System.out.println("Saldo insuficiente!");
    }

}
