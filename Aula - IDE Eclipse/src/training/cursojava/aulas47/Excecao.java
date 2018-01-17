package training.cursojava.aulas47;

public class Excecao {
	
	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("N�o sera impresso");
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro ao acessar uma posi��o invalida em um vetor");
		}
		System.out.println("Esse texto ser� impresso apos a exception");
	}

}
