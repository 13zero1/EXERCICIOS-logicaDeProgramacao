import java.util.Scanner;

public class ExFix10_idadeVoto {
    
    /*Ex10.
    Escreva um programa utilizando operador ternário que imprima se o voto é proibido ou permitido, utilizando como regra:
        ● Menor ou igual a 18 anos = voto proibido.
        ● Maior que 18 anos = voto obrigatório*/

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println ("Qual é a sua idade?");
        System.out.print ("R:");
        int idadeUsuario = scan.nextInt();

        if (idadeUsuario <= 18) {
            System.out.println ("Voto Proibido");
        
        } else {
            System.out.println ("Voto obrigatório");
    
        }

    }

}
