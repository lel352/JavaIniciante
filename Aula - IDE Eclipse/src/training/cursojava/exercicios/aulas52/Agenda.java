package training.cursojava.exercicios.aulas52;

public class Agenda {
	
	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato contato) throws AgendaCheiaException {
		boolean cheia = true;   
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = contato;
				cheia = false;
				break;
			}
		} 
		
		if (cheia) {
			throw new AgendaCheiaException();
		}
	}
	
	public int consultaContato(String nomeContato) throws ContatoNaoExisteException {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nomeContato)) {
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException(nomeContato);
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Contato contato : contatos) {
			if (contato != null)
			   s += contato.toString() + "\n";
		}
		return s;
	}

}
