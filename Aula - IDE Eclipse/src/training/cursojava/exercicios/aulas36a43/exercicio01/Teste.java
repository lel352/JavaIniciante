package training.cursojava.exercicios.aulas36a43.exercicio01;


public class Teste {
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor))
			System.out.println("Saque Efeutado com sucesso !!! novo saldo = "+conta.getSaldo());
		else
			System.out.println("Saldo insuficiente para saque de "+valor+", saldo de "+conta.getSaldo());
		
	}

	public static void main(String[] args) {
		System.out.println("*** Teste Conta Bancaria***");
		ContaBancaria contaSimples = new ContaBancaria();
		
		contaSimples.setNomeCliente("Cliente 1");
		contaSimples.setNumConta("12345");
		System.out.println(contaSimples.toString());
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		System.out.println("*** Teste Conta Poupança***");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente 2");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(30);
		System.out.println(contaPoupanca.toString());
		contaPoupanca.depositar(100);
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) 
			System.out.println("Novo rendimento aplicado, novo saldo de "+contaPoupanca.getSaldo());
		else
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		
     	System.out.println(contaPoupanca.toString());	
     	
     	
		System.out.println("*** Teste Conta Especial***");
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente 2");
		contaEspecial.setNumConta("333333");
		contaEspecial.setLimite(50);
		System.out.println(contaEspecial.toString());
		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		realizarSaque(contaEspecial, 30);
     	System.out.println(contaEspecial.toString());	
	}

}
