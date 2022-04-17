package Moderna.Modulo01.aula1;

public class exercicio6 {


    public static void main(String[] args){

        String a= "Colher";
        String b= "Garfo";
        String c;

        c = b;
        b = a;
        a = c;

        System.out.println(" o valor de a é " + a );
        System.out.println(" o valor de b é " + b );
    }
}
