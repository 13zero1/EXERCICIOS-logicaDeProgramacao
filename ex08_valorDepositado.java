package Moderna.Modulo01.aula1;

public class ex08_valorDepositado {
    
    /*Ex08.
    Escreva um código que receba na variável um valor depositado (500) e exiba o rendimento após 1 mês, 
    considerando que o valor fixo do juros da poupança é de 0.70%.*/

    public static void main (String[] args) {

        int valorDepositado = 500 ;
        double rendimentoMensal = 0.07;

        System.out.println ("o rendimento mensal dos r$ 500.00 após 30 dias é de r$ " + (valorDepositado*rendimentoMensal));

    }

}
