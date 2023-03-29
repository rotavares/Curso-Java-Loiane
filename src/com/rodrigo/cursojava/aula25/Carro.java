package com.rodrigo.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPAssageiros;
	int capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
}
