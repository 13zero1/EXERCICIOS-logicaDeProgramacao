package Moderna.Modulo01.aula1;

public class ex01_mediaNotas {
        
        /*Ex01.
        Crie 4 variáveis do tipo double com valores (8.8 - 3.5 - 7.3 - 9.0). Calcule a média das notas e imprima no console o resultado.*/

        public static void main(String[] args){
            
            //variaveis
            double nota1 = (8.8);
            double nota2 = (7.5);
            double nota3 = (1.3);
            double nota4 = (9.0);
            
            //calculando...
            double media = ((nota1+nota2+nota3+nota4)/4);
              
            //imprimindo...    
            System.out.println("A média é " + media);
                
        }
        
}
