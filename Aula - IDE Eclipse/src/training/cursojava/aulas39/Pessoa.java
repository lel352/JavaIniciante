package training.cursojava.aulas39;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	//String nomeVisibilidade;
	/*default = padrão //livre para todo pacote em que a classe tá, mas para sub pacotes(pacotes dentro de outro) ela não
	fica livre*/
	//public String nomeVisibilidade;//livre para tudo, até outros pacotes
	
	//private String nomeVisibilidade;//visivel somente dentro da propria classe
	
	protected String nomeVisibilidade;/*fuciona como default, so que não importa onde as subclasses estão, mesmo pacote ou não
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
	
}
