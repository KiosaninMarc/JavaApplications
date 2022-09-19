/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total. */
package application;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		Double[] compra = new Double[n];
		Double[] venda = new Double[n];
		
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + ": ");
			System.out.print("Nome: ");	
			nome[i] = sc.nextLine();
			System.out.print("Preco da compra: "); 
			compra[i] = sc.nextDouble();
			System.out.print("Preco da venda: "); 
			venda[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("RELATORIO:");
		
		Integer abaixo10 = 0;
		Integer entre1020 = 0;
		Integer acima20 = 0;
		Double totCompra = 0.0;
		Double totVenda = 0.0;
		Double lucro;
		
		for (int i = 0; i < n; i++) {
			totCompra += compra[i];
			totVenda += venda[i];
		}
		lucro = totVenda - totCompra;
		
		for (int i = 0; i < n; i++) {
			if ((venda[i] / compra[i] - 1) * 100 < 10) {
				abaixo10 += 1;
			}else if((venda[i] / compra[i] - 1) * 100 >= 10 && (venda[i] / compra[i] - 1) * 100 <= 20) {
				entre1020 += 1;
			}else {
				acima20 += 1;
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + abaixo10);
		System.out.println("Lucro entre 10% e 20%: " + entre1020);
		System.out.println("Lucro acima de 20%: " + acima20);
		System.out.println("Valor total de compra: " + String.format("%.2f", totCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totVenda));
		System.out.println("Lucro total: " + String.format("%.2f", lucro));
		//Calculo percentual ((venda / compra - 1) * 100
		sc.close();
	}

}
