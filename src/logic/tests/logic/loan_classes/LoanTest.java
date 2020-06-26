package logic.loan_classes;

import logic.loan_classes.Borrower;
import logic.loan_classes.Loan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {
    @Test
    void loanNumberTest() {
        assertTrue(new Loan(10, new Borrower(), "2020-01-01").getID() > 0);
    }

    @Test
    void amountIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> new Loan(-1, new Borrower(), "2020-06-22"));
    }

    @Test
    void incorrectDateOrderTest() {
        assertThrows(IllegalArgumentException.class, () -> new Loan(-1, new Borrower(), "22-06-2020"));
    }
}