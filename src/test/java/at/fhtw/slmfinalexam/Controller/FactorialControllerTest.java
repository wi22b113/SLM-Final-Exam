package at.fhtw.slmfinalexam.Controller;

import at.fhtw.slmfinalexam.Total.Total;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialControllerTest {

    @Test
    void getTotal() {
        //Arrange
        Total testTotal = new Total();
        long expected = 2345;


        //Act
        long result = FactorialController.calculateTotal(expected);

        //Assert
        assertEquals(expected,result);
    }
}