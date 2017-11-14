package training.cursojava.aula32;

public class Carro {

	private String marca;
	private String modelo;
	private int numeroPassageiros;
	private double capacidaCombustivel;
	private double consumoCombustivel;
	
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public double getCapacidaCombustivel() {
		return capacidaCombustivel;
	}

	public void setCapacidaCombustivel(double capacidaCombustivel) {
		this.capacidaCombustivel = capacidaCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public void exibirAutonomia() {// Nome do método começa sempre com nome de verbo
		System.out.println("A Autonomia do carro é: " + (this.capacidaCombustivel * this.consumoCombustivel) + " km.");
	}

	public double obterAutonomia() {
		return this.capacidaCombustivel * this.consumoCombustivel;
	}

	private double divideKMPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}

	public double calcularCombustivel(double km) {
		return this.divideKMPorConsumoCombustivel(km);
	}

}
