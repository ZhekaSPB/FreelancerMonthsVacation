package ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers.MonthsNumberService;


public class MonthsNumberServiceTest {
    @Test
    void shouldCalculateExact1() {
        MonthsNumberService service = new MonthsNumberService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateExact2() {
        MonthsNumberService service = new MonthsNumberService();

        int expected = 4;
        int actual = service.calculate(100000, 6000, 150000);

        Assertions.assertEquals(expected, actual);

    }
}