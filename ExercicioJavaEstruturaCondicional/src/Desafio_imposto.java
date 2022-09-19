import java.util.Locale;
import java.util.Scanner;

public class Desafio_imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double MesRendSal, AnuRendSal, AnuRendPS, AnuRendCap, GastMed, GastEdu;
		double impSal, impServ, impCap, maxDedut, gastMedEdu;
		double impostoTotal, abat, devido;
		
		System.out.print("Renda anual com salario: ");
		AnuRendSal = sc.nextDouble();
		System.out.print("Renda anual com prestacao de servicos: ");
		AnuRendPS = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		AnuRendCap = sc.nextDouble();
		System.out.print("Gastos medicos: ");
		GastMed = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		GastEdu = sc.nextDouble();
		
		MesRendSal = AnuRendSal / 12;
		gastMedEdu = GastMed + GastEdu;
		
		
		System.out.println("\nRELATORIO DE IMPOSTO DE RENDA\n");
		System.out.println("CONSOLIDADO DE RENDA");
		
		if (MesRendSal <= 3000.0) {
			impSal = 0.0;
		}else if (MesRendSal > 3000.0 && MesRendSal <= 5000.0) {
			impSal = AnuRendSal * 0.10;
		}else {
			impSal = AnuRendSal * 0.20;
		}
		
		impServ = AnuRendPS * 0.15;
		impCap = AnuRendCap * 0.20;
		impostoTotal = impSal + impServ + impCap;
		
		System.out.println("Imposto sobre o salario: " + String.format("%.2f", impSal));
		System.out.println("Imposto sobre serviços: " + String.format("%.2f", impServ));
		System.out.println("Imposto sobre ganho capital: " + String.format("%.2f", impCap));
		
		System.out.println("\nDEDUCOES:");
		maxDedut = impostoTotal * 0.30;
		System.out.println("Maximo dedutivel: " + String.format("%.2f", maxDedut));
		System.out.println("Gastos dedutiveis: " + String.format("%.2f", gastMedEdu));
		
		System.out.println("\nRESUMO");
		System.out.println("Imposto bruto total: " + String.format("%.2f", impostoTotal));
		if(gastMedEdu > maxDedut) {
			abat = maxDedut;
		}else {
			abat = gastMedEdu;
		}
		
		System.out.println("Abatimento: " + String.format("%.2f", abat));
		devido = impostoTotal - abat;
		System.out.println("Imposto devido: " + String.format("%.2f", devido));
		
		sc.close();
	}

}
