/**
 * 
 */
package br.com.jumbo.modelos;

/**
 * @author João Paulo
 *
 * 10 de jan. de 2022
 * 13:50:28
 */
public class Aluno {
	public String nome;
	public double nota_a;
	public double nota_b;
	public double nota_c;
	public double totalNota;
	public String result;

	public double somaTotalNota() {
		totalNota = (nota_a + nota_b + nota_c) / 3;
		
		return totalNota;
	}
	public double verificaPontos() {
		if(totalNota < 60.0 ) {
			
			return 60.0 - totalNota;
		}else
			return 0.0;
	}
	
	public String resultado() {
		
		if(totalNota < 60.00) {
		result = "reprovado";
		}else {
			result = "Aprovado";
		}
		
		return result;
	}
	
	public String toString() {
		return " Nome do aluno :"
				+ nome 
				+ ", nota a "
				+ nota_a
				+ ", nota b "
				+ nota_b
				+ ", nota c "
				+ nota_c
				+ ", Média das notas : "
				+ somaTotalNota()
				+ " , resultado final"
				+ result;
		
	}

}
