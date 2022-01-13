/**
 * 
 */
package br.com.jumbo.principal;

import java.util.Locale;
import java.util.Scanner;

import br.com.jumbo.membros.MembroEstatico;

/**
 * @author João Paulo
 *
 * 12 de jan. de 2022
 * 20:55:00
 */
public class PrincipalStatico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		
		double c = MembroEstatico.circunferencia(radius);
		
		double v = MembroEstatico.volume(radius);
		
		System.out.printf("Circunferencia : %.2f%n",c);
		System.out.printf("Volume : %.2f%n",v);
		System.out.printf("PI Valor : %.2f%n",MembroEstatico.PI);
		
		sc.close();
	}
}
