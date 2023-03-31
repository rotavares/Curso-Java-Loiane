package com.rodrigo.cursojava.aula27.labs;

import java.util.Scanner;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;

	void sacarDinheiro(double valor) {

		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Não é possível sacar esse valor");
		}
	}

	void depositarDinheiro(double valor) {

		saldo += valor;
	}

	void consultarSaldo() {

		System.out.println("Saldo = R$ " + saldo);
	}

	void consultarEspecial() {

		System.out.println("Limite especial = R$ " + especial);
	}
	
	void exibirOpcoes() {
		System.out.println("'1' Consultar saldo | '2' Depositar | '3' Sacar | '0' Sair");
	}
	
	void opcoes() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;

		while (!sair) {

			byte escolha = scan.nextByte();

			switch (escolha) {
			case 1:
				System.out.println("Deseja consultar também o limite especial? : s/N ");

				char resposta = scan.next().charAt(0);

				if (especial) {

					if (resposta == 's' || resposta == 'S') {

						consultarEspecial();

						consultarSaldo();

					} else if (resposta == 'n' || resposta == 'N') {

						consultarSaldo();

					}

				} else {

					consultarSaldo();

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

				consultarSaldo();

				break;

			case 0:

				sair = true;

				break;

			default:

				System.out.println("Número inválido, digite novamente.");

				break;
			}
			scan.close();
		}
		
	}

	void IniciarMenu() {
		
		exibirOpcoes();

		opcoes();

	}

}
