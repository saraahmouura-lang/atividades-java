import java.time.LocalTime;

public class aluno{
    String aluno;
    String data;
    String cel;
    String nome;

    public aluno(String aluno, String data, String cel, String nome){
        this.aluno= aluno;
        this.data= data;
        this.cel= cel;
        this.nome= nome;
}    
public void apresentação(){
        System.out.println("Aluno(a): "+aluno);
        System.out.println("Data de nascimento: "+data);
        System.out.println("Telefone: "+cel);
        System.out.println("Responsável: "+nome);
    }
public static void saudacao(String nomes){
    int hora= LocalTime.now().getHour();
    if(hora<12){
        System.out.println("bom dia "+nomes+"!");
    }else if(hora<17){
        System.out.println("boa tarde "+nomes+"!");
    }else{
        System.out.println("boa noite "+nomes+"!");
    }

    }


public static void main(String[] args) {
    aluno aluno1= new aluno("Sarah", "04/10/2001", "00 00000-0000", "Silvana");
    aluno1.apresentação();
    aluno1.saudacao("Sarah");
}


} 

 
