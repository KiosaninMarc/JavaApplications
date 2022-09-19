import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		double divisao = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			double num = sc.nextDouble();
			System.out.print("Entre com o denominador: ");
			double den = sc.nextDouble();
			
			if (den == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}else {
				divisao = num / den;
				System.out.println("DIVISAO: " + String.format("%.2f", divisao));
			}
		}
		
		sc.close();
	}

}
