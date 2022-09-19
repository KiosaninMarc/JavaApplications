package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = x.nextInt();

		for (int i = 1; i <= n; i++) {
			x.nextLine();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = x.next().charAt(0);
			x.nextLine();
			System.out.print("Name: ");
			String name = x.nextLine();
			System.out.print("Price: ");
			Double price = x.nextDouble();
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				Double custFee = x.nextDouble();
				list.add(new ImportedProduct(name, price, custFee));
			}
			if (ch == 'c') {
				list.add(new Product(name, price));
			}
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manuDate = sdf.parse(x.next());
				list.add(new UsedProduct(name, price, manuDate));
			}
		}
		
		System.out.println();
		System.out.println("====================================");
		System.out.println("PRICE TAGS:");
		System.out.println("====================================");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		x.close();
	}

}
