import java.util.Scanner;

public class nome {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome= scanner.nextLine();

        System.out.println("Bom dia "+ nome);
        scanner.close();
    }
}
