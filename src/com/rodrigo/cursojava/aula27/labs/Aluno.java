package com.rodrigo.cursojava.aula27.labs;

public class Aluno {

	String nome;
	String mattricula;
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
	
}
