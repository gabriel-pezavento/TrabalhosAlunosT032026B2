import java.util.Scanner;

public class Caixa {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 0;
    static double saquet = 0;
    static int escolha;

    public static void main(String[] args) {

        boolean senha = login();

        if (senha == true) {
            System.out.println("Senha correta indo para menu");
            consultar();
        } else {
            System.out.println("Senha errada");
        }
    }

    public static boolean login() {
        System.out.println("Digite a senha");
        int senha2 = sc.nextInt();
        if (senha2 == 89) {
            return true;
        } else {
            return false;
        }
    }

    public static int consultar() {
        do {
            System.out.println("1 Extrato");
            System.out.println("2 Depositar dinheiro");
            System.out.println("3 Sacar Dinheiro");
            System.out.println("4 Sair");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("seu saldo é R$" + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor do deposito");
                    double deposito = sc.nextDouble();
                    sc.nextLine();

                    if (deposito > 0){
                        saldo = saldo + deposito;
                        System.out.println("deposito feito");
                        System.out.println("novo saldo R$" + saldo);
                    } else {
                        System.out.println("valor invalido");
                    }
                    break;

                case 3:
                    System.out.println("digite o valor do saque");
                    double saque = sc.nextDouble();
                    sc.nextLine();
                    saquet = saquet + saque;
                    if (saquet > 500){
                        System.out.println("Limite maximo de saque é de R$ 500");
                        
                    } else if (saque > saldo) {
                        System.out.println("Você não tem saldo, seu saldo é R$ " + saldo);
                        
                    } else if (saque <= 0) {
                        System.out.println("Esse valor de saque não é valido");
                        
                    } else {
                        saldo = saldo - saque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Seu saldo é R$ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Saindo");
                    break;
            }
        } while (escolha != 4);
        return escolha;
    }
}