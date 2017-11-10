package training.cursojava.exercicios.aulas27;

public class ContaCorrente {
	int numero;
	String Status;
	String cliente;
	double saldo;
	double limite;
	boolean especial;
	double valorEspecialUsado;
	double limiteChequeEspecial;
	
	
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
