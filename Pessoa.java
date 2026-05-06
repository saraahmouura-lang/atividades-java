class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    void falar() {
        System.out.println("Oi, eu sou " + nome);
    }
}

class Aluno extends Pessoa {

    Aluno(String nome) {
        super(nome);
    }

    void estudar() {
        System.out.println(nome + " está estudando.");
    }
}

class Professor extends Aluno {

    Professor(String nome) {
        super(nome);
    }

    void ensinar() {
        System.out.println(nome + " está ensinando.");
    }
}

class Funcionario extends Pessoa {

    Funcionario(String nome) {
        super(nome);
    }

    void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
}

class Responsavel extends Pessoa {
    Aluno aluno;

    Responsavel(String nome, Aluno aluno) {
        super(nome);
        this.aluno = aluno;
    }

    void mostrarAluno() {
        System.out.println(nome + " é responsável por " + aluno.nome);
    }
}

public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno("João");
        a.falar();
        a.estudar();

        Professor p = new Professor("Maria");
        p.ensinar();

        Funcionario f = new Funcionario("Carlos");
        f.trabalhar();

        Responsavel r = new Responsavel("Ana", a);
        r.mostrarAluno();
    }
}
