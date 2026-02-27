import java.util.Scanner;

public class operacao {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.print("digite outro numero: ");
        int num2= scanner.nextInt();

        int soma= num1+num2;
        int subtração= num1-num2;
        int multiplicação= num1*num2;

        System.out.println("soma: "+soma);
        System.out.println("subtração: "+subtração);
        System.out.println("multriplicação: "+ multiplicação);
        
        if (num2 != 0){
            int divisão= num1/num2;
            System.out.println("divisão: "+divisão);
        }else{
            System.out.println("divisão não é exata!!");
        }
        
        scanner.close();

    }
}
