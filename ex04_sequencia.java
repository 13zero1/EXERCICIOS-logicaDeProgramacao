package Moderna.Modulo01.aula1;

public class ex04_sequencia {
    
    /*Ex04.
    Crie um programa que siga os seguintes passos:
        ● Crie uma variável do tipo int de valor 10;
        ● Incremente essa variável utilizando operador unitário.
        ● Faça a multiplicação dessa variável com o número 25.
        ● Decremente essa variável utilizando operador unitário.
        ● Faça a soma dessa variável com o número 30 com a sua variável já incrementada com o operador unitário.
        ● Imprima a resposta no console*/

    public static void main(String[] args) {

        int num = 10; ;
        num++;
        int multiplicacao = num * 25;
        num--;
        num = 30 + ++num;

        System.out.println("o valor da variavel é " + num);
        
    }
    
}
