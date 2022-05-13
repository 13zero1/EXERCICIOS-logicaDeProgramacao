public class ex06_expressaoFinal {

    /*Ex06_
    Qual resultado da expressão:
        ( (123*344) + 2344) >= (8799) != false ? “Moderna tecnologia” : “Finalmente..” */

    public static void main(String[] args) {

        int expressao = (123*344) + 2344;

        if (expressao >= 8799) {
            System.out.println("Moderna tecnologia");
        } else {
            System.out.println("Finalmente...");
    
        }

    }

}
