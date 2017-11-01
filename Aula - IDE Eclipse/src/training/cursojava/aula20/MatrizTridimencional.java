package training.cursojava.aula20;

public class MatrizTridimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] matrizTridimencional = new int[3][3][3];
		
				
		for (int i = 0; i < matrizTridimencional.length; i++) {
			for (int j = 0; j < matrizTridimencional[i].length; j++) {
				for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
					matrizTridimencional[i][j][k] = i+j+k;
				}
			}		
		}
		
		int soma = 0;
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < matrizTridimencional.length; i++) {
			for (int j = 0; j < matrizTridimencional[i].length; j++) {
				for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
					matrizTridimencional[i][j][k] = i+j+k;
					soma += matrizTridimencional[i][j][k];
					if (matrizTridimencional[i][j][k] % 2 == 0)
						par += matrizTridimencional[i][j][k];
					//else
					//  impar += matrizTridimencional[i][j][k];
				}
			}		
		}
		
		impar = soma - par;
		System.out.println("Soma total: "+soma);
		System.out.println("Soma dos pares: "+par);
		System.out.println("Soma dos impares: "+impar);
	}
}

