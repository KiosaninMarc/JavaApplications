package application;

import java.util.Scanner;

public class MatrizExemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("RESULT:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("MAIN DIAGONAL:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println();
		System.out.println("NEGATIVE NUMBERS = " + count);
		
		sc.close();
	}

}
