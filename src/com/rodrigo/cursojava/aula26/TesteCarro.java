package com.rodrigo.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {

		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPAssageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;

		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

		fusca.exibirAutonomia();
		
		double autonomia = fusca.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + fusca.obterAutonomia());
	}
}
