/**
 * 
 */
package br.com.jumbo.principal;

import java.util.Locale;
import java.util.Scanner;

import br.com.jumbo.modelos.Product;

/**
 * @author João Paulo
 *
 * 9 de jan. de 2022
 * 14:01:24
 */
public class Principal {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Product product = new Product();
		
		System.out.println("Enter product data : ");
		System.out.print("Name : ");
        product.name = sc.nextLine();
    	System.out.print("Price : ");
        product.price = sc.nextDouble();
		System.out.print("Enter in stock : ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		
		sc.close();
	}

}
