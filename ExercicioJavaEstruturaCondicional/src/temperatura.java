import java.util.Locale;
import java.util.Scanner;

public class temperatura {
	
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double f, c;
        char temp;
        
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        temp = sc.next().charAt(0);
        
        if (temp == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            f = sc.nextDouble();
            c = (f - 32) / 1.8;
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", c));
        }else if (temp == 'c'){
            System.out.print("Digite a temperatura em Celsius: ");
            c = sc.nextDouble();
            f = c * 1.8 + 32;
            System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", f));
        }else {
        	System.out.println("Escala de temperatura errada, escolha somente (C/F)!");
        }
       sc.close();
    }
}