/**
 * 
 */
package br.com.jumbo.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.jumbo.modelos.Pessoa;

/**
 * @author João Paulo
 *
 *         16 de jan. de 2022 17:49:09
 */
public class ApachePoi {

	public static void main(String[] args) throws Exception {

		File arquivo = new File(
				"C:\\Users\\user\\git\\java-basico\\java-básico\\src\\br\\com\\jumbo\\arquivos\\arquivo_exel.xls");

		if (!arquivo.exists()) {

			arquivo.createNewFile();

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

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();// Para escrever a planilha
		HSSFSheet LinhaPesssoa = hssfWorkbook.createSheet("Planilha de Pessoa");/* Cria a Planilha */

		int numerolinha = 0;
		for (Pessoa p : pessoas) {

			Row linha = LinhaPesssoa.createRow(numerolinha++);// Criando a linha na planilha

			int celula = 0;

			Cell celulaNome = linha.createCell(celula++);// Cécula 1
			celulaNome.setCellValue(p.getNome());

			Cell celulaIdade = linha.createCell(celula++);// Célula 2
			celulaIdade.setCellValue(p.getIdade());

			Cell celulaEmail = linha.createCell(celula++);// Célula 3
			celulaEmail.setCellValue(p.getEmail());
		} // Termina de montar a planílha

		FileOutputStream saida = new FileOutputStream(arquivo);

		hssfWorkbook.write(saida);// Escreve a planilha em arquivo
		saida.flush();
		saida.close();

		System.out.println("Planilha foi criada com susseso!");
	}

}
