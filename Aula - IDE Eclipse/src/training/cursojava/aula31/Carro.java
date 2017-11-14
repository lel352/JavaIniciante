package training.cursojava.aula31;

class Carro {
	public String marca;
	String modelo;
	int numeroPassageiros;
	double capacidaCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia(){//Nome do método começa sempre com nome de verbo
		System.out.println("A Autonomia do carro é: "+(this.capacidaCombustivel * this.consumoCombustivel) +" km.");
	} 
	
	public double obterAutonomia() {
		return this.capacidaCombustivel*this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKMPorConsumoCombustivel(km);
	}

}
