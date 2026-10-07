import java.util.Scanner;

public class Operacao {

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro número");
        Double numero = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o Segundo Número");
        Double numero2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escolha a operação + - / *");
        String operacao = scanner.nextLine();

        if ("+".equals(operacao)){
            System.out.printf("A Adição é " + (numero + numero2 ));}

        else if ("-".equals(operacao)){
            System.out.printf("Subtração é " + (numero - numero2 ));}

        else if ("-".equals(operacao)){
            System.out.printf("Multiplicação é " + (numero * numero2 ));}

        else if ("/".equals(operacao)){
            System.out.printf("Divisão é " + (numero / numero2 ));    
        }
    scanner.close();
	}
    
}