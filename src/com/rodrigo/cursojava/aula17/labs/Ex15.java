package com.rodrigo.cursojava.aula17.labs;

public class Ex15 {

	public static void main(String[] args) {
		int num, numA = 1 , numB = 0;
		
		for(int i=0; i < 10; i++) {
			System.out.print(numA+" ");
			num = numA + numB;
			numB = numA;
			numA = num;
		}

	}
}
