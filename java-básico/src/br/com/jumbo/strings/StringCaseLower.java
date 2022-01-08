/**
 * 
 */
package br.com.jumbo.strings;

/**
 * @author João Paulo
 *
 *         8 de jan. de 2022 09:25:48
 */
public class StringCaseLower {

	public static void main(String[] args) {
		
		String original = "abcdede FGHIJ aBCDE FaFHI bc ";
 
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2,9);
		String s6 = original.replace('a', 'z');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("String Original : "+"*" + original+"*");
		System.out.println("String toLowerCase : "+"*" + s1+ "*");
		System.out.println("String toUperCase : "+"*" + s2+ "*");
		System.out.println("String trim : "+"*" + s3+ "*");
		System.out.println("String substring (2) : "+"*" + s4+ "*");
		System.out.println("String substring (2,9) : "+"*" + s5+ "*");
		System.out.println("String indexOf: " + i);
		System.out.println("String lastIndexOf: " + j);
		
		
	}

}
