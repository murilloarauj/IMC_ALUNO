package IMC;

public class Main {
    public static void main(String[] args) {
        // Criando novos objetos do tipo Aluno e atribuindo valores a eles
        aluno est1 = new aluno("Declan Rice", "617.521.170-77", 86, 1.84, 9, 81);
        aluno est2 = new aluno("Caça Rato", "224.119.870-64", 74, 1.72, 7, 73);
        
        // Exibindo a descrição dos alunos e suas características
        System.out.println(est1.obterDescricao());
        System.out.println(est2.obterDescricao());
    }
}