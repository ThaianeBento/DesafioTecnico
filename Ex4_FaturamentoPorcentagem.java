//Thaiane
package Desafio;

public class Ex4_FaturamentoPorcentagem {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double totalFaturamento = sp + rj + mg + es + outros;
        
        System.out.printf("Percentual de SP: %.2f%%\n", calcularPercentual(sp, totalFaturamento));
        System.out.printf("Percentual de RJ: %.2f%%\n", calcularPercentual(rj, totalFaturamento));
        System.out.printf("Percentual de MG: %.2f%%\n", calcularPercentual(mg, totalFaturamento));
        System.out.printf("Percentual de ES: %.2f%%\n", calcularPercentual(es, totalFaturamento));
        System.out.printf("Percentual de Outros: %.2f%%\n", calcularPercentual(outros, totalFaturamento));
    }
    
    public static double calcularPercentual(double valor, double total) {
        return (valor / total) * 100;
    }
}

