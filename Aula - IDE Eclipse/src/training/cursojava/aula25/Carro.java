package training.cursojava.aula25;

public class Carro {
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidaCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia(){//Nome do m�todo come�a sempre com nome de verbo
		System.out.println("A Autonomia do carro �: "+(capacidaCombustivel * consumoCombustivel) +" km.");
	} 
}
