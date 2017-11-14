package training.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidaCombustivel;
	double consumoCombustivel;
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Carro(String marca, String modelo, int numeroPassageiros, double capacidaCombustivel,
			double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidaCombustivel = capacidaCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
		
	public Carro(String marca, String modelo, int numeroPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		System.out.println("Construtor 3 paramentros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 5);
		System.out.println("Construtor 2 paramentros");
	}

	void exibirAutonomia(){//Nome do método começa sempre com nome de verbo
		System.out.println("A Autonomia do carro é: "+(this.capacidaCombustivel * this.consumoCombustivel) +" km.");
	} 
	
	double obterAutonomia() {
		return this.capacidaCombustivel*this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdeCombustivel = km/this.consumoCombustivel;
		return qtdeCombustivel;
	}

}
