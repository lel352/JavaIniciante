package training.cursojava.aulas49;

public class FinallyPegadinha {
	public static void main(String[] args) {
		int[] numeros = {4,8,16,32,64,128};
		int[] demoninadores = {2,0,4,8,0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+demoninadores[i]+" = "+(numeros[i]/demoninadores[i]));	
			} catch (ArithmeticException exception) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0); //Termina a execu��o do programa
			} catch (Throwable exception) {
				System.out.println("Ocorreu um erro "+exception.getMessage());
				System.exit(0);//Termina a execu��o do programa
			} finally {
				System.out.println("Essa linda � impressa sempre apos o try e catch");
			}
		}
		System.out.println("Fim \n");

	}


}
