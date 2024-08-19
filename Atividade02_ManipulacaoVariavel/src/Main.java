public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade 02 ManipulacaoVariavel");


    // Criação de variáveis
    String nome = "Eduardo Colella";
    int idade = 23;
    double salarioBrutoMensal = 3000.00;
    int mesesTrabalhados = 12;
    int quantidadeProdutos = 10;
    double valorTotalCompras = 1500.00;

    // Operações simples
    // Salário anual bruto
    double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;

    // Desconto fixo
    double desconto = 500.00;
    double salarioAnualLiquido = salarioAnualBruto - desconto;

    // Média do valor gasto por produto
    double mediaGastoPorProduto = valorTotalCompras / quantidadeProdutos;

    // Concatenação de mensagem
    String mensagem = "Olá " + nome + ", seu salário anual líquido é R$ " + salarioAnualLiquido + ".";

    // Exibição de resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutos);
        System.out.println("Valor Total das Compras: R$ " + valorTotalCompras);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Média do Valor Gasto por Produto: R$ " + mediaGastoPorProduto);
        System.out.println(mensagem);
}
}
}