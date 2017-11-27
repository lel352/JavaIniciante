package training.cursojava.exercicios.aulas36;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String obterInformacao() {
		String informacao = "Nome Curso = "+this.nome+"\n";
		if (professor != null) 
			informacao += professor.obterInformacao();
		
		if (alunos != null) {
			informacao += "\n Alunos";
			for (Aluno aluno : alunos) {
				if (aluno != null)
				   informacao += "\n"+aluno.obterInformacao();				
			}
			informacao += "\n Media da turma: "+this.obterMediaTurma();
		}		
		return informacao;
	}
	
	public double obterMediaTurma() {
		double soma = 0;
		for (Aluno aluno : alunos) {
			if (aluno != null)
				soma += aluno.obterMedia(); 				
		}		
		return (soma/alunos.length);
	}

}
