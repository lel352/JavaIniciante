package training.cursojava.exercicios.aulas16a17;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		for (int i = 1; i < 51; soma+=i,i+=2) {
			System.out.println(i);
		}
		System.out.println("Soma "+soma);
		soma = 0;
		for (int i = 1; i < 51; i++) {
			if ((i % 2) != 0) {
				System.out.println(i);
				soma+=i;
			}	
		}
		System.out.println("Soma "+soma);
		

	}

}
