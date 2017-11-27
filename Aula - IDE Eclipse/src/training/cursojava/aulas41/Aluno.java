package training.cursojava.aulas41;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}	
		
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public void verificarAcesso() {
		super.nomeVisibilidade = "dasdas";
		this.nomeVisibilidade = "asdas";
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
		super.setCpf("32423432");
		//pode um ou outro
		this.setCpf("3423423");
	}
	
	public String obterEtiquetaEndereco() {
		String s = "endereco do aluno: "+this.getEndereco();
		//String s = "endereco do aluno: "+super.obterEtiquetaEndereco();
		return s;
	}

	@Override
	public void imprimirEtiqueitaEndereco() {
	   System.out.println(this.obterEtiquetaEndereco());
	}	
	
}

