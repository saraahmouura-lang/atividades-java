import java.util.Scanner;

public class InverterNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int inverso = 0;

        while (numero != 0) {
            int digito = numero % 10;   
            inverso = inverso * 10 + digito; 
            numero = numero / 10;         
        }

        System.out.println("Número invertido: " + inverso);

        scanner.close();
    }
}
