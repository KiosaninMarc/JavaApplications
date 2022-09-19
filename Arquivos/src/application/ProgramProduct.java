package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Quantos produtos vai cadastrar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Product: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			list.add(new Product(name, price, quantity));
			System.out.println();
		}
		
		System.out.println("=====================================");
		String strPath = "d:\\Eclipse\\Workspace\\Arquivos";
		boolean success = new File(strPath + "\\out").mkdir();
		System.out.println("Diretory created successfully: " + success);
		
		String path = "d:\\Eclipse\\Workspace\\Arquivos\\out\\summary.csv";
		
		//Leitura do arquivo fonte
		System.out.println("=====================================");
		System.out.println("Source file:");
		for (Product pr : list) {
			System.out.println(pr.getName()+ ", "+ String.format("%.2f", pr.getPrice()) + ", " + pr.getQuantity());
		}
		
		//Adicionar dados no arquivo summary.csv
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (Product pr : list) {
				bw.write(pr.getName()+ ", "+ String.format("%.2f", pr.amount()));
				bw.newLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//Ler dados do arquivo summary.csv
		System.out.println("=====================================");
		File pat = new File(path);
		System.out.println("Output file " + pat.getPath());
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
