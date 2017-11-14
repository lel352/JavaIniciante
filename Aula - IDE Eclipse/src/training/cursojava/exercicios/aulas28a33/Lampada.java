package training.cursojava.exercicios.aulas28a33;

public class Lampada {
	private String marca;
	private String modelo;	
	private String cor;
	private String[] tipos;
	private int tensao;
	private int garatiaMes;
	private double potenciaCosumo;
	private double lumenFluxoLuminoso;
	private double valor;
	private boolean tipoAbajur;	
	private boolean ligada;
	
		
	public Lampada() {
		this.setLigada(false);
	}

	public Lampada(String marca, String modelo, String cor, String[] tipos, int tensao, int garatiaMes,
			double potenciaCosumo, double lumenFluxoLuminoso, double valor, boolean tipoAbajur, boolean ligada) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tipos = tipos;
		this.tensao = tensao;
		this.garatiaMes = garatiaMes;
		this.potenciaCosumo = potenciaCosumo;
		this.lumenFluxoLuminoso = lumenFluxoLuminoso;
		this.valor = valor;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public int getGaratiaMes() {
		return garatiaMes;
	}

	public void setGaratiaMes(int garatiaMes) {
		this.garatiaMes = garatiaMes;
	}

	public double getPotenciaCosumo() {
		return potenciaCosumo;
	}

	public void setPotenciaCosumo(double potenciaCosumo) {
		this.potenciaCosumo = potenciaCosumo;
	}

	public double getLumenFluxoLuminoso() {
		return lumenFluxoLuminoso;
	}

	public void setLumenFluxoLuminoso(double lumenFluxoLuminoso) {
		this.lumenFluxoLuminoso = lumenFluxoLuminoso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isTipoAbajur() {
		return tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.setLigada(ligada);
	}

	public void ligaLampada() {
		this.setLigada(true);
	}
	
	public void desligaLampada() {
		this.setLigada(false);
	}
		
	public void ligaDesliga() {
		this.setLigada(!this.isLigada());
	}
	
	public void mostraEstado() {
		if (this.isLigada())
			System.out.println("Lampada está ligado!!");
		else
			System.out.println("Lampada não está ligado!!");
			
	}

}
