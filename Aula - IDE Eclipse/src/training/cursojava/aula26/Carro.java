package training.cursojava.aula26;

public class Carro {
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidaCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//Nome do m�todo come�a sempre com nome de verbo
		System.out.println("A Autonomia do carro �: "+(capacidaCombustivel * consumoCombustivel) +" km.");
	} 
	
	double obterAutonomia() {
		return capacidaCombustivel*consumoCombustivel;
	}
}
