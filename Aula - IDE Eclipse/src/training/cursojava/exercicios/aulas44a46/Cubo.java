package training.cursojava.exercicios.aulas44a46;

public class Cubo extends Figura3D {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 6*(this.lado*this.lado);
	}

	@Override
	public double calcularVolume() {
		return Math.pow(this.lado, 3);
	}
}
