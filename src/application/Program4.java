package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Temp\\java\\tsaida.txt";
		
		String[] lines = new String[] {"Zazaz","Zezez","Ziziz"};
		
		try (BufferedWriter bfw = new BufferedWriter(new FileWriter(path))) {			
			for(String line: lines) {
				bfw.write(line);
				bfw.newLine();
			}
		}catch(IOException e){
			e.printStackTrace();		
		}
	}

}
