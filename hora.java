import java.util.Scanner;
public class hora {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.print("digite o horario atual: ");
        double hora= scanner.nextDouble();

        if(hora>=0 && hora<12){
            System.out.println("bom dia, vamos acordar!!!");
        }else if (hora>=12 && hora<18){
            System.out.println("boa tarde, vamos tomar um cafezin!!");
        }else if (hora>=18 && hora<=23){
            System.out.println("boa noite, vamos dormir ne!!");
        }else{
            System.out.println("não entendi");
        }

        scanner.close();
    }
}
