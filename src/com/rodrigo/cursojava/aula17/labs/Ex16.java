package com.rodrigo.cursojava.aula17.labs;

public class Ex16 {

	public static void main(String[] args) {
		
		int num, contagem = 0, numA = 1 , numB = 0;
		
		do {
			System.out.print(numA+" ");
			num = numA + numB;
			numB = numA;
			numA = num;
			while(numA > 500) {
				contagem++;
			}
		} while(contagem < 15);

	}
}
