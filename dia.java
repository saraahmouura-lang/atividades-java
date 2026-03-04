import java.util.Scanner;
public class dia {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("digite um numero: ");
        int dia= scanner.nextInt();

        switch(dia){
            case 1:
                System.out.print("segunda-feira");
            break;
            case 2:
                System.out.print("terça-feira");
            break;
            case 3:
                System.out.print("quarta-feira");
            break;
            case 4:
                System.out.print("quinta-feira");
            break;
            case 5:
                System.out.print("sexta-feira");
            break;
            case 6:
                System.out.print("sabado");
            break;
            case 7:
                System.out.print("domingo");
            break;
            default:
                System.out.print("invalido!!");

        }
        
        scanner.close();

    }
    
}
