package training.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidaCombustivel = 100; 
		van.consumoCombustivel = 0.2;
		System.out.println("Marca: "+van.marca);
		System.out.println("Modelo: "+van.modelo);
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println();
		System.out.println("Autonomia: "+autonomia+" km");
		double qtdeCombustivel = van.calcularCombustivel(10);
		System.out.println("Qtde Combustivel 10: "+qtdeCombustivel+" litros");
		qtdeCombustivel = van.calcularCombustivel(15);
		System.out.println("Qtde Combustivel 15: "+qtdeCombustivel+" litros");
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroPassageiros = 4;
		fusca.capacidaCombustivel = 30; 
		fusca.consumoCombustivel = 0.15;
		System.out.println("Marca: "+fusca.marca);
		System.out.println("Modelo: "+fusca.modelo);
		fusca.exibirAutonomia();
		autonomia = fusca.obterAutonomia();
		System.out.println("Autonomia: "+autonomia+" km");
		qtdeCombustivel = fusca.calcularCombustivel(10);
		System.out.println("Qtde Combustivel 10: "+qtdeCombustivel+" litros");
		qtdeCombustivel = fusca.calcularCombustivel(15);
		System.out.println("Qtde Combustivel 15: "+qtdeCombustivel+" litros");
	}

}
