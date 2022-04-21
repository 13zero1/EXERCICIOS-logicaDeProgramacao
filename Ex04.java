package Moderna.Modulo01.aula1;

public class Ex04 {

    /*Crie um programa que tem uma variável com o valor do ano atual e outra com o ano de seu
    nascimento e imprima a sua idade */

    public static void main(String[] args) {

        int anoAtual = 2021;
        int anoNascimento = 1983;

        System.out.println("Danilo Duarte - Nascido em " +
                anoNascimento + " com idade de " + (anoAtual - anoNascimento) + " anos.");

    }
}
