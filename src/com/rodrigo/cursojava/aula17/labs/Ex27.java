package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int alunos, soma = 0, media;
			
		System.out.print("Digite a quantidade de turmas: ");
		int qtdTurmas = entrada.nextInt();
		
		
		for (int i = 1; i <= qtdTurmas; i++) {
		
			System.out.print("Digite a quantidade de alunos da "+i+" turma (As turmas não podem ter mais de 40 alunos): ");
			alunos = entrada.nextInt();
			
			while(alunos > 40) {
				System.out.println("****Digite a quantidade de alunos da "+i+" turma (As turmas não podem ter mais de 40 alunos)****");
				alunos = entrada.nextInt();
			}
			
			soma += alunos;
			
		} media = soma/qtdTurmas;
		System.out.println("A média de alunos por turma é de "+media+" alunos");
		entrada.close();
		
	}
}
