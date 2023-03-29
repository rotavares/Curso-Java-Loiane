package com.rodrigo.cursojava.aula27.labs;

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

			return saldoAtual;
		}
	}
}
