package Moderna.Modulo01.aula1;

public class ex05_salario {
    
    /*ex05.
    Crie um programa com variáveis para nome do vendedor, salário fixo, valor do total de vendas efetuadas no mês. 
    Sabendo que este vendedor ganha 20% de comissão sobre suas vendas efetuadas. 
    O valor do salário passe como double de 3500 e o total de vendas como double de 1350. Imprima no console uma tabela com:
        ● Nome do vendedor
        ● Salário fixo
        ● Valor da comissão daquele mês
        ● Valor do salário com a comissão*/

    public static void main(String[] args) {

        String nomeVendedor = "Danilo";
        double salarioFixo = 3500;
        double valorTotal = 1350;
        double comissao = valorTotal * 0.2;

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salario fixo: r$ " + salarioFixo);
        System.out.println("Valor da comissao: r$ "+comissao);
        System.out.println("Salario do mes: r$" + (salarioFixo +comissao));

    }
}
