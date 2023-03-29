package com.rodrigo.cursojava.aula27;

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
		
		double qtdCombustivel10 = fusca.calcularCombustivel(10);
		double qtdCombustivel15 = fusca.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
	}
}
