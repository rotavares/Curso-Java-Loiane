package com.rodrigo.cursojava.aula19.labs;

public class Ex22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		int i = 0;
		boolean par = true;
		
		while (par) {
			
			vetorA[i] = (int)(Math.random() * 1000);
			
			if (vetorA[i] % 2 != 0) {
				par = false;
			}
			
			System.out.println(vetorA[i] + " ");
			i++;
		}
	}
}
