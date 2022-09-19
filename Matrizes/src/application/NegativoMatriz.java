package application;

import java.util.Locale;
import java.util.Scanner;

/*Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
exemplo. Em seguida, mostrar na tela somente os números negativos da matriz. */

public class NegativoMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da Matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da Matriz? ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-------------------------------");
		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		sc.close();
	}

}
