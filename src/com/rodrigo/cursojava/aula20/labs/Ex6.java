package com.rodrigo.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char[][] jogoVelha = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		char simbolo;
		int jogada = 1;
		boolean ganhou = false;

		System.out.println("Jogador 1 <X> - Jogador 2 <O>");
		System.out.println("1|2|3\n" + "-+-+-\n" + "4|5|6\n" + "-+-+-\n" + "7|8|9");

		while (!ganhou) {

			if (jogada % 2 == 1) { // jogador 1

				System.out.println("Jogador 1, entre com o número");
				simbolo = 'X';
			} else { // jogador 2

				System.out.println("Jogador 2, entre com o número");
				simbolo = 'O';
			}

			byte pos = entrada.nextByte();

			switch (pos) { // escolha posição
			case 1:

				if (jogoVelha[0][0] == 'X' || jogoVelha[0][0] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[0][0] = simbolo;
					jogada++;
				}
				break;

			case 2:
				if (jogoVelha[0][2] == 'X' || jogoVelha[0][2] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[0][2] = simbolo;
					jogada++;
				}
				break;

			case 3:
				if (jogoVelha[0][4] == 'X' || jogoVelha[0][4] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[0][4] = simbolo;
					jogada++;
				}
				break;

			case 4:
				if (jogoVelha[2][0] == 'X' || jogoVelha[2][0] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[2][0] = simbolo;
					jogada++;
				}
				break;

			case 5:
				if (jogoVelha[2][2] == 'X' || jogoVelha[2][2] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[2][2] = simbolo;
					jogada++;
				}
				break;

			case 6:
				if (jogoVelha[2][4] == 'X' || jogoVelha[2][4] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[2][4] = simbolo;
					jogada++;
				}
				break;

			case 7:
				if (jogoVelha[4][0] == 'X' || jogoVelha[4][0] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[4][0] = simbolo;
					jogada++;
				}
				break;

			case 8:
				if (jogoVelha[4][2] == 'X' || jogoVelha[4][2] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[4][2] = simbolo;
					jogada++;
				}
				break;

			case 9:
				if (jogoVelha[4][4] == 'X' || jogoVelha[4][4] == 'O') {
					System.out.println("Posição já preenchida, tente novamente");
				} else {
					jogoVelha[4][4] = simbolo;
					jogada++;
				}
				break;
			default:
				System.out.println("Posição inválida, tente novamente");
				break;
			}

			for (char[] cs : jogoVelha) { // mostrar jogo
				for (char i : cs) {
					System.out.print(i);
				}
				System.out.println();
			}

		}

		entrada.close();
	}
}
