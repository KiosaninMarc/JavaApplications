package application;

import java.util.Locale;
import java.util.Scanner;

/*Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
a matriz alterada. */

public class MatrizGeral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("-----------------------------");
		double posit = 0.0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0) {
					posit += mat[i][j];
				}
			}
		}
		System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", posit));
		
		System.out.println("-----------------------------");
		System.out.print("Escolha uma linha: ");
		int l = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = l; i == l; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.print("Escolha uma coluna: ");
		int c = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = c; j == c; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(String.format("%.1f", mat[i][i]) + " ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("MATRIZ NORMAL:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}
		
		double mult = 0.0;
		System.out.println("------------------------------");
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					mult = mat[i][j] * mat[i][j];
					mat[i][j] = mult;
				}
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
