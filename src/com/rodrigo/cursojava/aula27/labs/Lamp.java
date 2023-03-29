package com.rodrigo.cursojava.aula27.labs;

public class Lamp {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	
	String ligarDesligarLuz(boolean interruptor) {
		
		String statusLampada;
		
		if (interruptor) {
			statusLampada = "Lampada ligada";
		} else {
			statusLampada = "Lampada desligada";
		}
	
		return statusLampada;
	} 
}
