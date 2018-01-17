package training.cursojava.aulas52;

public class UsandoMinhaException {

	public static void main(String[] args) {
		/*int[] numeros = {4,8,5,16,32,21,64,128};
		int[] demoninadores = {2,0,4,8,0,2,4};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
				//lancar exception aqui
					throw new DivisaoNaoExata(numeros[i],demoninadores[i]);
				}
				System.out.println(numeros[i]+"/"+demoninadores[i]+" = "+(numeros[i]/demoninadores[i]));	
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e )  {
				//Só pode fazer esse tipo de catch apartir do java 7
				System.out.println("Aconteceu um erro");
				e.printStackTrace();				
			}
		}*/
        
		try {
			teste();
		} catch (DivisaoNaoExata e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void teste() throws DivisaoNaoExata {
		int[] numeros = {4,8,5,16,32,21,64,128};
		int[] demoninadores = {2,0,4,8,0,2,4};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
				//lancar exception aqui
					throw new DivisaoNaoExata(numeros[i],demoninadores[i]);
				}
				System.out.println(numeros[i]+"/"+demoninadores[i]+" = "+(numeros[i]/demoninadores[i]));	
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e )  {
				//Só pode fazer esse tipo de catch apartir do java 7
				System.out.println("Aconteceu um erro");
				e.printStackTrace();				
			}
		}
	}
	

}
