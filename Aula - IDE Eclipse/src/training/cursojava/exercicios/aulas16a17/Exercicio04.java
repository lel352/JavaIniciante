package training.cursojava.exercicios.aulas16a17;


public class Exercicio04 {

	public static void main(String[] args) {
		double populacaoA = 80000; 
		double populacaoB = 200000;
		int ano = 0;
		System.out.println(" Inicial Popula��o A: "+populacaoA+" percentual 3%");
		System.out.println(" Inicial Popula��o B: "+populacaoB+" percentual 1.5%");
		while(populacaoA < populacaoB){
			ano++; 
			populacaoA += ((populacaoA*3)/100); 
			populacaoB += ((populacaoB*1.5)/100);
		} 
		System.out.println(" Ap�s "+ano+" anos");
		System.out.println(" Popula��o A: "+populacaoA);
		System.out.println(" Popula��o B: "+populacaoB);
	}

}
