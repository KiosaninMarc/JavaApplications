import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (a != b) {
			if (a > b) {
				System.out.println("DECRESCENTE");
			}else {
				System.out.println("CRESCENTE");
			}
			System.out.println("Digite dois numeros: ");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		System.out.println("PROGRAMA ENCERRADO!");
		sc.close();
	}

}
