package training.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidaCombustivel = 100; 
		van.consumoCombustivel = 0.2;
		
		System.out.println(van);
		System.out.println(van.toString());
		
		System.out.println("Marca: "+van.marca);
		System.out.println("Modelo: "+van.modelo);
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroPassageiros = 4;
		fusca.capacidaCombustivel = 30; 
		fusca.consumoCombustivel = 0.15;
		
		System.out.println(fusca);
		System.out.println(fusca.toString());
		
		System.out.println("Marca: "+fusca.marca);
		System.out.println("Modelo: "+fusca.modelo);
	}

}
