package application;

import java.io.File;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com caminho da pasta: ");
		String strPath = sc.nextLine();
		
		// instancia classe File adicionando caminho ser utilizado na leitura
		// serve para pastas e arquivos
		File path = new File(strPath);
		
		//captura caminho e nome arquivo
		System.out.println("getPath: " +path.getPath());
		//captura apenas caminho
		System.out.println("getParent: " +path.getParent());
		//captura somente nome arquivo
		System.out.println("getName: " +path.getName());
		
		sc.close();
		

	}

}
