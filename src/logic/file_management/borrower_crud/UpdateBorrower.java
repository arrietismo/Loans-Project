package logic.file_management.borrower_crud;

import logic.file_management.CRUD;
import logic.loan_classes.Borrower;
import logic.loan_classes.Loan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UpdateBorrower extends CRUD {
    public static void addLoan(Loan loan) throws IOException {
        CreateBorrower.create(loan.getBorrower());
        addLoan(loan, loan.getBorrower().getId());
    }

    public static void addLoan(Loan loan, final int BORROWER_ID) throws IOException {
        HashMap<Borrower, ArrayList<Loan>> data = dataBase.getData();
        Set<Map.Entry<Borrower, ArrayList<Loan>>> entrySet = data.entrySet();
        for (Map.Entry<Borrower, ArrayList<Loan>> entry : entrySet)
            if (BORROWER_ID == entry.getKey().getId()) {
                loan.setBorrower(entry.getKey());
                entry.getValue().add(loan);
                dataBase.updateData(data);
            }

    }
}
