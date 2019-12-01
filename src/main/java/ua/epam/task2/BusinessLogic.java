package ua.epam.task2;

import java.time.LocalDateTime;

public class BusinessLogic {

    public int getDiscount(double total) {
        if (total < 500) {
            return 5;
        } else if (total > 500 && total < 1000) {
            return 10;
        } else if (total > 1000) {
            return 15;
        }
        return 0;
    }

    public Receipt calcTotal(double total) {
        Receipt receipt = new Receipt();
        LocalDateTime localDate = LocalDateTime.now();
        double toPay = total - (total * 0.01 * getDiscount(total));

        receipt.setDiscount(getDiscount(total));
        receipt.setTotalAmount(total);
        receipt.setDate(localDate);
        receipt.setAmountToPay(toPay);
        return receipt;
    }
}
