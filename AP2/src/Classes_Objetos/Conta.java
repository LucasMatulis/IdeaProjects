package Classes_Objetos;

public class Conta {
    int numero;
    String titular;
    double saldo;

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
}
