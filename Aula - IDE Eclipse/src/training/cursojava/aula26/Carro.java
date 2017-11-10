package training.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidaCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//Nome do método começa sempre com nome de verbo
		System.out.println("A Autonomia do carro é: "+(capacidaCombustivel * consumoCombustivel) +" km.");
	} 
	
	double obterAutonomia() {
		return capacidaCombustivel*consumoCombustivel;
	}
}
