/**
 * 
 */
package br.com.jumbo.classes;

import java.util.Locale;

/**
 * @author João Paulo
 *
 * 31 de dez. de 2021
 * 09:34:59
 */
public class Produtos {


	public static void main(String[] args) {
	
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;  /*Preço*/
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products :");
		System.out.printf("%s, wich price is $ %.2f %n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f %n", product2, price2);
		
		
		
		System.out.printf("Record : %d years old, code %d and gender: %s %n",age, code, gender);
		
		
		
		System.out.printf("Measue with eight decimal places : %.8f %n" ,measure);
		System.out.printf("Rouded (three decimal places) : %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimail point : %.3f", measure);
		
	}

}
