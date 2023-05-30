package ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers;

public class MonthsNumberService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int i = 1; i <= 12; i++) {
            // Если на счету меньше threshold, то фрилансер рабтает, деньги увеличиваются на income
            // и уменьшается на expense
            if (money < threshold) {

                money = money + income - expenses;
            } else {
                count = count + 1;
                // если на счету больше threshold, то фрилансер не работает, количество месяцев увеличивается на 1,
                // из суммы на счету вычитается expenses и сумма уменьшается в 3 раза - траты на отдых

                money = (money - expenses) / 3;
            }
        }
        return count;
    }

}
