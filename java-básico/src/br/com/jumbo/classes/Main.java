/**
 * 
 */
package br.com.jumbo.classes;

import java.util.Locale;

/**
 * @author Jo�o Paulo
 *
 * 31 de dez. de 2021
 * 08:56:34
 */
public class Main {


	public static void main(String[] args) {
		
		
		
		String nome = "Jo�o Paulo";
		int idade = 38;
		double renda = 10.35796;
		
		System.out.println("Ol� meu nome � : " + nome);
		System.out.println("Valor de renda :" + renda);
		System.out.printf("Valor de renda com duas casas decimais : " + "%.2f%n", renda );
		System.out.printf("Valor de renda com quatro casas decimais : " + "%.4f%n", renda );
		System.out.printf("Valor de renda com duas casa decimais : " + "%.2f%n", renda );

		System.out.printf("Meu nome � %s, tenho %d anos, trabalho com desenvovimento de software e minha renda � R$ %.3f mensal. %n",nome, idade, renda);
		
		
		/*Impremir com ponto separador e n�o dom v�rgula*/
		Locale.setDefault(Locale.US);
		System.out.printf("Valor de renda com duas casa decimais : " + "%.2f%n", renda );
		
		
	
		

	}

}
