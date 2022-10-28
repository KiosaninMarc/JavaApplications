package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ProgramVendas2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<String, Double> venda = new HashMap<>();
		
		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {

				String[] fields = line.split(",");
				String vendedor = fields[2];
				Double total = Double.parseDouble(fields[4]);

				if (venda.containsKey(vendedor)) {
					double totalSoFar = venda.get(vendedor);
					venda.put(vendedor, total + totalSoFar);
				} else {
					venda.put(vendedor, total);
				}

				line = br.readLine();
			}
			System.out.println();
			System.out.println("Total de vendas por vendedor:");
			for (String Key : venda.keySet()) {
				System.out.println(Key + " - R$" + String.format("%.2f", venda.get(Key)));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
