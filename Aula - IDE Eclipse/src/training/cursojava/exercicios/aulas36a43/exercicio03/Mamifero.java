package training.cursojava.exercicios.aulas36a43.exercicio03;

public class Mamifero extends Animal {
	
	private String alimento;
	
	public Mamifero() {
		super();
		this.setCor("Castanho");
		this.setAlimento("Mel");
		this.setAmbiente("Terra");	
	}
		
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString()+"\nAlimento: "+this.getAlimento();
	}

}
