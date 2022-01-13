/**
 * 
 */
package br.com.jumbo.principal;

import java.util.Locale;
import java.util.Scanner;

import br.com.jumbo.membros.CompraDollar;

/**
 * @author João Paulo
 *
 * 12 de jan. de 2022
 * 21:30:11
 */
public class PrincipalDollar {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Valor");
		double valor = sc.nextDouble();
		
		double d = CompraDollar.converteMoeda(valor);

		
		System.out.println("Valor");
		System.out.printf("Total : %.2f%n",d);
		
		sc.close();
	}

}
