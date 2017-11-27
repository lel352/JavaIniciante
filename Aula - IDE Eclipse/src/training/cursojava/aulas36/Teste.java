package training.cursojava.aulas36;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contato contato = new Contato();
		
		contato.setNome("Tyrion");
		
		//Criar objeto endereço
		Endereco  endereco = new Endereco();
		endereco.setNomeRua("Rua 1");
		endereco.setNumero("n/a");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");
		endereco.setCep("999999");
		
		contato.setEndereco(endereco);
		

		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("11");
		telefone.setNumero("9999-999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("11");
		telefone2.setNumero("888-98888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		if ((contato.getEndereco() != null) && (contato.getEndereco().getCidade() != null)) 
			System.out.println(contato.getEndereco().getCidade());
		if (contato.getTelefones() != null) {
			for (Telefone telefone3 : contato.getTelefones()) {
				if (telefone3 != null) {
					System.out.println(telefone3.getDdd()+" - "+telefone3.getNumero());
				}	
			}
		   
		}   
	}

}
