package conta;

public class Titular {
	private String nome;
	private String cpf;
	private String senha;
	private boolean possuiConta = false;
	private boolean senhaValida  = false;
	private boolean cpfValido = false;
	
	//Verificacao de conta
	public boolean isPossuiConta() {
		if (senhaValida == true && cpfValido == true) {
			possuiConta = true;
		}
		return possuiConta;
	}
	
	//Implementacao dos metodos basicos
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
	
	//Metodos extras
	public boolean isSenhaValida() {
		//Parametros para a senha ser valida:
		boolean temNumero = false;
		boolean temMaiuscula = false;
		boolean temMinuscula = false;
		boolean	temCaracEspecial = false;
		
		//Tamanho da senha
		if(senha.length() < 6) {
			return false;
		}
		
		for (int i = 0; i < senha.length(); i++) {
			//Pega cada letra
			char c = senha.charAt(i);
			
			//Verificacao do char percorrido
			if (Character.isDigit(c)) {
				temNumero = true;
			}
			if (Character.isUpperCase(c)) {
				temMaiuscula = true;
			}
			if (Character.isLowerCase(c)) {
				temMinuscula = true;
			} 
			if (!Character.isLetterOrDigit(c)) { //Se nao for uma letra nem numero eh caracter especial
				temCaracEspecial = true;
			}
		}
		
		//Verifica os parametros para validar a senha
		if (temNumero == true && temMaiuscula == true && temMinuscula == true && temCaracEspecial == true) {
			senhaValida = true;
		}
		return senhaValida;
	}
	
	//Verificacao do cpf
	public boolean isCpfValido(String cpf) {
		//Verificando por tamanho
		if(cpf.length() != 11) {
			return cpfValido;
		}
		//Verificando se sao numeros e se os numeros nao sao todos o mesmo
		int ct = 0;
		int antecessor= -1;
		for (int i = 0; i < cpf.length(); i++) {
			if(cpf.charAt(i) < '0') {
				return cpfValido;
			}
			
			if(antecessor == cpf.charAt(i) - '0') {
				ct ++;
			}
			antecessor = cpf.charAt(i) - '0';
		}
		if (ct == cpf.length()-1) {
			return cpfValido;
		}
		// ----------------------------
		// Utilizando digitos verificadores (fonte de pesquisa informada no relatorio)
		int soma = 0;
		int d1;
		int d2;
		//Primeiro digito verificador
		//Soma
		for(int i = 0; i < 9; i++) {
			int numero = cpf.charAt(i) - '0';   //Essa linha resolve o problema de pegar o numero como char e transformar em numero com o '0' para um int
			soma += numero * (10 - i);
		}
		//Definindo d1
		if(soma%11 == 0  || soma%11 == 1) {
			d1 = 0;
		}else {
			d1 = 11 - soma%11;
		}
		
		soma = 0;
		// ----------------------------
		//Segundo digito verificador
		//Soma
		for (int i = 1; i < 9; i++) {
			int numero = cpf.charAt(i) - '0';   //Essa linha resolve o problema de pegar o numero como char e transformar em numero com o '0' para um int
			soma += numero * (11 - i);
		}
		soma += d1 *2; //Pegando d1 para "fechar" a conta de 10-2 numeros
		//Definindo d2
		if(soma%11 == 0  || soma%11 == 1) {
			d2 = 0;
		}else {
			d2 = 11 - soma%11;
		}
		// ----------------------------
		// Comparando os diigitos verificadores com cpf
		int ultimoNumero = cpf.charAt(10) - '0';
		int penultimoNumero = cpf.charAt(9) - '0';
		if (ultimoNumero == d2 && penultimoNumero == d1) {
			cpfValido = true;
		}
		return cpfValido;
	}
	
	
}
