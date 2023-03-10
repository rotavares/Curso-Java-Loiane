package com.rodrigo.cursojava.aula19.labs;

public class Ex33 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Os divisores de " + vetorA[i] + " = ");
			
			for (int j = 1; j <= vetorA[i]; j++) {
				
				if (vetorA[i] % j == 0) {
					
					System.out.print(j);
					
					if (j != vetorA[i]) {
						System.out.print(", ");
					}
					else {
						System.out.print(".");
					}
				}
			}
			
			System.out.println();
		}
	}
}
