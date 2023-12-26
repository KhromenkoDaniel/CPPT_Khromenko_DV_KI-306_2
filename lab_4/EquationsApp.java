package lab_4;

public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println(" y=ctg(8x)/x = " + calc.doCalculation(200));
        System.out.println(" y=ctg(8x)/x = " + calc.doCalculation(80));
        System.out.println(" y=ctg(8x)/x = " + calc.doCalculation(-5555));

        System.out.println(" y=ctg(8x)/x = " + calc.doCalculationWithInputInside());
    }
}

