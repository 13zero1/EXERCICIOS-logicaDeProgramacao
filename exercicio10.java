package Moderna.Modulo01.aula1;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        System.out.print("R:");
        int idadeUsuario = scan.nextInt();

        if (idadeUsuario <= 18) {
            System.out.println("Voto Proibido");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}