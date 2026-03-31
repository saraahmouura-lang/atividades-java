import java.util.Scanner;

public class ContarCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int quantidade = frase.length();

        System.out.println("A frase tem " + quantidade + " caracteres.");

        scanner.close();
    }
}
