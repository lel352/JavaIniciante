package training.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resu = 1+2;
		System.out.println(resu);
		
		resu = resu -1;
		System.out.println(resu);
		
		resu = resu * 2;
		System.out.println(resu);
		
		resu = resu /2;
		System.out.println(resu);
		
		resu = resu + 8;
		System.out.println(resu);
		
		resu = resu % 7;
		System.out.println(resu);
		
		String primeiro = "esta � ";
		String segundo = "uma String concatenada";
		String terceiro = primeiro+segundo;
		
		System.out.println(terceiro);
		
		resu = resu + 1;
		System.out.println(resu);
		resu++;
		System.out.println(resu);
		
		
		System.out.println(resu++); //primeiro ele imprimi depois ele adiciona
		/*� como 
		 * System.out.println(resu)
		 * resu++;
		 * */
		System.out.println(++resu); //primeiro ele soma depois imprimi
		/*� como
		 * resu++; 
		 * System.out.println(resu); 
		 * */
		
		resu--;
		System.out.println(resu);
		
		System.out.println(resu--); //primeiro ele imprimi, depois ele subtrai
		/*� como 
		 * System.out.println(resu)
		 * resu--;
		 * */
		System.out.println(--resu); //primeiro ele subtrai, depois imprimi
		/*� como
		 * resu--; 
		 * System.out.println(resu); 
		 * */		
	}

}
