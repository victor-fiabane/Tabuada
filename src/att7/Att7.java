package att7;
import java.util.Scanner;
public class Att7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
    
    
}
