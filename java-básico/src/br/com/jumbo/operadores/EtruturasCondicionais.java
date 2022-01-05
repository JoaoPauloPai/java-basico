/**
 * 
 */
package br.com.jumbo.operadores;

import java.util.Scanner;

/**
 * @author João Paulo
 *
 *         4 de jan. de 2022 20:54:11
 */
public class EtruturasCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas Horas?");
		hora = sc.nextInt();

		if (hora < 12 || hora == 12) {

			System.out.println("Bom Dia!");

		} else if (hora < 18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}

		sc.close();
	}

}