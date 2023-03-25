package com.rodrigo.cursojava.aula20.labs;

import java.security.SecureRandom;

public class Ex2 {

	public static void main(String[] args) {

		int[][] M = new int[10][10];
		int num_maior = Integer.MIN_VALUE;
		int num_menor = Integer.MAX_VALUE;

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

		for (int i = 0; i < M[5].length; i++) {

			if (M[5][i] > num_maior) {

				num_maior = M[5][i];
			}

			if (M[5][i] < num_menor) {

				num_menor = M[5][i];
			}
		}

		System.out.println("Maior valor da linha 5 = " + num_maior + "\nMenor valor da linha 5 = " + num_menor);

		num_maior = Integer.MIN_VALUE;
		num_menor = Integer.MAX_VALUE;

		for (int i = 0; i < M.length; i++) {

			for (int j = 0; j < M[i][7]; j++) {

				if (M[i][7] > num_maior) {

					num_maior = M[i][7];
				}

				if (M[i][7] < num_menor) {

					num_menor = M[i][7];
				}
			}
		}

		System.out.println("Maior valor da coluna 7 = " + num_maior + "\nMenor valor da coluna 7 = " + num_menor);
	}
}
