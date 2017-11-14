package training.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		System.out.println("Numero de passageiro"+van.numeroPassageiros);
		van.numeroPassageiros = 10;
		van.capacidaCombustivel = 100; 
		van.consumoCombustivel = 0.2;
		
		System.out.println("Numero de passageiro"+van.numeroPassageiros);
		
		Carro van2 = new Carro("Fiat 2","Ducato",10,100,0.2);
		System.out.println("marca van 2: "+van2.marca);
		System.out.println("modelo van 2: "+van2.modelo);
		System.out.println("Passageiro van 2: "+van2.numeroPassageiros);
		System.out.println("combustivel van 2: "+van2.capacidaCombustivel);
		System.out.println("Consumo van 2: "+van2.consumoCombustivel);
		
		Carro2 carro = new Carro2();

	}

}
