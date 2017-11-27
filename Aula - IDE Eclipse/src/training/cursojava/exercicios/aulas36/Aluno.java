package training.cursojava.exercicios.aulas36;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	
	Aluno(){
		notas = new double[4];
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

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
	public String obterInformacao() {
		String infomacao =  "Aluno: "+this.nome+"; "+
							"Matricula = "+this.matricula+"; ";
		
		double soma = 0;
		infomacao += "\nNotas: ";
		for (double nota : notas) {
			infomacao += nota+ " ";
			soma += nota;
		}
		double media = (soma/4);
		infomacao += "\n Media = "+media;
		if (media >= 7)
			infomacao += "\n Media = "+media+" - Aprovado";
		else
			infomacao += "\n Media = "+media+" - Reprovado";
		return infomacao;
	}
	
	
	public double obterMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma/4;
		
	} 
}
