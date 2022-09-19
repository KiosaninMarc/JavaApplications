import java.util.Locale;
import java.util.Scanner;

public class aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sal, newSal, aumento, porcent;
		
		System.out.print("Digite o salario da pessoa: ");
		sal = sc.nextDouble();
		
		if(sal <= 1000) {
			aumento = sal * 0.20;
			newSal = sal + aumento;
			porcent = 0.20 * 100;
		}else if(sal > 1000 && sal <= 3000) {
			aumento = sal * 0.15;
			newSal = sal + aumento;
			porcent = 0.15 * 100;
		}else if(sal > 3000 && sal <= 8000) {
			aumento = sal * 0.10;
			newSal = sal + aumento;
			porcent = 0.10 * 100;
		}else {
			aumento = sal * 0.05;
			newSal = sal + aumento;
			porcent = 0.05 * 100;
		}
		
		System.out.println("Novo salario = R$ " + String.format("%.2f", newSal));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem de aumento = " + String.format("%.0f", porcent, " %"));
		
		sc.close();
	}

}
