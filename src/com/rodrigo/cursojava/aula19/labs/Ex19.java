package com.rodrigo.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nota1 = new int[10];
		int[] nota2=  new int[10];
		int[] result = new int[10];
		
		for (int i = 0; i < nota1.length; i++) {
			
			System.out.println("Digite a primeira nota do " + (i+1) + " aluno");
			nota1[i] = sc.nextInt();
			
			System.out.println("Digite a segunda nota do " + (i + 1) + " aluno");
			nota2[i] = sc.nextInt();			
		}
		
		sc.close();
		
		for (int i = 0; i < result.length; i++) {	
			
			result[i] = (nota1[i] + nota2[i]) / 2;
			
			if (result[i] >= 7) {
				System.out.println("O " + (i + 1) + " aluno está aprovado");
			}
			else {
				System.out.println("O " + (i + 1) + " aluno está reprovado");
			}
		}
		
		
	}

}
