package sit707_tasks;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestMathEngine {
	private Calculator calculator = new Calculator();


    @Test
    public void testMultiplyExtremeValue() {
        assertEquals(Integer.MAX_VALUE * 2, calculator.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testMultiplyNearMiddle() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void testMultiplyOutsideExtreme1() {
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MAX_VALUE, -1));
    }

    @Test
    public void testMultiplyOutsideExtreme2() {
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testMultiplyNormal() {
        assertEquals(15, calculator.multiply(3, 5));
    }
    @Test
    public void testAddExtremeValue() {
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE, 0));
    }

    @Test
    public void testAddNearMiddle() {
        assertEquals(15, calculator.add(7, 8));
    }

    @Test
    public void testAddOutsideExtreme1() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testAddOutsideExtreme2() {
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));
    }

    @Test
    public void testAddNormal() {
        assertEquals(10, calculator.add(3, 7));
    }

    @Test
    public void testSubtractExtremeValue() {
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testSubtractNearMiddle() {
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void testSubtractOutsideExtreme1() {
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testSubtractOutsideExtreme2() {
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MAX_VALUE, -1));
    }

    @Test
    public void testSubtractNormal() {
        assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    public void testDivideExtremeValue() {
        assertEquals(Integer.MIN_VALUE, calculator.divide(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testDivideNearMiddle() {
        assertEquals(3, calculator.divide(15, 5));
    }

    @Test
    public void testDivideOutsideExtreme1() {
        assertEquals(0, calculator.divide(1, Integer.MIN_VALUE));
    }

    @Test
    public void testDivideOutsideExtreme2() {
        assertEquals(1, calculator.divide(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testDivideNormal() {
        assertEquals(4, calculator.divide(20, 5));
    }

}
