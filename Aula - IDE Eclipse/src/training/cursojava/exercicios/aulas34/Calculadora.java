package training.cursojava.exercicios.aulas34;

import java.util.Scanner;

public class Calculadora {
	public static int soma(int numero1, int numero2) {
		return (numero1+numero2);
	}
	
	public static int subtrair(int numero1, int numero2) {
		return (numero1-numero2);
	}
	
	public static int multiplicar(int numero1, int numero2) {
		return (numero1*numero2);
	}
	
	public static int dividir(int numero1, int numero2) {
		return (numero1/numero2);
	}
	
	public static double elevar(int numero1, int potencia) {
		return Math.pow(numero1,potencia);
	}
	
	public static int fatorial(int numero1) {
		if (numero1 == 0) 
			return 1;
		int f = numero1;
		int valor = f;
		for (int i = (f-1); i > 0; i--) {
			valor *= i;
		}
 		return valor; 
	}
}
