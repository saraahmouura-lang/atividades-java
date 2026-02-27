import java.util.Scanner;

public class numero {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.print("digite mais um numero: ");
        int num2= scanner.nextInt();

        int soma= num1+num2;

        System.out.println("a soma é: "+ soma);

        scanner.close();
    }
}
