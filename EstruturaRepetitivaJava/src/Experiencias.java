import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos de teste serao digitados? ");
		int n = sc.nextInt();

		int qtd;
		int contC = 0;
		int contR = 0;
		int contS = 0;
		double pC = 0.0;
		double pR = 0.0;
		double pS = 0.0;
		char tipo = ' ';
		int total;

		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtd = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);

			switch (tipo) {
			case 'c':
				contC += qtd;
				break;
			case 'r':
				contR += qtd;
				break;
			case 's':
				contS += qtd;
			}

		}
		total = contC + contR + contS;
		pC = ((double)contC / total) * 100;
		pR = ((double)contR / total) * 100;
		pS = ((double)contS / total) * 100;
		
		System.out.println("\nRELATORIO FINAL:");
		System.out.println("Total "+ total + " cobaias");
		System.out.printf("Total de coelhos: %d\n", contC);
		System.out.printf("Total de ratos: %d\n", contR);
		System.out.printf("Total de sapos: %d\n", contS);
		System.out.println("Percentual de coelhos: "+ String.format("%.2f", pC));
		System.out.println("Percentual de ratos: "+ String.format("%.2f", pR));
		System.out.println("Percentual de sapos: "+ String.format("%.2f", pS));

		sc.close();
	}

}
