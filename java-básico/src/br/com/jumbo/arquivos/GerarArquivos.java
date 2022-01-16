/**
 * 
 */
package br.com.jumbo.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.jumbo.modelos.Pessoa;

/**
 * @author João Paulo
 *
 *         16 de jan. de 2022 14:57:33
 */
public class GerarArquivos {

	public static void main(String[] args) throws IOException {

	

		File arquivo = new File("C:\\Users\\user\\git\\java-basico\\java-básico\\src\\br\\com\\jumbo\\arquivos\\arquivo2.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter escrevernoarquivo = new FileWriter(arquivo);

		escrevernoarquivo.write(" Meu texto do Arquivo");
		escrevernoarquivo.write("\n");
		escrevernoarquivo.write(" Minha segunda Linha");

		for (int i = 1; i <= 10; i++) {

			escrevernoarquivo.write("  Texto da minha linha : " + i + "\n");
		}
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("José da Silva");
		pessoa1.setEmail("Email@gmaol.com");
		pessoa1.setIdade(50);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("maria da Silva");
        pessoa2.setEmail("Emailw@email;com.br");
        pessoa2.setIdade(49);
        
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("marcos José Da Silva");
        pessoa3.setEmail("emaildomarcos@.com.br");
        pessoa3.setIdade(35);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		escrevernoarquivo.write(" Lista de Pessoas \n" );
		
		for(Pessoa p : pessoas) {
			
			escrevernoarquivo.write("Nome : " + p.getNome() + ", " + "Idade : "+ p.getIdade() +", "+"Email : "+ p.getEmail() +" \n");
		}

		escrevernoarquivo.flush();
		escrevernoarquivo.close();
	}

}
