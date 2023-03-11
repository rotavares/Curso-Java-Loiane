package com.rodrigo.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = {{10, 7, 9, 9.5}, {9, 8, 7, 9}, {8, 9, 10, 7}};
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			System.out.print("Notas do " + (i+1) + " aluno, ");
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				System.out.print(notasAlunos[i][j]);
				
				if (j != 3) {
					
					System.out.print(" - ");
				}
			}
			
			System.out.println();
		}
		
		double soma;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			soma = 0;
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				soma += notasAlunos[i][j];

			}
			System.out.println("Média do aluno " + (i+1) + " = " + (soma / 4));
		}
	}
}
