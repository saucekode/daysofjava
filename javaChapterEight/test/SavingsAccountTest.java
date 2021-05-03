import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SavingsAccountTest {
    SavingsAccount saver1;
    SavingsAccount saver2;

    @BeforeEach
    void setUp(){
        saver1 = new SavingsAccount(2000.00);
        saver2 = new SavingsAccount(3000.00);
    }

    @AfterEach
    void tearDown(){
        saver1 = null;
        saver2 = null;
    }

    @Test
    void shouldReturnSaversSavingsBalance(){
        assertEquals(2000.00, saver1.getSavingsBalance());
        assertEquals(3000.00, saver2.getSavingsBalance());
    }

    @Test
    void shouldSetAndReturnAnnualInterestRate(){
        SavingsAccount.modifyInterestRate(0.04);
        SavingsAccount.modifyInterestRate(0.05);
        assertEquals(0.05, SavingsAccount.getAnnualInterestRate());
    }

    @Test
    void shouldModifyAnnualInterestRate(){
        SavingsAccount.modifyInterestRate(0.05);
        assertEquals(0.05, SavingsAccount.getAnnualInterestRate());
    }

    @Test
    void shouldCalculateMonthlyInterest(){
        double savingsBalance1 = saver1.getSavingsBalance();
        double savingsBalance2 = saver2.getSavingsBalance();

        SavingsAccount.modifyInterestRate(0.04);

        assertEquals(6.67, saver1.calculateMonthlyInterestRate(savingsBalance1));
        assertEquals(10.0, saver2.calculateMonthlyInterestRate(savingsBalance2));

        SavingsAccount.modifyInterestRate(0.05);

        assertEquals(8.33, saver1.calculateMonthlyInterestRate(savingsBalance1));
        assertEquals(12.5, saver2.calculateMonthlyInterestRate(savingsBalance2));
    }
}