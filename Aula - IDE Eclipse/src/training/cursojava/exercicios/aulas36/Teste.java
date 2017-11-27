package training.cursojava.exercicios.aulas36;

import java.util.Scanner;

public class Teste {
	
	public static void imprimirTodosContato(Contato[] contatos) {
		for (int i = 0; i < contatos.length; i++) {
			imprimirContato(contatos[i]);
		}		
	}
	
	public static void imprimirContato(Contato contato) {
		System.out.println("---Contato---");
		System.out.println("Nome: "+contato.getNome());
		System.out.println("Telefone: "+contato.getTelefone());
		System.out.println("Email: "+contato.getEmail());		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*Agenda agenda = new Agenda();				
		
		System.out.println("Nome Agenda: ");
		String nomeAgenda =  scan.nextLine();
		String nome;
		String telefone;
		String email;
		
		Contato[] contatos = new Contato[3];	
		
		for (int i = 0; i < contatos.length; i++) {
			contatos[i] = new Contato();
			System.out.println("Contato: "+(i+1));
			System.out.println("Nome: ");
			nome = scan.nextLine(); 
			contatos[i].setNome(nome);
			System.out.println("Telefone: ");
			telefone = scan.nextLine();
			contatos[i].setTelefone(telefone);
			System.out.println("Email: ");
			email = scan.nextLine();
			contatos[i].setEmail(email);
		}
		
		ou
		
		for (int i = 0; i < contatos.length; i++) {
			Contato contato  = new Contato();
			System.out.println("Contato: "+(i+1));
			System.out.println("Nome: ");
			nome = scan.nextLine(); 
			contato.setNome(nome);
			
			System.out.println("Telefone: ");
			telefone = scan.nextLine();
			contato.setTelefone(telefone);
			
			System.out.println("Email: ");
			email = scan.nextLine();
			contato.setEmail(email);
			
			contatos[i] = contato;
		}
		
		agenda.setNomeAgenda(nomeAgenda);
		agenda.setContatos(contatos);
		
		agenda.oberInfo();
		
		
		imprimirTodosContato(agenda.getContatos());
		System.out.println("");
		imprimirContato(agenda.getContatos()[1]);*/
		
		
		System.out.println("Nome do Curso: ");
		String nomeCurso = scan.nextLine();
		
		System.out.println("Horario do Curso: ");
		String horario = scan.nextLine();
		
		System.out.println("Nome professor: ");
		String nomeProfessor = scan.nextLine();
		
		System.out.println("departamento professor: ");
		String departamentoProfessor = scan.nextLine();
		
		System.out.println("Email professor: ");
		String emailProfessor = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setDepartamento(departamentoProfessor);
		professor.setEmail(emailProfessor);
		
		curso.setProfessor(professor);
		
		System.out.println("--Alunos-- ");
		
		Aluno[] alunos = new Aluno[5];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Nome Aluno"+(i+1)+ ": ");
			String nomeAluno = scan.nextLine(); 
			
			System.out.println("Matricula do Aluno: ");
			String matricula = scan.nextLine();
			
			double[] notas = new double[4];
			
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Nota "+(j+1)+": ");
				notas[j] = scan.nextDouble();				
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInformacao());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
