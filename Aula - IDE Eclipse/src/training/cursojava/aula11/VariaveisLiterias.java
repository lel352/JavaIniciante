package training.cursojava.aula11;

public class VariaveisLiterias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decVal = 26;
		int hexVal = 0x1a;
		int octVal = 032;
		int binVal = 0b11010;
		
		System.out.println("dec: "+decVal);
		System.out.println("hex: "+hexVal);
		System.out.println("oct: "+octVal);
		System.out.println("bin: "+binVal);
		
		//pode separa numeros com _ para visualizar melhor
		long cpf = 100_134_156_68L;
		float pi = 3.14_15f;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7FFF_FFFF_FFFF_FFFFL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println("cpf: "+cpf);
		System.out.println("pi: "+pi);
		System.out.println("hexbytes: "+hexBytes);
		System.out.println("hexWords: "+hexWords);
		System.out.println("maxlong: "+maxLong);
		System.out.println("nybbles: "+nybbles);
		System.out.println("bytes: "+bytes);
		
		
		int oct31 = 031;
		int dec25 = 25;
		
		System.out.println(oct31 == dec25);
		
		
	}

}
