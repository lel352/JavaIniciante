package training.cursojava.exercicios.aulas27;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String[] diciplinas = new String[3];
	double[][] diciplinasNotas = new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome: "+nome);
		System.out.println("Matrícula: "+matricula);
		System.out.println("Nome do Curso: "+curso);
		
		for (int i = 0; i < diciplinasNotas.length; i++) {
			System.out.println("Notas da disciplina "+diciplinas[i]);
			for (int j = 0; j < diciplinasNotas[i].length; j++) {
				System.out.print(diciplinasNotas[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice) {
		double media = obterMedia(indice);
		if (media >= 7) 
			return true;
		
		return false;
	}
	
	double obterMedia(int indice) {
		double soma = 0;
		for (int i = 0; i < diciplinasNotas[indice].length; i++) {
			soma += diciplinasNotas[indice][i];
		}
		return (soma/4);
	}
}
