package training.cursojava.exercicios.aulas36a43.exercicio03;

public class Animal {
	
	private String nome;
	private double complimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
		this.setNumeroPatas(4);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComplimento() {
		return complimento;
	}
	public void setComplimento(double complimento) {
		this.complimento = complimento;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	@Override
	public String toString() {
		String s = "Animal: "+this.getNome()+
				   "\nComplimento: "+this.getComplimento()+"cm"+
				   "\nPatas: "+this.getNumeroPatas()+
				   "\nCor: "+this.getCor()+
				   "\nAmbiente: "+this.getAmbiente()+
				   "\nVelocidade: "+this.getVelocidade();
		return s; 
	}
	
	
	
	

}
