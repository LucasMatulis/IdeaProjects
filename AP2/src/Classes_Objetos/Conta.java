package Classes_Objetos;

public class Conta {
	private int numero;
	Cliente titular;
	private double saldo; 
	
	//construtor alternativo
		public Conta(Cliente titular,  double saldo, int numero) {
			this.numero = numero;
			this.titular = titular;
			this.saldo = saldo;
		}
		
		public Conta() {}//construtor padrão

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void transferir(Conta destino, double valor) {
        if(this.saldo>valor) {
			this.saldo = this.saldo - valor;
	        destino.saldo = destino.saldo + valor;
        }
        else
        	System.out.println("Saldo insuficiente!");
    }
	
	public boolean sacar(double valor) {
        if(this.saldo  > valor) { 
        	this.saldo -=valor;
        	return true;
        }
        else{ 
        	return false;
        }
    }
	
	public void depositar(double valor) {
        this.saldo += valor;
    }
	
	public double sacarFuncao(double valor) {
       return (this.saldo -=valor);
    }
	
	@Override
	public String toString() {
		return "\nConta: " + this.getNumero() 
		+ this.titular +
		"\nSaldo atual: " + this.getSaldo();
	}
}