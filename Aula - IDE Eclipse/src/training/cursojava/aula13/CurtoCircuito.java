package training.cursojava.aula13;

public class CurtoCircuito {
	
	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso = false;
		//somente um & ele olha as duas express�o mesmo sabendo que a primeira � falsa 
		boolean resultado = (falso & verdadeiro);
		
		//com && Se a primeira expres�o � falsa ele n�o olha segunda  
		boolean resultado2 = (falso && verdadeiro);
		System.out.println(resultado);
		System.out.println(resultado2);
		
		int resu = 1 + 1 - 1 + 1 * 1 / 2;
		System.out.println(resu);	
	}
}