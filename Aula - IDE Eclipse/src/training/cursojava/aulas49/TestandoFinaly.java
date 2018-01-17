package training.cursojava.aulas49;

public class TestandoFinaly {

	public static void main(String[] args) {
		int[] numeros = {4,8,16,32,64,128};
		int[] demoninadores = {2,0,4,8,0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+demoninadores[i]+" = "+(numeros[i]/demoninadores[i]));	
			} catch (ArithmeticException exception) {
				System.out.println("Erro ao dividir por zero");
			} catch (Throwable exception) {
				System.out.println("Ocorreu um erro "+exception.getMessage());
			} finally {
				System.out.println("Essa linda é impressa sempre apos o try e catch");
			}
		}
		System.out.println("Fim \n");
	}
}
