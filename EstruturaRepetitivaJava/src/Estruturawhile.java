import java.util.Scanner;

public class Estruturawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;
		int cont = 0;

		while (x != 0) {
			soma = soma + x;
			cont += x;// Alternativo
			x = sc.nextInt();
		}

		System.out.println(soma);
		System.out.println(cont);
		
		sc.close();
	}

}
