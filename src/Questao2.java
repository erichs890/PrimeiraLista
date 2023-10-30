/*import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eu sei divertir!");
        System.out.println("Informe o primerio valor: ");
        int x = scanner.nextInt();
        System.out.println("informe o segundo valor: ");
        int y = scanner.nextInt();
        double r = (x/y);
        System.out.println("O resultado da soma é: " + r);
    }
}
*/
import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Eu sei divertir!");
            System.out.println("Informe o primerio valor: ");
            int x = scanner.nextInt();
            System.out.println("informe o segundo valor: ");
            int y = scanner.nextInt();
            double r = (x/y);
            System.out.println("O resultado da soma é: " + r);
        }
        catch (ArithmeticException e) {
            System.out.println("ta errado ze");
        }
    }
}