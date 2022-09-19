import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores das coordenadas X e Y: ");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("QUADRANTE Q1");
			}else if (X > 0 && Y < 0){
				System.out.println("QUADRANTE Q4");
			}else if (X < 0 && Y < 0){
				System.out.println("QUADRANTE Q3");
			}else {
				System.out.println("QUADRANTE Q2");
			}
			System.out.println("\nDigite os valores das coordenadas X e Y: ");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		
		sc.close();
	}

}
