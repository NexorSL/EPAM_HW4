package ua.epam.Task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    private LocalDateTime date;
    private double totalAmount;
    private int discount;
    private double amountToPay;

    public Receipt() {
    }

    public Receipt(LocalDateTime date, double totalAmount, int discount, double amountToPay) {
        this.date = date;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.amountToPay = amountToPay;
    }


    public String printReceipt() {
        return "Receipt:" +
                "\ndate=" + date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")) +
                ", \ntotalAmount=" + totalAmount +
                ", \ndiscount=" + discount +
                "%, \nfinalAmount=" + amountToPay;
    }


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }
}
