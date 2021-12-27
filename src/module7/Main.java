package module7;

public class Main {
    public static void main(String[] args) {
        MortgageCalc mort = new MortgageCalc(1000000, 7.5, 15, 4000000, 60);
        mort.printResults();
//        System.out.println(mort.getMonthMortgagePayment());
    }
}
