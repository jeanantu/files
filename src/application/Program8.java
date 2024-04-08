package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import model.entities.Produto;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do arquivo: ");
		String arquivo = sc.nextLine();
		
		System.out.println("Lendo arquivo ... ");
		List<Produto> product = new ArrayList<>();
        
		try (BufferedReader bf = new BufferedReader(new FileReader(arquivo))) {
			String produto;
			Double preco;
			Integer quantidade;
			
			String linhaTexto = bf.readLine();
			while(linhaTexto != null) {				
				String[] linhafinal = linhaTexto.split(";|;\\\\s");
				produto = linhafinal[0];
				preco   = Double.parseDouble(linhafinal[1]);
				quantidade = Integer.parseInt(linhafinal[2]);
				//System.out.println(produto);
				//System.out.println(preco);
				//System.out.println(quantidade);
				product.add(new Produto(produto, preco, quantidade));
				linhaTexto = bf.readLine();			
			}
						
		}catch(IOException e) {
			System.out.println("Erro : "+e.getMessage());
		}
		
		String path = "C:\\Temp\\java\\summary.csv";
        System.out.print("Iniciando escrita arquivo ..... ");
		
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(path))) {
			for(Produto p: product) {
				Double vl_total = p.getValor() * p.getQuantidade();
				bfw.write(p.getNome()+";"+vl_total);
				bfw.newLine();
			}
		} catch(IOException e){
			e.printStackTrace();		
		}
		
		sc.close();
	}

}
