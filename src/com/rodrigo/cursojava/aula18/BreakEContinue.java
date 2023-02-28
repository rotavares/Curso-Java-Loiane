package com.rodrigo.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		/*Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número.");
		
		int num = entrada.nextInt();
		System.out.println("Entre com um limite.");
		
		int max = entrada.nextInt();
		for (int i = num; i <= max; i++) {
			System.out.println(i);
			
			if(i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}*/
		
		/*for (int i = 1; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3:{
						if (i == 1) break rotulo1;
						if (i == 2) break rotulo2;
						if (i == 3) break rotulo3;
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println("o valor de i: " + i);
		}
		System.out.println("Saiu do loop.");*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número.");
		
		int num = entrada.nextInt();
		System.out.println("Entre com um limite.");
		
		int max = entrada.nextInt();
		for (int i = num; i <= max; i++) {
			
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("o valor de i: " + i);
		}
		entrada.close();
	}
}
