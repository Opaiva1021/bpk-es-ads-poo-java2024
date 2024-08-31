package exercicios07;

//Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.

public class ex07 {

    private String nome;
    private int mat;
    private String curso;
    public double[] notas;

    public ex07(String nome,int mat, String curso,double[] notas){
        this.nome = nome;
        this.mat = mat;
        this.curso = curso;
        this.notas = notas;
    }

    public double calcular(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome() {return nome;}
    public int getMat() {return mat;}
    public String getCurso() {return curso;}

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + mat);
        System.out.println("Curso: " + curso);
        System.out.println("Média: " + calcular());
    }
}
