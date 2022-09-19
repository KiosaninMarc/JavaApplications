import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja a tabuada para qual valor? ");
		int n = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			soma = n * (i + 1);
			System.out.println(n + " X " + (i + 1) + " = " + soma);
		}
		
		sc.close();
	}

}
