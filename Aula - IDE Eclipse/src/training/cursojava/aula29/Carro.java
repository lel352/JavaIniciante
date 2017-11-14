package training.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidaCombustivel;
	double consumoCombustivel;
	
	public Carro(){
		System.out.println("Classo carro foi instanciada!!!");
		numeroPassageiros = 4;
	}
	
	public Carro(String marca){
		this.marca =  marca;
	}	
	
	public Carro(String marca, String modelo, int numeroPassageiros, double cabapidadeCombustivel, double consumoCombustivel){
		this.marca =  marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidaCombustivel = cabapidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}	
	
	void exibirAutonomia(){//Nome do método começa sempre com nome de verbo
		System.out.println("A Autonomia do carro é: "+(capacidaCombustivel * consumoCombustivel) +" km.");
	} 
	
	double obterAutonomia() {
		return capacidaCombustivel*consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdeCombustivel = km/consumoCombustivel;
		return qtdeCombustivel;
	}

}
