package training.cursojava.exercicios.aulas28a33;

public class ContaCorrente {
	
	private int numero;
	
	private String Status;
	private String cliente;
	private String agencia;
	private double saldo;
	private double limite;
	private boolean especial;
	private double valorEspecialUsado;
	private double limiteChequeEspecial;
	
	ContaCorrente() {}
		
	public ContaCorrente(int numero, String status, String cliente, double saldo, double limite, boolean especial,
			double valorEspecialUsado, double limiteChequeEspecial) {
		super();
		this.numero = numero;
		Status = status;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
		this.especial = especial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	boolean realizaSaque(final double valorSaque) {
		if (saldo >= valorSaque) {
			debitar(valorSaque);
			return true;
		}
		else {
			if (especial) {
				double limiteEspecial = limiteChequeEspecial + saldo;
				if (limiteEspecial >= valorSaque) {
					debitar(valorSaque);
					return true;
				}
				else
					return false;					
			}
			else 
				return false;
		}
	}
	
	void debitar(final double valor) {
		saldo -= valor;		
	}
	
	void depositarDinheiro(final double deposito) {
		saldo += deposito;
		//System.out.println("Saldo: "+saldo);
	}
	
	void consultarSaldo() {
		System.out.println("Saldo: "+saldo);
	} 
	
	boolean verificarUsoChequeEspecial() {
		return (saldo < 0);
	}
}
