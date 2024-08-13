/* public class exercicios {

    public static void main(String[] args) {
        System.out.printf("Hello World!");

    }
}*/


/* public class exercicios {
    public static void main(String[] args){

        int n1 = 10;
        System.out.println(n1);

        float n2 = 15.450f;
        System.out.println(n2);

        double n3 = 99.1234567;
        System.out.println(n3);

        boolean n4 = true;
        System.out.println(n4);

        char n5 = 'a';
        System.out.println(n5);

        String n6 = "hello world";
        System.out.println(n6);

        byte n7 = 125;
        System.out.println(n7);

        short n8 = 32;
        System.out.println(n8);

        long n9 = 123456789L;
        System.out.println(n9);

    }
}*/

/* public class exercicios {
    public static void main(String[] args) {

        int n1 = 18;
        int n2 = 82;

        int soma = n1 + n2;
        System.out.println(soma);

        int sub = n2 - n1;
        System.out.println(sub);

        int mult = n1 * n2;
        System.out.println(mult);

        int div = n2 / n1;
        System.out.println(div);

    }
}*/
/* import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int n1 = scanner.nextInt();

        if (n1 % 2 == 0){
            System.out.printf("O número é par.\n");
        }else {
            System.out.printf("O número é impar.");
        }

        scanner.close();
    }
}*/

/*public class exercicios {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}*/

/* public class exercicios {
    public static void main(String[] args) {

        int[] n1 = {0,1,2,3,4};

        for (int i = 0; i < 5; i++){
            System.out.println(n1[i]);
        }
    }
}*/

/* public class exercicios {

    public static int soma(int a, int b){

        return a + b;
    }

    public static void main(String[] args) {

        int resultado = soma(64,36);

        System.out.println(resultado);
    }
}*/

/*import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Olá %s, você tem %d anos.",nome,idade);

    }
}*/

/* import java.util.Scanner;

public class exercicios {

    public static int soma (int a, int b){

        return a + b;
    }

    public static int sub (int a, int b){

        return a - b;
    }

    public static int mult (int a, int b){

        return a * b;
    }

    public static int div (int a, int b){

        return a / b;
    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int n1 = scanner.nextInt();

        scanner.nextLine();

        System.out.printf("Digite a operção desejada: ");
        String op = scanner.nextLine().trim();

        System.out.printf("Digite outro número: ");
        int n2 = scanner.nextInt();

    int resultado = 0;

    switch (op){

        case "+":
            resultado = soma(n1,n2);
            System.out.println(resultado);
        break;

        case "-":
            resultado = sub(n1,n2);
            System.out.println(resultado);
        break;

        case "*":
            resultado = mult(n1,n2);
            System.out.println(resultado);
        break;

        case "/":
            resultado = div(n1,n2);
            System.out.println(resultado);
        break;
    }
scanner.close();
    }
}*/

/* import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2 = 0;

        System.out.printf("Digite um número: ");
        n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                n2++;
            }
        }

        if (n2 == 2){
            System.out.printf("O número é primo.");
        }else{
            System.out.printf("O número não é primo.");
        }
    }
}*/

/* import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        boolean ehPalindromo = true;


        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}*/

/* import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o número da posição %d: ",i+1);
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (num[j] > num[j + 1]) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("posição %d: %d\n",i+1,num[i]);
        }
    }
}*/

/* import java.util.Scanner;
import java.util.Random;

public class exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100.");


        while (palpite != numeroAleatorio) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número.");
                System.out.println("Você levou " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}*/

/* import java.util.Scanner;

public  class exercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra;

        System.out.println("Digite sua palavra: ");
        palavra = scanner.nextLine();

        palavra = palavra.toLowerCase();
        int cont = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
                cont++;
            }
        }

        System.out.println("O número de vogais é : "+ cont);
    }
}*/

/* import java.util.Scanner;

public class exercicios{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para converter de Celsius para Fahrenheit e 2 para de Fahrenheit para Celsius.");
        int num = scanner.nextInt();

        System.out.println("Digite a temperatura para converter");
        int temp = scanner.nextInt();

        float resultado;

        switch (num){
            case 1:
                resultado = (temp * 1.8f) + 32;
                System.out.println(resultado);
            break;

            case 2:
                resultado = (temp - 32) / 1.8f;
                System.out.println(resultado);
            break;

            default:
                System.out.println("opção inválida.");
        }
    }
}*/