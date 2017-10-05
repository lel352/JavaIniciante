package training.cursojava.aula13;

public class CurtoCircuito {
	
	public static void main(String[] args) {
		boolean verdadeiro = true;
		boolean falso = false;
		//somente um & ele olha as duas expressão mesmo sabendo que a primeira é falsa 
		boolean resultado = (falso & verdadeiro);
		
		//com && Se a primeira expresão é falsa ele não olha segunda  
		boolean resultado2 = (falso && verdadeiro);
		System.out.println(resultado);
		System.out.println(resultado2);
		
		int resu = 1 + 1 - 1 + 1 * 1 / 2;
		System.out.println(resu);	
	}
}