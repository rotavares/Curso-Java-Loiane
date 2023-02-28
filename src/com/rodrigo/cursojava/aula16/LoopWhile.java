package com.rodrigo.cursojava.aula16;

public class LoopWhile {

		public static void main(String[] args) {
			
			int i = 1;
			int max = 10;
			
			System.out.println("Contando até "+ max);
			
			while (i <= max) { // primeiro avalia a expressão
				System.out.println("Valor de i: "+ i);
				i++; // i = i + 1; ou i += i;
			}
			
			System.out.println(i);
			
			do { // primeiro executa o bloco de código, depois avalia a expressão
				i++;
				System.out.println("Valor de i: "+i);
			} while (i < 15);
			
			System.out.println(i);
		}
}
