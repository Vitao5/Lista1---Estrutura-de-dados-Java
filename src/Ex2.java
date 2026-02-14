import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor");
        int valorSaque = sc.nextInt();

        int notas50 = valorSaque / 50;
        double resto50  =  valorSaque % 50;

        int notas20 = (int) (resto50 / 20);
        double resto20  =  resto50 % 20;

        int notas10 = (int) (resto20 / 10);

        System.out.println(notas50 + " notas de R$ 50,00, " + notas20 + " notas de R$ 20,00, e " + notas10 + "notas de R$ 10,00");

    }
}
