package ua.epam.task2;

import org.junit.Before;
import org.junit.Test;

import javax.xml.transform.Result;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class BusinessLoginTest {
    private int resultDiscount;
    private Receipt resultReceipt;
    private Receipt receipt;
    private BusinessLogic businessLogic = new BusinessLogic();

    @Before
    public void setUpBusinessLogic(){
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        receipt = new Receipt(localDateTime,400,5,380);
        resultReceipt = businessLogic.calcTotal(400);
    }

    @Test
    public void testGetDiscount(){
        resultDiscount = businessLogic.getDiscount(465) ;
        assertEquals(resultDiscount, 5);
        resultDiscount = businessLogic.getDiscount(793);
        assertEquals(resultDiscount, 10);
        resultDiscount = businessLogic.getDiscount(51254);
        assertEquals(resultDiscount, 15);
    }

    @Test
    public void testCalcTotal(){
        assertEquals(resultReceipt.getDiscount(), receipt.getDiscount());
        assertEquals(resultReceipt.getTotalAmount(), receipt.getTotalAmount(), 0.0);
        assertEquals(resultReceipt.getAmountToPay(), receipt.getAmountToPay(), 0.0);
    }
}
