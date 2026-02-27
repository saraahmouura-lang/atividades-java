import java.util.Scanner;
public class divisao{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num2= scanner.nextInt();

        if(num2==0){
            System.out.println("divisão não exata");
        }else{
            int resto= num1 % num2;
            System.out.println("o resto da divisão de "+num1 + " por "+num2 +" é: "+resto);
        
        scanner.close();

        }
    }
}
