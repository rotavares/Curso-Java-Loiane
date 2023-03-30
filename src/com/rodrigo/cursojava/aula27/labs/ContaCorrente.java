package com.rodrigo.cursojava.aula27.labs;

import java.util.Scanner;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;

	double sacarDinheiro(double valor) {

		double saldoAtual;

		if (especial) {

			limiteEspecial = limiteEspecial - valor;

			return limiteEspecial;
		} else {

			saldoAtual = saldo - valor;

			saldo = saldoAtual;

			return saldoAtual;
		}
	}

	double depositarDinheiro(double valor) {

		double saldoAtual = saldo + valor;

		return saldoAtual;
	}

	double consultarSaldo(boolean consultarEspecial) {

		if (consultarEspecial) {

			return limiteEspecial;
		} else {

			return saldo;
		}
	}

	void IniciarMenu() {

		Scanner scan = new Scanner(System.in);

		boolean sair = false;

		while (!sair) {

			System.out.println("'1' Consultar saldo | '2' Depositar | '3' Sacar | '0' Sair");

			System.out.println();

			byte escolha = scan.nextByte();

			switch (escolha) {
			case 1:
				System.out.println("Deseja consultar também o limite especial? : s/N ");

				char resposta = scan.next().charAt(0);

				if (especial) {

					if (resposta == 's' || resposta == 'S') {

						System.out.println("Limite especial = " + consultarSaldo(especial));

						System.out.println("Saldo = " + consultarSaldo(false));

					} else if (resposta == 'n' || resposta == 'N') {

						System.out.println("Saldo = " + consultarSaldo(false));

					}

				} else {

					System.out.println("Saldo = " + consultarSaldo(especial));

				}

				break;

			case 2:

				System.out.println("Digite o valor do deposito: ");

				double valorDeposito = scan.nextDouble();

				depositarDinheiro(valorDeposito);

				System.out.println("Deposito efetuado com sucesso!");

				break;

			case 3:

				System.out.println("Digite o valor para saque: ");

				double valorSaque = scan.nextDouble();

				sacarDinheiro(valorSaque);

				System.out.println("Seu saldo atual = " + consultarSaldo(false));

				break;

			case 0:

				sair = true;

				break;

			default:

				System.out.println("Número inválido, digite novamente.");

				break;
			}

		}

		scan.close();

	}

}
