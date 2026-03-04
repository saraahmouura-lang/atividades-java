import java.util.Scanner;
public class operacoes {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num2= scanner.nextInt();

        System.out.println("digite qual opção você quer: ");

        int opcao= scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("a soma dos numeros é: "+(num1+num2));
            break;
            case 2:
                System.out.println("a subtração dos numeros é: "+(num1-num2));
            break;
            case 3:
                System.out.println("a multiplicação dos numeros é: ");
            break;
            case 4:
                System.out.println("a divisão dos numeros é: ");
            break;
            default:
                System.out.println("opção invalida.");
        }

        scanner.close();
    }
    
}
