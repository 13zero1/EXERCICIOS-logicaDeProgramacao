package Moderna.Modulo01.aula1;

public class exercicio5 {

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
