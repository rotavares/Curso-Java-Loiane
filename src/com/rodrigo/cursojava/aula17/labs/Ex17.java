package com.rodrigo.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		  System.out.println("Digite um número:");
	        int num = entrada.nextInt();
	        
	        System.out.print(num + "!=");
	        
	        int fatorial = 1;
	        for (int i=num; i>0; i--){
	            fatorial *= i;
	            System.out.print(i);
	            
	            if(i != 1) {
	            	System.out.print(".");
	            }
	        }
	        System.out.print("="+fatorial);
	        
		entrada.close();

	}
}
