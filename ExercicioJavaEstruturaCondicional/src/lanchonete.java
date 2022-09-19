import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer cod, qtd;
		double vlPg, one, two, three, four, five;
		
		vlPg = 0;
		
		one = 5.00;
		two = 3.50;
		three = 4.80;
		four = 8.90;
		five = 7.32;
		
		System.out.print("Codigo do produto comprado: ");
		cod = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		switch(cod)
		{
			case 1:
				vlPg = qtd * one;
				break;
			case 2:
				vlPg = qtd * two;
				break;
			case 3:
				vlPg = qtd * three;
				break;
			case 4:
				vlPg = qtd * four;
				break;
			case 5:
				vlPg = qtd * five;
				break;
			default:
				System.out.println("Codigo de produto inexistente!");
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", vlPg));
		
		sc.close();
	}

}
