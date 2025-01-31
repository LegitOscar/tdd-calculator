package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator instance = new Calculator();

    @Test
    void TestAdd(){
        int expected = 4;
        int actual = instance.add(2,2);
        assertEquals(expected, actual);
    }

    @Test
    void TestSubtract(){
        int expected = 2;
        int actual = instance.subtract(4,2);
        assertEquals(expected, actual);
    }

    @Test
    void TestMultiply(){
        int expected = 4;
        int actual = instance.multiply(2,2);
        assertEquals(expected, actual);

    }

    @Test
    void TestDivide(){
        int expected = 1;
        int actual = instance.divide(2,2);
        assertEquals(expected,actual);
    }

    @Test
    void TestNumberString(){
        int expected = 6;
        int actual = instance.add("1,2,3");
        assertEquals(expected, actual);
    }

    @Test
    void TestArray() {
        int expected = 6;
        int actual = instance.add(new int[]{1, 2, 3});
        assertEquals(expected, actual);
    }

    }




