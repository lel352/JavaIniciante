package training.cursojava.exercicios.aulas27;

public class Lampada {
	
	String marca;
	String modelo;	
	String cor;
	String[] tipos;
	int tensao;
	int garatiaMes;
	double potenciaCosumo;
	double lumenFluxoLuminoso;
	double valor;
	boolean tipoAbajur;	
	boolean ligada = false;
	
	void ligaLampada() {
		ligada = true;
	}
	
	void desligaLampada() {
		ligada = false;
	}
		
	void ligaDesliga() {
		ligada = !ligada;
	}
	
	void mostraEstado() {
		if (ligada)
			System.out.println("Lampada está ligado!!");
		else
			System.out.println("Lampada não está ligado!!");
			
	}
}
