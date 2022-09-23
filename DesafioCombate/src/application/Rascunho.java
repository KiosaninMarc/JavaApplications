package application;

import java.util.Locale;
import java.util.Scanner;

public class Rascunho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String status = "(morreu)";
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int atack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();

		clearBuffer(sc);
		
		System.out.println("\nDigite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int atack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		
		clearBuffer(sc);
		
		System.out.print("\nQuantos turnos voce deseja executar? ");
		int turno = sc.nextInt();
		for (int i = 1; i <= turno; i++ ) {
			while((life1 > 0 && life2 > 0) && (i <= turno)) {
			System.out.println("\nResultado do turno "+ i++);
				if (armor2 > atack1) {
					life2 -= 1;
				}else {
					life2 = life2 - (atack1 - armor2);
				}
			
				if(armor1 > atack2) {
					life1 -= 1;
				}else {
					life1 = life1 - (atack2 - armor1);
				}
				
				if (life1 <= 0) {
					life1 = 0;
					System.out.println(name1 + ": " + life1 + " de vida " + status);
				}else {
					System.out.println(name1 + ": " + life1 + " de vida");
				}
				
				if (life2 <= 0) {
					life2 = 0;
					System.out.println(name2 + ": " + life2 + " de vida " + status);
				}else {
					System.out.println(name2 + ": " + life2 + " de vida");
				}
			}//End While
		}//End For
		
		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

	}

}
