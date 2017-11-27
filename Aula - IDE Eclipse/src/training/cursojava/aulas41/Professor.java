package training.cursojava.aulas41;

public class Professor extends Pessoa {
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return this.salario;		
	}
	
	public String obterEtiquetaEndereco() {
		String s = "endereco do aluno: "+this.getEndereco();
		//String s = "endereco do Professor: "+super.obterEtiquetaEndereco();
		return s;
	}
	
	@Override
	public void imprimirEtiqueitaEndereco() {
		System.out.println("Imprimindo endereco professor");
		System.out.println(this.obterEtiquetaEndereco());		
	}	

}
