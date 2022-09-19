package application;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada. */

public class SomaMatrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas vai ter cada matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int n = sc.nextInt();
		
		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];
		int[][] matC = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA[i].length; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB[i].length; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				matB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-------------------------------");
		System.out.println("MATRIZ SOMA:");
		for (int i = 0; i < matC.length; i++) {
			for (int j = 0; j < matC[i].length; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
