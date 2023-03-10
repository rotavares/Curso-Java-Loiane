package com.rodrigo.cursojava.aula19.labs;

public class Ex32 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		System.out.print("Vetor A = ");
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 100);
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			boolean primo = true;
			
			for (int j = 2; j < vetorA[i]; j++) {
				
				if (vetorA[i] % j == 0) {
					
					primo = false;
				}
				
			}
			
			if (primo) {
				
				System.out.println(vetorA[i] + " é primo");
			}
			else {
				
				System.out.println(vetorA[i] + " não é primo");
			}
		}
	}
}
