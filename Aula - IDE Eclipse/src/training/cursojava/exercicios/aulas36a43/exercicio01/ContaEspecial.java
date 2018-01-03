package training.cursojava.exercicios.aulas36a43.exercicio01;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [Limite = " + limite + " "+super.toString()+ "]";
	}

	@Override
	public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo()+limite; 
		
		if (saldoComLimite < valor) 
			return false;
		
		this.setSaldo(this.getSaldo() - valor);
		return true;	
	}
	

}
