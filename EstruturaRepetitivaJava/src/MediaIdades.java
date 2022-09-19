import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades: ");
		int idade = sc.nextInt();
		double soma = 0.0;
		double cont = 0.0;
		double media;
		
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}else {
			while (idade >= 0) {
				soma += idade;
				cont += 1;
				idade = sc.nextInt();
			}
			media = soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}

		sc.close();
	}

}
