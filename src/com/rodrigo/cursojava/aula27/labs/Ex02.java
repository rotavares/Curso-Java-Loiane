package com.rodrigo.cursojava.aula27.labs;

public class Ex02 {

	public static void main(String[] args) {

		ContaCorrente contaRodrigo = new ContaCorrente();
		contaRodrigo.numero = "123456";
		contaRodrigo.agencia = "1234";
		contaRodrigo.especial = true;
		contaRodrigo.limiteEspecial = 300;
		contaRodrigo.saldo = 180;

		contaRodrigo.IniciarMenu();
	}
}
