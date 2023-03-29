package com.rodrigo.cursojava.aula27.labs;

public class Ex01 {

	public static void main(String[] args) {

		Lamp lampada = new Lamp();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "LED";
		lampada.tipoAbajur = true;

		lampada.tipos = new String[5];

		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		System.out.println(lampada.ligarDesligarLuz(false));
	}
}
