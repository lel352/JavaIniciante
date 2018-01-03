package training.cursojava.aulas45;

public class Teste2 {

	public static void main(String[] args) {
		Object object = obterString(); //Object super classe
		String s1 = (String) object; //downcasting
		
		Object object2 = "Minha String"; //Upcasting
		String s2 = (String) object2; //downcasting
		
		Object object3 = new Object(); 
		String s3 = (String) object3; // da erro em tempo de execução
		
		Object object4 = obterInteiro();
		String s4 = (String) object4; // da erro em tempo de execução
		
	}
	
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
