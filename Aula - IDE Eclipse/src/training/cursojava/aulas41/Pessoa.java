package training.cursojava.aulas41;

public abstract class Pessoa  {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	//String nomeVisibilidade;
	/*default = padr�o //livre para todo pacote em que a classe t�, mas para sub pacotes(pacotes dentro de outro) ela n�o
	fica livre*/
	//public String nomeVisibilidade;//livre para tudo, at� outros pacotes
	
	//private String nomeVisibilidade;//visivel somente dentro da propria classe
	
	protected String nomeVisibilidade;/*fuciona como default, so que n�o importa onde as subclasses est�o, mesmo pacote ou n�o
	vao continuar tendo acesso a ela*/
	
	public Pessoa() {
	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	public abstract String obterEtiquetaEndereco(); //return this.endereco
	
	public abstract void imprimirEtiqueitaEndereco();
}
