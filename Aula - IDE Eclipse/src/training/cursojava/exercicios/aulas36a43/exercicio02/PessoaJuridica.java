package training.cursojava.exercicios.aulas36a43.exercicio02;

public class PessoaJuridica extends Contribuinte {
	
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta()*0.1;
	}
	
	@Override
	public String toString() {
        String s = "Pessoa Juridica [ "+ super.toString();
        s += " CNPJ = "+getCNPJ();
        s += " Imposto a ser pago = "+calcularImposto();
        s += "]";
		return s;
	}
}
