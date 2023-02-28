package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, soma = 0, media;
			
		System.out.print("Digite a quantidade de pessoas: ");
		int n = entrada.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
		
			System.out.print("Digite a idade da "+i+" pessoa: ");
			idade = entrada.nextInt();
			soma += idade;
			
		} media = soma/n;
		
		if(media >= 0 && media <= 25) {
			System.out.println("Turma é de jovens, com a média de idade de "+media+" anos");
		}
		
		if(media >= 26 && media <= 60) {
			System.out.println("Turma é de adultos, com a média de idade de "+media+" anos");
		}
		
		if(media > 60) {
			System.out.println("Turma é de idosos, com a média de idade de "+media+" anos");
		}
			entrada.close();
	}
}
