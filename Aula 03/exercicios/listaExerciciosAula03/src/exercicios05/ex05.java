package exercicios05;

//Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.

public class ex05 {

    public String nome;
    public String raca;
    public int idade;

    public ex05(String nome,String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void latir(){
        System.out.println("AU AU AU");
    }

    public void correr(){
        System.out.println("O cachorro está correndo");
    }

    public void apresentar(){
        System.out.println("Nome: "+ nome + "\nRaça: "+ raca + "\nIdade: "+ idade) ;
    }
}