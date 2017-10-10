package training.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		//Variavel inical; condição; incrimento
		for (int i=0;i<11;i++) {
			System.out.println("Valor de i "+i);			
		}
		System.out.print("\n");
		for (int i=10;i>0;i--) {
			System.out.println("Valor de i "+i);			
		}
		System.out.print("\n");
		for (int i = 0,j = 10;i<j;i++,j--) {
			System.out.println("Valor de i "+i+" Valor de j "+j);			
		}
		System.out.print("\n");
		int ia = 0;
		for (;ia<10;) {
			System.out.println("Valor de ia "+ia);
			ia++;
		}
		System.out.print("\n");
		int	soma = 0;
		for (int i=1;i<5;soma += i++ );
		System.out.print("\n");	
		System.out.println("Valor soma é "+soma);
		System.out.print("\n");
		
		for (int i=0;i<11;i++) {
			System.out.println("Valor de i "+i);			
		}
	}

}
