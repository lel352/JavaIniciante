package training.cursojava.exercicios.aulas36a43.exercicio03;

public class Teste {

	public static void main(String[] args) {
		
	  Animal camelo = new Animal();
	  camelo.setNome("Camelo");
	  camelo.setComplimento(150);
	  //camelo.setNumeroPatas(4);
	  camelo.setCor("Amarelo");
	  camelo.setAmbiente("Terra");
	  camelo.setVelocidade(2);
	  
	  
	  
	  Peixe tubarao = new Peixe();
	  tubarao.setNome("Tubarão");
	  tubarao.setComplimento(300);
	  tubarao.setVelocidade(1.5);
	  
	  
	  Mamifero urso = new Mamifero();
	  urso.setNome("Urso do Canadá");
	  urso.setComplimento(180);
	  urso.setNumeroPatas(4);
	  urso.setCor("Vermelho");
	  urso.setVelocidade(0.5);
	  
	  
	  Animal[] animais = new Animal[3];
	  animais[0] = camelo;
	  animais[1] = tubarao;
	  animais[2] = urso;
	  
	  for (Animal animal : animais) {
		 System.out.println("---------------------------");
		 System.out.println(animal.toString());
		
	  }
	  System.out.println("---------------------------");
	}

}
