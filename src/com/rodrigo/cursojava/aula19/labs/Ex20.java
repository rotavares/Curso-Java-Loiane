package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		/*
		 * 1 Dólar americano está igual a 5,20 Reais na data 03/03/2023
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Digite o " + (i + 1) + " valor em dólar para fazer a conversão em real");
			vetorA[i] = sc.nextDouble();
		}
		
		sc.close();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("U$" + vetorA[i] + "  = R$" + 5.20 * vetorA[i]);
		}
	}
}
