/**
 * 
 */
package br.com.jumbo.operadores;

import java.util.Scanner;

/**
 * @author Jo�o Paulo
 *
 *         8 de jan. de 2022 08:30:27
 */
public class EstruturaParaFor {

	public static void main(String[] args) {
	

		int N = 3;

		int result1 = 0;
		int result2 = 0;

		for (int i = 0; i < N; i++) {

			result1 = result1 + i;
			System.out.printf("Resultado Vari�vel i : " + i + ",");
			System.out.printf(" Variav�l result1 : " + result1 + ",");
			
			result2 = result2 + 5;
			System.out.println(" Varialvel result2 " + result2);
			
		}
	
		System.out.println("Fim do La�o!");
	}

}
