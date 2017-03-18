
public class CalculatorTest {
    public static void main(String[] args) {

        ComplexCalculator complexCalculator = new ComplexCalculator();
        double suma = complexCalculator.addDouble(2.4, 3.5);
        String polacz = complexCalculator.addString("Jan", "Ko");
        System.out.println(suma);
        System.out.println(polacz);
    }

}
