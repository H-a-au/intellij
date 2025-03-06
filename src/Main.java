import java.math.BigDecimal;
import java.math.RoundingMode;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double netPrice = 9.99;
        double vatRate = 0.23;
        double grossPrice = netPrice * (1 + vatRate);
        double totalGross = grossPrice * 10_000;
        double totalNet = totalGross / (1 + vatRate);

        System.out.println("Using double:");
        System.out.println("Gross price: " + grossPrice);
        System.out.println("Total gross value for 10,000 pcs: " + totalGross);
        System.out.println("Total net value after removing VAT: " + totalNet);
        System.out.println();

        // Using BigDecimal
        BigDecimal netPriceBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.23");
        BigDecimal grossPriceBD = netPriceBD.multiply(BigDecimal.ONE.add(vatRateBD));
        BigDecimal totalGrossBD = grossPriceBD.multiply(new BigDecimal("10000"));
        BigDecimal totalNetBD = totalGrossBD.divide(BigDecimal.ONE.add(vatRateBD), 2, RoundingMode.HALF_UP);

        System.out.println("Using BigDecimal:");
        System.out.println("Gross price: " + grossPriceBD);
        System.out.println("Total gross value for 10,000 pcs: " + totalGrossBD);
        System.out.println("Total net value after removing VAT: " + totalNetBD);

        // Conclusion

        System.out.println("Big decimal helps resolve precision error");

    }
}