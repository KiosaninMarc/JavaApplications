/*Problema "retangulo"
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área,
perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado. */

package retanguloClassesAtributosMetodos;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangle retangle = new Retangle();
		System.out.println("Entre com a largura e a altura do retangulo: ");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println(retangle);
		
		sc.close();
	}

}
