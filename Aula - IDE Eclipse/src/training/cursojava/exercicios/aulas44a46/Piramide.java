package training.cursojava.exercicios.aulas44a46;

public class Piramide extends Figura3D {

	private double altura;
	private double arestaBase;
	private double apotema;
	private int numeroPolignoBase;
	
	public int getNumeroPolignoBase() {
		return numeroPolignoBase;
	}

	public void setNumeroPolignoBase(int numeroPolignoBase) {
		this.numeroPolignoBase = numeroPolignoBase;
	}

	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		if (this.base != null) 
			return (this.numeroPolignoBase*((this.arestaBase*this.apotema)/2))+this.base.calcularArea();
		
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (this.base != null)
		  return (this.base.calcularArea()*this.altura)/3;
		
		return 0;
	}		
}
