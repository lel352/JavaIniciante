package training.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] temperaturaDiaria = new double[365];
		
		temperaturaDiaria[0] = 31.3;
		temperaturaDiaria[1] = 32;
		temperaturaDiaria[2] = 33.7;
		temperaturaDiaria[3] = 34;
		temperaturaDiaria[4] = 33.1;
		
		
		System.out.println("Temperaturas dia 1: "+temperaturaDiaria[0]);
		System.out.println("Temperaturas dia 3: "+temperaturaDiaria[2]);

		System.out.println("tamanho do array: "+temperaturaDiaria.length);
		System.out.println("tamanho do array: "+temperaturaDiaria);//Endereço de memória
		
		for (int i = 0; i < temperaturaDiaria.length; i++ ) {
			System.out.println("Temperatura dia "+(i+1)+": "+temperaturaDiaria[i]);
		}
		
		System.out.println("\n\n");
		
		for (double d : temperaturaDiaria) {
			System.out.println(d);			
		}	
		
		
		
		
	}

}
