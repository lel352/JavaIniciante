package training.cursojava.exercicios.aulas36a43.exercicio01;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) 
			return false;
		
		this.saldo -= valor;
		return true;	
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [Nome Cliente=" + nomeCliente + ", Nummero Conta=" + numConta + ", Saldo=" + saldo + "]";
	}

}
