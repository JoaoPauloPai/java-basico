/**
 * 
 */
package br.com.jumbo.classes;

import java.util.Scanner;

/**
 * @author Jo�o Paulo
 *
 * 4 de jan. de 2022
 * 20:07:22
 */
public class ScannerTeste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int j;
		
		x = sc.next();
		j = sc.nextInt();
		System.out.println("Voc� digitou : " + j);
		
	sc.close();
	}

}
