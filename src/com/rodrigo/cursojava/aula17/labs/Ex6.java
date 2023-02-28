package com.rodrigo.cursojava.aula17.labs;

public class Ex6 {

	public static void main(String[] args) {
		int contagem = 0;
		while (contagem <= 20) {
			System.out.println(contagem);
			contagem++;
		}
		
		contagem = 0;
		while (contagem <= 20) {
			System.out.print(contagem);
			contagem++;
			System.out.print(" ");
		}

	}
}
