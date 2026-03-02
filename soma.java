import java.util.Scanner;
public class soma{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num2= scanner.nextInt();

        int soma= num1 + num2;
        int sub= num1 - num2;

        if(num2<num1){
            System.out.println("a subtração dos numeros é: "+sub);
        }else{
            System.out.println("a soma dos numeros é: "+soma);

        scanner.close();

        }

    }
}
