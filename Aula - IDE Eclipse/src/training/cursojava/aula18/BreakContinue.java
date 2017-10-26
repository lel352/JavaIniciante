package training.cursojava.aula18;

import java.util.Scanner;

import javax.swing.plaf.RootPaneUI;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int numero = scan.nextInt();
		
		System.out.println("Entre com limite: ");
		int maximo = scan.nextInt();
		
		for (int i = numero; i <= maximo; i++) {
			if ((i % 7)==0){
				System.out.println(i);
				break;	
			}
			
		}
		
		System.out.println("--------------continue------------------");
		
		for (int i = numero; i <= maximo; i++) {
			if ((i % 7)==0){
				continue;
			}			
			System.out.println(i);			
		}
		
		
		System.out.println("--------------Break Rotulo------------------");
		
		for (int i = 0; i <= 4; i++) {
			rotulo1:{
				rotulo2:{
					rotulo3:{
						if (i==1) {
							break rotulo1;
						}
						if (i==2) {
							break rotulo2;
						}
						if (i==3) {
							break rotulo3;
						}
						System.out.println("Rotulo3");
					}
					System.out.println("Rotulo2");
				}
				System.out.println("Rotulo1");
			}
			System.out.println(i);
		}
		
		
		
		

	}

}
