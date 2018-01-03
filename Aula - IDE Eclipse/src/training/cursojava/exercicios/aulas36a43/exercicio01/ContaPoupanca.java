package training.cursojava.exercicios.aulas36a43.exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s =  "ContaPoupanca [Dia Rendimento = " + diaRendimento+" "+ super.toString()+"]"; 
		return s;
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            double valor = this.getSaldo()*taxaRendimento;
			super.depositar(valor);
			return true;
		}	
		return false;
	}



}
