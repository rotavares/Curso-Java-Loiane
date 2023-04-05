package com.rodrigo.cursojava.aula27.labs;

public class Ex03 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Rodrigo";
		aluno.matricula = "1234567";
		aluno.curso = "Física";
		aluno.disciplinas[0] = "portugues";
		aluno.disciplinas[1] = "matematica";
		aluno.disciplinas[2] = "fisica";
		aluno.notasDisciplinas[0] = 8;
		aluno.notasDisciplinas[1] = 6;
		aluno.notasDisciplinas[2] = 10;
		
		aluno.verificarNota();
	}

}
