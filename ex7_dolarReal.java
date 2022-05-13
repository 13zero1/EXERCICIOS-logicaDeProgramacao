package Moderna.Modulo01.aula1;

public class ex7_dolarReal {
    
    /*Ex07.
    Crie um programa que converta dólar para real. Considere a cotação a 5.61 e o valor do dólar como 300.*/

    public static void main (String[] args) {

        double valorDolar = 5.61;
        double quantidadeDolar = 300;

        System.out.println ("o dólar hoje vale US$ " + valorDolar) ;
        System.out.println ("Os US$ 300 vale R$ " + (quantidadeDolar*valorDolar) ) ;

    }

}
