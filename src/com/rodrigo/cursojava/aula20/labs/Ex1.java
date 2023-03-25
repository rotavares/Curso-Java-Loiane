package com.rodrigo.cursojava.aula20.labs;

import java.security.SecureRandom;

public class Ex1 {

	public static void main(String[] args) {

		int[][] M = new int[4][4];
		int num_maior = Integer.MIN_VALUE;
		int num_menor = Integer.MAX_VALUE;
		int posi_maior = 0;
		int posj_maior = 0;
		int posi_menor = 0;
		int posj_menor = 0;

		for (int i = 0; i < M.length; i++) {

			for (int j = 0; j < M[i].length; j++) {

				M[i][j] = new SecureRandom().nextInt(9);
			}
		}

		for (int i = 0; i < M.length; i++) {

			for (int j = 0; j < M[i].length; j++) {

				System.out.print(M[i][j]);
			}

			System.out.println();
		}

		for (int i = 0; i < M.length; i++) {

			for (int j = 0; j < M[i].length; j++) {

				if (M[i][j] < num_menor) {

					num_menor = M[i][j];
					posi_menor = i;
					posj_menor = j;
				}

				if (M[i][j] > num_maior) {

					num_maior = M[i][j];
					posi_maior = i;
					posj_maior = j;
				}
			}
		}

		System.out.println("Maior número é o " + num_maior + ", na linha " + posi_maior + " coluna " + posj_maior);
		System.out.println("Menor número é o " + num_menor + ", na linha " + posi_menor + " coluna " + posj_menor);
	}
}
