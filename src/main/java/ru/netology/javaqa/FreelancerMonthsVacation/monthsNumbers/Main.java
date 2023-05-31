package ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers;

public class Main {

    public static void main(String[] args) {
        MonthsNumberService calculate = new MonthsNumberService();

        int count = calculate.calculate(10000, 3000, 20000);
        System.out.println("Months to be vacation = " + count);

    }


}
