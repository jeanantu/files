package application;

import java.io.File;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com caminho da pasta: ");
		String strPath = sc.nextLine();
		
		// instancia classe File adicionando caminho ser utilizado na leitura
		// serve para pastas e arquivos
		File path = new File(strPath);
		
		// instancia vetor classe File adicionando lista de pastas
		// usado expressao lambda como parametro
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("PASTAS:");
		
		for(File folder: folders) {
			System.out.println(folder);
		}
		System.out.println();
		
		// instancia vetor classe File adicionando lista de arquivos
		// usado expressao lambda como parametro
		File[] files = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS:");
		
		for(File file: files) {
			System.out.println(file);
		}
		
		// processo criacao nova pasta
		boolean sucess = new File(strPath+"\\tanga").mkdir();
		System.out.println("Resultado do processo criacao pasta tanga: "+sucess);
		
		sc.close();
	}

}
