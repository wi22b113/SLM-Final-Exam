package at.fhtw.slmfinalexam.Controller;

import at.fhtw.slmfinalexam.Total.Total;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialControllerTest {

    @Test
    void getTotal() {
        //Arrange
        FactorialController.t.setTotal(0);
        int expected = FactorialController.t.getTotal();


        //Act

        int result = (int) FactorialController.getTotal();

        //Assert
        assertEquals(expected,result);
    }

    @Test
    void calcFactorial(){
        //Arrange

        int number = 5;

        //Act
        int result = FactorialController.calcFactorial(number);

        //Assert
        assertEquals(result,120);

    }


}