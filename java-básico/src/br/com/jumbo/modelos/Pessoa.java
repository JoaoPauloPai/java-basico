/**
 * 
 */
package br.com.jumbo.modelos;

/**
 * @author João Paulo
 *
 * 16 de jan. de 2022
 * 15:29:57
 */
public class Pessoa {
	
	private String nome;
	private String email;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	
	
	

}
