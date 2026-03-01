import java.util.Scanner;
public class crescente{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num1= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num2= scanner.nextInt();

        System.out.println("digite outro numero: ");
        int num3= scanner.nextInt();

        int menor= num1;
        int medio= num2;
        int maior= num3;

        if(menor>medio){
            int temp= menor;
            menor= medio;
            medio= temp;
        }
        if(menor>maior){
            int temp= menor;
            menor= maior;
            maior= temp;
        }
        if(medio>maior){
            int temp= medio;
            medio= maior;
            maior= temp;
        }

        System.out.println("a ordem crescente é: "+menor+","+medio+ "," +maior);

        scanner.close();

    }
}
