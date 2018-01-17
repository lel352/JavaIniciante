package training.cursojava.exercicios.aulas52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao = 1;

		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan);

			if (opcao == 1) { // consultar contato
				consultarContato(scan, agenda);
			} else if (opcao == 2) { // Adicionar contato
				adicionarContato(scan, agenda);
			} else if (opcao == 3) { // Sair
				System.exit(0);
			}
		}
	}

	public static void adicionarContato(Scanner scan, Agenda agenda) {
		try {
			System.out.println("Criando um Contato");
			String nome = lerInformacao(scan, "Entre com o nome do contato");
			String telefone = lerInformacao(scan, "Entre com o Telefone do contato");
			String email = lerInformacao(scan, "Entre com o Email do contato");

			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setTelefone(telefone);

			System.out.println("Contato a ser criado:");
			System.out.println(contato);

			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Contatos da Agenda");
			System.out.println(agenda);
		}

	}

	public static void consultarContato(Scanner scan, Agenda agenda) {
		scan.nextLine();
		String nomeContato = lerInformacao(scan, "Entre com o nome do contato a ser Pesquisado; ");
		try {
			if (agenda.consultaContato(nomeContato) >= 0) {
				System.out.println("Contato Existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String lerInformacao(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int opcao = 3;
		while (!entradaValida) {
			System.out.println("Digite a Opção desejada");
			System.out.println("1: Consultar Contato");
			System.out.println("2: Adicionar Contato");
			System.out.println("3: Sair");
			try {
				opcao = scan.nextInt();

				if ((opcao != 1) && (opcao != 2) && (opcao != 3))
					throw new Exception("Entrada Invalida, digite novamento!\n");
				else 
					entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada Invalida, digite novamento!\n");
			}

		}

		return opcao;
	}
}
