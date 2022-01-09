/**
 * 
 */
package br.com.jumbo.modelos;

/**
 * @author João Paulo
 *
 * 9 de jan. de 2022
 * 14:12:35
 */
public class ClasseTriangulo {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p - a * (p - b) * (p - c) );
	}

}
