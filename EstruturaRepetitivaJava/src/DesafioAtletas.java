import java.util.Scanner;
import java.util.Locale;

public class DesafioAtletas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = " ";
		char sexo = ' ';
		double altura = 0.0;
		double peso = 0.0;
		double pMedio = 0.0;
		String maisAlto = " ";
		int contH = 0;
		double amMulher = 0.0;
		int contM = 0;
		double maior = 0.0;
		double pmAtletas = 0.0;
		double porcHomem = 0.0;
		double AltMedMulher = 0.0;
		
		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		clearBuffer(sc);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do atleta numero "+(i+1));
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			if (sexo != 'm' && sexo != 'f') {
				while(sexo != 'f' && sexo != 'm') {
					System.out.println("Valor errado para SEXO, digite (m/f): ");
					System.out.print("Sexo: ");
					sexo = sc.next().charAt(0);
				}
			}
						
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			if(altura <= 0) {
				while(altura <= 0) {
					System.out.print("Valor invalido! Favor digitar um valor positivo:");
					altura = sc.nextDouble();
				}
			}
						
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			if (peso <= 0) {
				while(peso <= 0) {
					System.out.print("Valor invalido! Favor digitar um valor positivo:");
					peso = sc.nextDouble();
				}
			}

			pMedio += peso;
			
			if (altura > maior) {
				maior = altura;
				maisAlto = nome;
			}

			if(sexo == 'm') {
				contH += 1;
			}
			
			if (sexo == 'f') {
				amMulher += altura;
				contM += 1;
			}
			
			clearBuffer(sc);
		}
		
		pmAtletas = pMedio / n;
		porcHomem = ((double)contH / n * 100);
		AltMedMulher = amMulher / contM;
		
		System.out.println("RELATORIO");
		System.out.printf("Peso medio dos atletas: %.2f %n", pmAtletas);
		System.out.printf("Atleta mais alto: %s\n", maisAlto);
		System.out.printf("Porcentual de homens: %.1f %%%n", porcHomem );
		if(contM == 0) {
			System.out.println("Nao ha mulheres cadastradas!");
		}else {
			System.out.println("altura media das mulheres: " + String.format("%.2f", AltMedMulher));
		}
		
		sc.close();
	}
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
