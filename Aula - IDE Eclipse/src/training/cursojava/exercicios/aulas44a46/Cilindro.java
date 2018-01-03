package training.cursojava.exercicios.aulas44a46;

public class Cilindro extends Figura3D {
	
	private double altura;
	private double raio;
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		double areaBase = Math.PI *(this.raio*this.raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areatotal = (2*areaBase) + areaLateral;
		return areatotal;
	}
	@Override
	public double calcularVolume() {
    	return Math.PI * (this.raio*this.raio) * this.altura;
	}

}
