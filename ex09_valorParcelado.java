package Moderna.Modulo01.aula1;

public class ex09_valorParcelado {
    
    /*Ex09.
    O Carrefour está vendendo seus produtos parcelados em até 6x no cartão. 
    Desenvolva um programa que mostre o valor das parcelas de um produto que custa 1500.*/

    public static void main (String[] args) {

        int valorProduto = 1500;
        int quantidadeParcela = 6;

        System.out.println ("Se um produto que custa r$ " + valorProduto + " for pago de forma parcelada em 6x, a parcela vai custar r$ " + (valorProduto/quantidadeParcela));
 
    }

}
