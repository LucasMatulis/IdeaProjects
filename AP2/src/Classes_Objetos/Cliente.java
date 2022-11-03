package Classes_Objetos;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
        
	public Cliente() {
			}
	
	public Cliente(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "\nCliente " + nome + ", "
		+ "Sobrenome="+ sobrenome + ", CPF=" + cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
