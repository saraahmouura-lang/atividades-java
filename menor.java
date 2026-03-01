import java.util.Scanner;
public class menor {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num2= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num3= scanner.nextInt();

        int menor= num1;
        int maior= num1;

        if(num2<menor) menor= num2;
        if(num3<menor) menor= num3;

        if(num2>maior) maior= num2;
        if(num3>maior) maior= num3;
        
        System.out.println("o maior numero é: "+maior);
        System.out.println("o menor numero é: "+menor);

        scanner.close();
       
    }
}
