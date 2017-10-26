package training.cursojava.exercicios.aulas19;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorA =  new int[10];
		int qdte0 = 0, qdte1;
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random()*1);

		}	
		System.out.print("\nElementos: ");
		for (int i : vetorA) {
			System.out.print(i+" ");
			if (i == 0)
				qdte0++;			
		}
		
		qdte1 = vetorA.length - qdte0;
		double percentual0 = (qdte0*100)/vetorA.length;
		double percentual1 = 100 - percentual0;
		
		System.out.println("\nQuantidade de 0: "+qdte0);
		System.out.println("Quantidade de 1: "+qdte1);
		System.out.println("Percentual de 0: "+percentual0+"%");
		System.out.println("Percentual de 1: "+percentual1+"%");

	}

}
