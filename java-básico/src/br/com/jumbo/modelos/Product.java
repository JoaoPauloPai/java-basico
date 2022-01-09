/**
 * 
 */
package br.com.jumbo.modelos;

/**
 * @author João Paulo
 *
 * 9 de jan. de 2022
 * 14:23:58
 */
public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock(){
		
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
	}

	public String toString() {
		return name
				+ ", $ "
				+ price
				+ " , "
				+ quantity
				+ " units, Total: $ "
				+ totalValueStock();
		
	}
}
