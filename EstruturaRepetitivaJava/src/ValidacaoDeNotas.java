import java.util.Scanner;
import java.util.Locale;

public class ValidacaoDeNotas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double x = sc.nextDouble();
		while (x < 0.0 || x > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			x = sc.nextDouble();
		}
			
		System.out.print("Digite a segunda nota: ");
		double y = sc.nextDouble();
		while (y < 0.0 || y > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			y = sc.nextDouble();
		}

		double media = (x + y) / 2;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		sc.close();
	}

}
