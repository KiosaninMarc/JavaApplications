import java.util.Scanner;
public class SenhaFixa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.print("SENHA INVALIDA! TENTE NOVAMENTE: ");
			senha = sc.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO!");
		
		sc.close();
	}

}
