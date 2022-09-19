package application;
/*Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado. 
*/
import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int li = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int col = sc.nextInt();
		
		double[][] mat = new double[li][col];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Digite os elementos da " + (i + 1) +"ª. linha:");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0.0;
		System.out.println("------------------------------");
		System.out.println("VETOR GERADO:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				soma += mat[i][j];
			}
			System.out.println(String.format("%.1f", soma));
			soma = 0.0;
		}

		sc.close();
	}

}
