import java.util.Locale;
import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite dois numeros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			if (a % b == 0) {
				System.out.println("São multiplos!");
			}else {
				System.out.println("Não são multiplos!");
			}
		}else {
			if (b % a == 0) {
				System.out.println("São multiplos!");
			}else {
				System.out.println("Não são multiplos!");
			}
		}
		
		sc.close();
	}

}
