package application;

import java.util.Locale;
import java.util.Scanner;

/*Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
de cada linha. Suponha não haver empates. */

public class CadaLinha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da Matriz? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento ["+ i +","+ j +"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-------------------------------");
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		int take = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > take) {
					take = mat[i][j];
				}
			}
			System.out.println(take);
			take = 0;
		}
		
		sc.close();
	}

}
