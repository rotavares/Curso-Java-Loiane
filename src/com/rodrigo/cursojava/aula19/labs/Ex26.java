package com.rodrigo.cursojava.aula19.labs;

public class Ex26 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for (int i = 0; i < vetorB.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 10);
			
			if (vetorA[i] < 7) {
				
				vetorB[i] = 'a';
			}
			else if (vetorA[i] == 7) {
				
				vetorB[i] = 'b';
			}
			else if (vetorA[i] > 7 && vetorA[i] < 10) {
				
				vetorB[i] = 'c';
			}
			else if (vetorA[i] == 10) {
				
				vetorB[i] = 'd';
			}
			else if (vetorA[i] > 10) {
				
				vetorB[i] = 'e';
			}
		}
		
		System.out.print("Vetor B = ");
		
		for (int i = 0; i < vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
		}
	}
}
