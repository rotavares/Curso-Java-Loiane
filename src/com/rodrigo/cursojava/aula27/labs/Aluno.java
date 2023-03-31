package com.rodrigo.cursojava.aula27.labs;

import java.util.Scanner;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	int[] notasDisciplinas = new int[3];

	void verificarNota() {

		for (String disciplina : disciplinas) {

			for (int nota : notasDisciplinas) {

				if (nota >= 7) {
					System.out.println(nome + "aprovado em " + disciplina);
				} else {
					System.out.println(nome + "reprovado em " + disciplina);
				}

			}
		}

	}

	void buscarAluno() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		nome = entrada.next();

		System.out.print("Matricula: ");
		matricula = entrada.next();

		System.out.print("Curso: ");
		curso = entrada.next();

		for (String nomeDisciplina : disciplinas) {
			System.out.print("Nome disciplina: ");
			entrada.next();
		}
		
		entrada.close();
	}
	
	void mostrarNotas() {
		
		for (String disciplina : disciplinas) {
			System.out.print(disciplina);
			for (int nota : notasDisciplinas) {
				System.out.println(" "+nota);
			}
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
