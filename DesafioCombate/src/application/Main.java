package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vida = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		Champion champ1 = new Champion(nome, vida, ataque, armadura);
		
		clearBuffer(sc);
		
		System.out.println("\nDigite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		vida = sc.nextInt();
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		System.out.print("Armadura: ");
		armadura = sc.nextInt();
		Champion champ2 = new Champion(nome, vida, ataque, armadura);
		
		
		System.out.print("\nQuantos turnos voce deseja executar? ");
		int turno = sc.nextInt();
		for (int i = 1; i <= turno; i++ ) {
			while((champ1.getLife() > 0 && champ2.getLife() > 0 ) && (i <= turno)) {
				System.out.println("\nResultado do turno "+ i++);
				champ1.takeDamage(champ2);
				champ2.takeDamage(champ1);
				if (champ1.getLife() <= 0) {
					System.out.print(champ1.getName() + ": " + champ1.getLife() + champ1.toString());
					System.out.println(" " + champ1.status());
					System.out.println(champ2.getName() + ": " + champ2.getLife() + champ2.toString());
				}else if (champ2.getLife() <= 0){
					System.out.println(champ1.getName() + ": " + champ1.getLife() + champ1.toString());
					System.out.print(champ2.getName() + ": " + champ2.getLife() + champ2.toString());
					System.out.println(" " + champ2.status());
				}else {
					System.out.println(champ1.getName() + ": " + champ1.getLife() + champ1.toString());
					System.out.println(champ2.getName() + ": " + champ2.getLife() + champ2.toString());
				}
			}//End While
		}//End For
		
		System.out.println("\nFIM DO COMBATE");
		
		sc.close();
    }
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}
	
}
