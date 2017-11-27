package training.cursojava.exercicios.aulas36;

public class Agenda {
		
	private String nomeAgenda;
	private Contato[] contatos;
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String oberInfo() {
		String info = "Nome; "+this.nomeAgenda+"\n";
		if (contatos != null) {
			for (Contato contato : contatos) {
				info += contato.obterContato()+"\n ";
			}
		}		
		return info;
	}
}
