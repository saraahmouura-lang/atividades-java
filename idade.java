import java.util.Scanner;

public class idade {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("digite sua idade: ");
        int idade= scanner.nextInt();

        if(idade >=18){
            System.out.println("você é maior de idade");
        }else{
            System.out.println("você é menor de idade");
            
            scanner.close();
        
        }
    }
