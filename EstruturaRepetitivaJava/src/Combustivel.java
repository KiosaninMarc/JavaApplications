import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int g = 0;
		int d = 0;
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		int x = sc.nextInt();
		
		if(x == 4) {
			System.out.println("MUITO OBRIGADO!");
		}else {
			while (x != 4) {
				switch (x) {
				case 1:
					a += 1;
					break;
				case 2:
					g += 1;
					break;
				case 3:
					d += 1;
					break;
				}
				System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
				x = sc.nextInt();
			}
			System.out.println("MUITO OBRIGADO");
			System.out.println("ALCOOL: " + a);
			System.out.println("GASOLINA: " + g);
			System.out.println("DIESEL: " + d);	
		}
		
		sc.close();
	}

}
