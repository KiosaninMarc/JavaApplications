package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter and BufferedWriter

public class Program04 {

	public static void main(String[] args) {
		String[] lines = new String[] {
				"Escrita de texto em Java", "Segunda escrita", "Terceira escrita \n"
		};
		
		String path = "d:\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
