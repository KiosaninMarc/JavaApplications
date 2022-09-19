import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		double a, b, c, mp;
		int p1 = 2;
		int p2 = 3;
		int p3 = 5;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			mp = ((p1 * a) + (p2 * b) + (p3 * c)) / (p1 + p2 + p3);
			System.out.println("MEDIA = " + String.format("%.1f", mp));
		}

		sc.close();
	}

}
