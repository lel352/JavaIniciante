package training.cursojava.exercicios.aulas36a43.exercicio02;

public class PessoaFisica extends Contribuinte {
	
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if (renda <= 1400)
			return 0;
		else if (renda > 1400 && renda <=2100)
			return (renda *0.1)-100;
		else if (renda > 2100 && renda <=2800)
			return (renda *0.15)-270;
		else if (renda > 2800 && renda <=3600)
			return (renda *0.25)-500;
		else //if (renda > 3600)
		   return (renda *0.30)-700;		
	}
	
	
	@Override
	public String toString() {
        String s = "Pessoa Fisica ["+ super.toString();
        s += " CPF = "+getCPF();
        s += " Imposto a ser pago = "+calcularImposto();
        s += "]";
		return s;
	}
	
	
}
