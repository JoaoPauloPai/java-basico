/**
 * 
 */
package br.com.jumbo.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import br.com.jumbo.modelos.Pessoa;

/**
 * @author João Paulo
 *
 *         16 de jan. de 2022 16:09:37
 */
public class LerArquivosTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaDados = new FileInputStream(
				new File("C:\\Users\\user\\git\\java-basico\\java-básico\\src\\br\\com\\jumbo\\arquivos\\arquivo.txt"));

		try (Scanner lerArquivo = new Scanner(entradaDados, "UTF-8")) {

			while (lerArquivo.hasNext()) {

				String linha = lerArquivo.nextLine();

				if (linha != null && !linha.isEmpty()) {

					String[] dados = linha.split("\\|");

					List<Pessoa> pessoas = new ArrayList<Pessoa>();

					Pessoa pessoa = new Pessoa();
					pessoa.setNome(dados[0]);
					pessoa.setIdade(Integer.parseInt(dados[1]));
					pessoa.setEmail(dados[2]);

					pessoas.add(pessoa);
			
					for(Pessoa p : pessoas) {

						System.out.println(pessoa);
					}
					



				}
			}
		}

	}

}
