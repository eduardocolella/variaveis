import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade03 ManipulacaoVariavel");


    // Criação de variáveis
    String nomeProduto = "Rx 7600";
    double precoUnitario = 1699.99;
    int quantidadeComprada = 3;
    double taxaImposto = 0.15; // 15% de imposto
    double margemLucro = 0.25; // 25% de margem de lucro

    // Operações simples
    double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
    double valorImposto = valorTotalSemImpostos * taxaImposto;
    double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
    double precoVendaNecessario = valorTotalComImpostos / (1 - margemLucro);

    //Arredondar e formatar valores
    DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");

    // Arredondar e formatar o preço de venda
    double precoVendaArredondado = Math.round(precoVendaNecessario * 100.0) / 100.0;

    // Mensagem final
    String mensagemFinal = String.format("Produto: %s\nValor Total com Impostos: %s\nPreço de Venda Sugerido: %s",
            nomeProduto,
            formatoMoeda.format(valorTotalComImpostos),
            formatoMoeda.format(precoVendaArredondado));

    // Exibição de resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: " + formatoMoeda.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Taxa de Imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de Lucro: " + (margemLucro * 100) + "%");
        System.out.println("Valor Total Sem Impostos: " + formatoMoeda.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: " + formatoMoeda.format(valorImposto));
        System.out.println("Valor Total Com Impostos: " + formatoMoeda.format(valorTotalComImpostos));
        System.out.println("Preço de Venda Necessário: " + formatoMoeda.format(precoVendaArredondado));
        System.out.println(mensagemFinal);
}
}
