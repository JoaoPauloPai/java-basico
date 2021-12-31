/**
 * 
 */
package br.com.jumbo.classes;

import java.util.Locale;

/**
 * @author João Paulo
 *
 * 31 de dez. de 2021
 * 08:56:34
 */
public class Main {


	public static void main(String[] args) {
		
		
		
		String nome = "João Paulo";
		int idade = 38;
		double renda = 10.35796;
		
		System.out.println("Olá meu nome é : " + nome);
		System.out.println("Valor de renda :" + renda);
		System.out.printf("Valor de renda com duas casas decimais : " + "%.2f%n", renda );
		System.out.printf("Valor de renda com quatro casas decimais : " + "%.4f%n", renda );
		System.out.printf("Valor de renda com duas casa decimais : " + "%.2f%n", renda );

		System.out.printf("Meu nome é %s, tenho %d anos, trabalho com desenvovimento de software e minha renda é R$ %.3f mensal. %n",nome, idade, renda);
		
		
		/*Impremir com ponto separador e não dom vírgula*/
		Locale.setDefault(Locale.US);
		System.out.printf("Valor de renda com duas casa decimais : " + "%.2f%n", renda );
		
		
	
		

	}

}
