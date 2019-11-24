package ua.epam.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {
    public static void main(String[] args) {
        BusinessLogic businessLogic = new BusinessLogic();
        double value = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value:");
        try {
            value = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

        Receipt receipt = businessLogic.calcTotal(value);
        System.out.println(receipt.printReceipt());
    }
}
