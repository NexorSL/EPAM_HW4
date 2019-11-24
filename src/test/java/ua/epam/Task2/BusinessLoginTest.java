package ua.epam.Task2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class BusinessLoginTest {
    @Test
    public void testGetDiscount(){
        BusinessLogic businessLogic = new BusinessLogic();
        int res = businessLogic.getDiscount(465);
        assertEquals(res, 5);
        res = businessLogic.getDiscount(793);
        assertEquals(res, 10);
        res = businessLogic.getDiscount(54421);
        assertEquals(res, 15);
    }

    @Test
    public void testCalcTotal(){
        BusinessLogic businessLogic = new BusinessLogic();
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        Receipt receipt = new Receipt(localDateTime,400,5,380);
        Receipt res = businessLogic.calcTotal(400);
        assertEquals(res.getDiscount(), receipt.getDiscount());
        assertEquals(res.getTotalAmount(), receipt.getTotalAmount(), 0.0);
        assertEquals(res.getAmountToPay(), receipt.getAmountToPay(), 0.0);
    }
}
