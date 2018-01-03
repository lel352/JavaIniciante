package training.cursojava.aulas43;

import java.util.Arrays;

//public class Aluno extends Pessoa {
public class Aluno {	
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}	
		
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public void verificarAcesso() {
		//super.nomeVisibilidade = "dasdas";
		//this.nomeVisibilidade = "asdas";
	}
	

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}	
	public double calcularMedia() {
		return 0;
	}	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
	//	super.setCpf("32423432");
		//pode um ou outro
	//	this.setCpf("3423423");
	}
	
	public String obterEtiquetaEndereco() {
	//	String s = "endereco do aluno: "+this.getEndereco();
		//String s = "endereco do aluno: "+super.obterEtiquetaEndereco();
	//	return s;
		return "23";
	}

	//@Override
	public void imprimirEtiqueitaEndereco() {
	   System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() { //Gerado pela ide
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //ver se é a mesma referencia
			return true;
		if (obj == null) //ver se é nulo
			return false;
		if (getClass() != obj.getClass()) //tipo da class
			return false;
		Aluno other = (Aluno) obj;//criar objeto para compara atributos  
		/*if (curso == null) { 
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		
		return true;	
			*/
		if (curso.equalsIgnoreCase(other.getCurso()))
			return true;
		else
			return false;
	}	
	
/*	public String toString() { //feito na mao
		String s = this.curso +"\n";
		for (double nota : notas) {
			s += nota + " "; 			
		}
		return s;
	}*/
	
		
	
	
	
	
	
	
	

}

