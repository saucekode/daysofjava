import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {
    SalesCommission commission;
    @BeforeEach
    void setUp(){
        commission = new SalesCommission();
    }

    @AfterEach
    void tearDown(){
        commission = null;
    }

    @Test
    void shouldReturnSalesForOneDay(){
        commission.collectSales(400);
        assertEquals(400, commission.getSales());
    }

    @Test
    void shouldReturnGrossSalary(){
        commission.collectSales(5000);
        assertEquals(650, commission.getGrossSalary());

        commission.collectSales(5500);
        assertEquals(695, commission.getGrossSalary());

        commission.collectSales(6000);
        assertEquals(740, commission.getGrossSalary());

        commission.collectSales(7000);
        assertEquals(830, commission.getGrossSalary());
    }

    @Test
    void shouldReturnFrequencyOfGrossSalary(){
        commission.collectSales(5000);
        commission.setGrossSalaryFrequency();

        commission.collectSales(5500);
        commission.setGrossSalaryFrequency();

        commission.collectSales(6000);
        commission.setGrossSalaryFrequency();

        commission.collectSales(7000);
        commission.setGrossSalaryFrequency();

        int[] expectedFrequency = {0,0,0,0,2,1,1,0,0};
        assertArrayEquals(expectedFrequency, commission.getGrossSalaryFrequency());
    }
}