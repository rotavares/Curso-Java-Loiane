package com.rodrigo.cursojava.aula19.labs;

public class Ex34 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[11];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.pow(2, i);
			
			System.out.print("vetorA[" + i + "]" + " = " + vetorA[i] + "\n");
		}
	}
}
