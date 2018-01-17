package training.cursojava.aulas48;

public class MultiplosCatchAteJava7 {
	
	public static void main(String[] args) {
		int[] numeros = {4,8,16,32,64,128};
		int[] demoninadores = {2,0,4,8,0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+demoninadores[i]+" = "+(numeros[i]/demoninadores[i]));	
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
				//Só pode fazer esse tipo de catch apartir do java 7
				System.out.println("Aconteceu um erro");
			} 
		}
	}


}
