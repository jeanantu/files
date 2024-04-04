package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Temp\\java\\tsaida.txt";
		
		System.out.print("Quantidades de nomes :");
		Integer num = sc.nextInt();
		
		String[] vnome = new String[num];
		
		sc.nextLine();
		for(int i=0; i < num; i++) {
			System.out.print("Entre com nome posicao "+(i+1)+":");
			String nome = sc.nextLine(); 
			vnome[i] = nome;
		}
		
		System.out.print("Iniciando escrita arquivo ..... ");
		
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(path))) {
			for(int i=0; i < num; i++) {
				bfw.write(vnome[i]);
				bfw.newLine();
			}
		} catch(IOException e){
			e.printStackTrace();		
		}
		
		sc.close();
	}

}
