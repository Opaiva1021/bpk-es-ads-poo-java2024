package exercicios06;

 //Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento.
 //Adicione métodos para ligar e desligar o computador.

public class ex06 {

    public String processador;
    public int ram;
    public int armazenamento;

    public boolean status;


    public ex06(String processador,int ram,int armazenamento,boolean status){
        this.armazenamento = armazenamento;
        this.ram = ram;
        this.processador = processador;
        this.status = false;
    }

    public int getArmazenamento() {return armazenamento;}

    public int getRam() {return ram;}

    public String getProcessador() {return processador;}

    public void ligar(){
        System.out.println("Ligando computador");
        status = true;
    }

    public void desligar(){
        System.out.println("Desligando computador");
        status = false;
    }

    public void apresentar(){
        System.out.println("\nProcessador: "+ processador + "\nRam: "+ ram + "Gb" + "\nArmazenamento: "+ armazenamento + "Gb");
    }

}
