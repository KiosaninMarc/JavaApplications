import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int log;
		int soma = 0;
		
		if (x > y) {
			log = x;
			x = y;
			y = log;
		}
		
		for (int i = x+1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();
	}

}
