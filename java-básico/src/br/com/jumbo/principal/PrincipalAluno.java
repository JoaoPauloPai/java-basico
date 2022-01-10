/**
 * 
 */
package br.com.jumbo.principal;

import java.util.Locale;
import java.util.Scanner;

import br.com.jumbo.modelos.Aluno;

/**
 * @author João Paulo
 *
 * 10 de jan. de 2022
 * 13:57:12
 */
public class PrincipalAluno {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Enter com o nome do aluno : ");
		System.out.print("Name : ");
	
        aluno.nome = sc.nextLine();

        System.out.println("Enter com a nota do aluno : ");
		System.out.print("Nota a : ");
        aluno.nota_a= sc.nextDouble();
        
        System.out.println("Enter com a nota do aluno : ");
		System.out.print("Nota b : ");
        aluno.nota_b= sc.nextDouble();
        
        System.out.println("Enter com a nota do aluno : ");
		System.out.print("Nota c : ");
        aluno.nota_c= sc.nextDouble();
        
		System.out.println();
		System.out.println("Resultado : " + aluno);
		
        
        sc.close();
	}

}
