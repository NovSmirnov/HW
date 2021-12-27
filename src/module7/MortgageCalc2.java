package module7;

import java.text.DecimalFormat;
import java.util.Random;

public class MortgageCalc2 {
    private double enterCapital; // Изначальный капитал / первый взнос по ипотеке
    private double capital; // Изначальный капитал / первый взнос по ипотеке
    private double interestRate; // Процентная ставка по ипотечному кредиту
    private int quYears; // Количество лет, на которое берётся кредит / в течение которого капитал инвестируется
    private double monthMortgagePayment; // Ежемесячный платёж по ипотеке
    private int monthRentPaymentRate; // Ежемесячный платёж по аренде жилья в процентах от ежемесячного платежа по ипотечному кредиту
    private double creditSum; // Сумма кредита
    private double creditPaymentsSum; // Сумма всех платежей по кредиту за весь срок
    private double rentPaymentsSum; // Сумма всех платежей по аренде жилья за весь срок инвестирования
    private double overPayment; // Сумма переплаты по ипотечному кредиту.

    public MortgageCalc2(double capital, double interestRate, int quYears, double creditSum, int monthRentPaymentRate,
                         double investmentRate) {
        this.enterCapital = capital;
        this.capital = capital;
        this.interestRate = interestRate;
        this.quYears = quYears;
        this.creditSum = creditSum;
        this.monthRentPaymentRate = monthRentPaymentRate;
    }

    public void printResults () {
        mortgageCounter();
        investCounter();
        payForRent();
        DecimalFormat df = new DecimalFormat("########.##");
        System.out.println("Сценарий № 1, в котором Вы возьмёте ипотечный кредит будет следующим:");
        System.out.println("Ваш первый взнос по ипотеке будет " + enterCapital + " рублей");
        System.out.println("Сумма ипотечного кредита составит " + creditSum + " рублей");
        System.out.println("Процентная ставка по ипотечному кредиту " + interestRate + " процентов годовых");
        System.out.println("Вы берете ипотечный кредит на " + quYears + " лет");
        System.out.println("В этом случае ежемесячный платеж по ипотеке составит " + df.format(monthMortgagePayment) + " рублей");
        System.out.println("Сумма всех платежей по кредиту за весь срок составит " + df.format(creditPaymentsSum) + " рублей");
        System.out.println("Переплата по кредиту составит " + df.format(overPayment) + " рублей");
        System.out.println("");
        System.out.println("Сценарий № 2, в котором Вы будете инвестировать Ваши средства и снимать жильё:");
        System.out.println("Ваш изначальный инвестиционный капитал равен " + enterCapital + " рублей");
        System.out.println("Вы инвестируете на " + quYears + " лет");
        System.out.println("Вы инвестируете свой капитал под случайный процент от 3 до 16% годовых, с пересчётом \n" +
                "каждый месяц и каждый месяц добавляете к инвестиционному капиталу разницу между ипотечным платежом" +
                " из сценария №1 и стоимостью ежемесячного платежа по арендной плате");
        System.out.println("Ежемесячная стоимость аренды жилья составит " + df.format(monthMortgagePayment * monthRentPaymentRate / 100) + " рублей");
        System.out.println("Итоговый капитал в случае инвестирования первоначальной суммы составит  " + df.format(capital) + " рублей");
        System.out.println("Сумма всех платежей за аренду недвижимости составит " + df.format(rentPaymentsSum) + " рублей");
    }

    public double getMonthMortgagePayment() {
        return monthMortgagePayment;
    }

    private void mortgageCounter() {
        this.monthMortgagePayment = creditSum * (interestRate / 12 / 100 * (Math.pow((1 + interestRate / 12 / 100), quYears * 12) /
                ((Math.pow(1 + interestRate / 12 / 100, quYears * 12) - 1))));
        this.creditPaymentsSum = monthMortgagePayment * quYears * 12;
        this.overPayment = creditPaymentsSum - creditSum;
    }

    private void investCounter() {
        Random random = new Random();
        for (int i = 0; i < quYears * 12; i++) {
            capital = capital * (1 + ((double) random.nextInt(17) + 3) /12 / 100) + (monthMortgagePayment * (1 - (double) (monthRentPaymentRate / 100))); // Ежемесячный прирост капитала от 4 до 20%  / 12
        }
    }

    private void payForRent() {
        for (int i = 0; i < quYears * 12; i++) {
            this.rentPaymentsSum += monthMortgagePayment * monthRentPaymentRate / 100;
        }
    }
}
