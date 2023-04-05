package com.rodrigo.cursojava.aula27.labs;

import java.util.Scanner;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	int[] notasDisciplinas = new int[3];

	void verificarNota() {
		
		for (int i = 0; i < disciplinas.length; i++) {
			
			if (notasDisciplinas[i] >= 7) {
				System.out.println(nome + " aprovado em " + disciplinas[i]+".");
			} else {
				System.out.println(nome + " reprovado em " + disciplinas[i]+".");
			}
			
		}
		
	}

	void buscarAluno() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		nome = entrada.next();

		System.out.print("Matricula: ");
		matricula = entrada.next();

		if (nome.equals(nome) && matricula.equals(matricula)) {
			System.out.println();

			mostrarNotas();
			verificarAprovado();

		} else {
			System.out.println("Aluno não encontrado");
		}

		entrada.close();
	}

	void mostrarNotas() {

		String nomeDis = null;
		int notaDis;

		for (int i = 0, j = 0; i < disciplinas.length; i++, j++) {
			
			nomeDis = disciplinas[i];
			notaDis = notasDisciplinas[j];
			System.out.println(nomeDis + " " + notaDis);
			
		}
	}

	void exibirAluno() {

		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Matrícula: " + matricula);

	}

	void verificarAprovado() {

		int somaNotas = 0;

		for (int nota : notasDisciplinas) {
			somaNotas += nota;
		}

		int mediaNota = somaNotas / 3;

		if (mediaNota >= 7) {
			System.out.println(nome + ", Aprovado!");
		} else {
			System.out.println(nome + ", Reprovado!");
		}
	}

}
