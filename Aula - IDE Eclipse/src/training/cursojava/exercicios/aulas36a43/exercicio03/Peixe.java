package training.cursojava.exercicios.aulas36a43.exercicio03;

public class Peixe extends Animal {
	
	private String caracteristicas;
	
	public Peixe() {
		super();
		this.setNumeroPatas(0);
		this.setAmbiente("Mar");
		this.setCor("cinzenta");
		this.setCaracteristicas("Barbatana e cauda");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCaracteristicas: "+this.getCaracteristicas();
	}

	
	
}
