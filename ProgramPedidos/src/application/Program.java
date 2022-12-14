package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client cli = new Client(name, email, birthDate);
		
		System.out.println("----------------------------");
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());	
		Order order = new Order(new Date(), status, cli);
		
		System.out.println("----------------------------");
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Enter #"+ (i + 1) +" item data:");
			System.out.print("Product name: ");
			String itemName = sc.nextLine();
			System.out.print("Product price: ");
			Double itemPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer itemQuantity = sc.nextInt();
			
			Product product = new Product(itemName, itemPrice);
			
			OrderItem it = new OrderItem(itemQuantity, itemPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println("-------------------------------");
		System.out.println(order);
		
		sc.close();
	}

}
