/**
 * 
 */
package br.com.jumbo.operadores;

import java.util.Scanner;

/**
 * @author João Paulo
 *
 *         8 de jan. de 2022 08:11:05
 */
public class EstruturaEnquantoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		
		int x = sc.nextInt();
		
		
		
		
		while(resultado!= 3) {
			
			resultado = resultado + x;
			x = sc.nextInt();
			System.out.println(x);
		
		}
		
		System.out.println(resultado);
		sc.close();
		
	}

}
