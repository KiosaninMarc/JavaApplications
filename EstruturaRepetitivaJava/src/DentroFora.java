import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dentro = 0;
		int fora = 0;
		int x;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				dentro += 1;
			}else {
				fora += 1;
			}
		}

		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		sc.close();
	}

}
