import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String senha = "";

        while (senha.length() < 8){
            System.out.println("Digite a senha");
             senha = sc.nextLine();

            if(senha.length() <8 ) System.out.println("\nA senha não possui 8 dígitos\n");
        }

        if(senha.contains("@") || senha.contains("#") || senha.contains("$")|| senha.contains("%")|| senha.contains("&")){
            System.out.println("\nSenha válida");
        }else {
            System.out.println("\nSenha inválida. Não contém caracteres especiais");
        }


    }
}
