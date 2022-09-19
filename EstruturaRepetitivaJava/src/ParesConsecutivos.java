import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int cont = 0;
		int guarda;
		int consec = 0;
		int soma = 0;
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		while (cont < 5) {
			if (x % 2 == 0) {
				guarda = x;
			}else {
				guarda = x + 1;
			}
			
			if (guarda != 0) {
				soma += guarda;
				consec = guarda + 2;
				x = consec;
				cont += 1;
			}else {
				System.exit(0);
			}
		}
		
		System.out.println("SOMA = " + soma);

		sc.close();
	}

}
