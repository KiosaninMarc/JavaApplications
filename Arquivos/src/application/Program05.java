package application;

import java.io.File;
import java.util.Scanner;

//Manipulando pastas com File
public class Program05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Lista os diretorios na tela
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//Lista os arquivos na tela
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		//Cria uma sub pasta
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
