import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();

		int fatorial = n;

		if (n == 0) {
			System.out.println("FATORIAL = 1");
		} else {
			for (int i = n - 1; i > 0; i--) {
				fatorial *= i;
			}

			System.out.println("Fatorial = " + fatorial);
		}

		sc.close();
	}
}
