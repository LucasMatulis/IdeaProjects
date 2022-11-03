package Classes_Objetos;
import javax.swing.JOptionPane;

public class CriaContaCliente {
	public static void main(String[] args) {
		Conta conta;
		
		int qtd = Integer.parseInt(
			JOptionPane.showInputDialog(
			"Digite a quantidade de contas a cadastrar:"));
		Conta contas[] = new Conta[qtd];
		
		for(int i=0 ; i<qtd ; i++) {
			Cliente c1 = new Cliente();
			c1.setNome(JOptionPane.showInputDialog(
					"Digite o nome do Titular:"));
			c1.setSobrenome(JOptionPane.showInputDialog(
					"Digite o sobrenome do Titular:"));
			c1.setCpf(JOptionPane.showInputDialog(
					"Digite o CPF do Titular:"));
			conta = new Conta();
			
			conta.titular = c1;
			
			conta.setSaldo(Double.parseDouble(
					JOptionPane.showInputDialog(
							"Digite saldo:")));
			conta.setNumero(Integer.parseInt(
					JOptionPane.showInputDialog(
							"Digite o número da conta:")));
			
			contas[i] = conta;
		}		
		for(int i=0 ; i<qtd ; i++) {
			System.out.println(contas[i]);
		}
	}
}