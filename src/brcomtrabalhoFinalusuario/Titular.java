package brcomtrabalhoFinalusuario; 

public class Titular {
	private String nome;
	private String cpf;
	private String senha;
	private boolean possuiConta = false;
	private boolean senhaValidacao = false;
	private boolean cpfValidacao = false;
	
	//Verificacao de conta
	public boolean isPossuiConta() {
		return possuiConta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
