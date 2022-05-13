public class ExFix06_trocandoValores {
    
    /*Ex06.
    Desenvolva um programa que tenha duas variáveis do tipo String. 
    Efetue a troca dos valores de uma com a outra e imprima no console com os valores trocados.*/

    public static void main (String[] args) {

        String a = "Colher";
        String b = "Garfo";
        String c;

        c = b;
        b = a;
        a = c;

        System.out.println (" o valor de a é " + a );
        System.out.println (" o valor de b é " + b );

    }

}
