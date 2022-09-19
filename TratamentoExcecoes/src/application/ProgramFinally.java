package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramFinally {

	public static void main(String[] args) {
		
		File file = new File("D:\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine()); //Imprime o arquivo caso ele exista
			}
		}catch (FileNotFoundException e){
			System.out.println("Error opening file: " + e.getMessage());//Gera mensagem de erro caso o arquivo não exista
		}finally {
			if (sc != null) {
				sc.close();//Fecha o sc do Scanner
			}
			System.out.println();
			System.out.println("Finally block executes");
		}

	}

}
