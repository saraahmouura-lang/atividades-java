import java.util.Scanner;
public class maior {
    public static void main(String[]args){
      Scanner scanner= new Scanner(System.in);

      System.out.println("digite um numero: ");
      int num1= scanner.nextInt();

      System.out.println("digite outro numero: ");
      int num2= scanner.nextInt();

      if(num1>num2){
        System.out.println("o maior numero é: "+num1);
      }else{
        System.out.println("o maior numero é: "+num2);
      }
      scanner.close();
    }
    
}
