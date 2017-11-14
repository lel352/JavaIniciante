package training.cursojava.exercicios.aulas28a33;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[] diciplinas;
	private double[][] diciplinasNotas;
	
	public Aluno() {
		this.diciplinas = new String[3];
		this.diciplinasNotas = new double[3][4];
	}
	
	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.diciplinas = new String[3];
		this.diciplinasNotas = new double[3][4];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(String[] diciplinas) {
		this.diciplinas = diciplinas;
	}

	public double[][] getDiciplinasNotas() {
		return diciplinasNotas;
	}

	public void setDiciplinasNotas(double[][] diciplinasNotas) {
		this.diciplinasNotas = diciplinasNotas;
	}	
	
	public void mostrarInfo() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Matrícula: "+this.getMatricula());
		System.out.println("Nome do Curso: "+this.getCurso());
		
		for (int i = 0; i < diciplinasNotas.length; i++) {
			System.out.println("Notas da disciplina "+diciplinas[i]);
			for (int j = 0; j < diciplinasNotas[i].length; j++) {
				System.out.print(diciplinasNotas[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public boolean verificarAprovado(int indice) {
		double media = obterMedia(indice);
		if (media >= 7) 
			return true;
		
		return false;
	}
	
	private double obterMedia(int indice) {
		double soma = 0;
		for (int i = 0; i < diciplinasNotas[indice].length; i++) {
			soma += diciplinasNotas[indice][i];
		}
		return (soma/4);
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.diciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotaPosIJ(int posI, int posJ, double nota) {
		this.diciplinasNotas[posI][posJ] = nota;
	}
	
	
}
