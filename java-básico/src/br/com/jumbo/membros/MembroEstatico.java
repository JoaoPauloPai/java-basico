/**
 * 
 */
package br.com.jumbo.membros;

/**
 * @author João Paulo
 *
 * 12 de jan. de 2022
 * 20:53:51
 */
public class MembroEstatico {
	
	public static final double PI = 3.14159;
	
	public static double circunferencia(double radius) {
		return 2.0 * PI * radius;
		
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	}

}
