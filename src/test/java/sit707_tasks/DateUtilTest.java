package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Bidhan Babu gupta
 */
public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "s223623837";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Bidhan Babu Gupta";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testMaxJanuary31ShouldIncrementToFebruary1() {
        DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxJanuary31ShouldDecrementToJanuary30() {
        DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testMinJanuary1ShouldIncrementToJanuary2() {
        DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testMinJanuary1ShouldDecrementToDecember31() {
        DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }

    @Test
    public void testMaxFebruary28ShouldIncrementToFebruary29() {
        DateUtil date = new DateUtil(28, 2, 2024);
        System.out.println("testMaxFebruary28ShouldIncrementToFebruary29 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testMaxFebruary28ShouldDecrementToFebruary27() {
        DateUtil date = new DateUtil(28, 2, 2024);
        System.out.println("testMaxFebruary28ShouldDecrementToFebruary27 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(27, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }

    @Test
    public void testMinMarch1ShouldIncrementToMarch2() {
        DateUtil date = new DateUtil(1, 3, 2024);
        System.out.println("testMinMarch1ShouldIncrementToMarch2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testMaxMarch31ShouldDecrementToMarch30() {
        DateUtil date = new DateUtil(31, 3, 2024);
        System.out.println("testMaxMarch31ShouldDecrementToMarch30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(3, date.getMonth());
    }

    @Test
    public void testMinDecember1ShouldIncrementToDecember2() {
        DateUtil date = new DateUtil(1, 12, 2024);
        System.out.println("testMinDecember1ShouldIncrementToDecember2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }

    @Test
    public void testMaxDecember31ShouldDecrementToDecember30() {
        DateUtil date = new DateUtil(31, 12, 2024);
        System.out.println("testMaxDecember31ShouldDecrementToDecember30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }

    // Additional Test Cases for "Calculates Previous Date" (Green Header)
    @Test
    public void testPreviousDate_Case1A() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testPreviousDate_Case2A() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.decrement();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testPreviousDate_Case6A() {
        DateUtil date = new DateUtil(15, 1, 1994);
        date.decrement();
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    // Additional Test Cases for "Calculates Next Date" (Orange Header)
    @Test
    public void testNextDate_Case1B() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate_Case2B() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.increment();
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate_Case13B() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    @Test
    public void testNextDate_Case4A() {
        DateUtil date = new DateUtil(30, 6, 1994);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate_Case8A() {
        DateUtil date = new DateUtil(15, 11, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate_Case9A() {
        DateUtil date = new DateUtil(15, 12, 1994);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(1994, date.getYear());
    }

    @Test
    public void testNextDate_Case10A() {
        DateUtil date = new DateUtil(15, 6, 1700);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1700, date.getYear());
    }

    @Test
    public void testNextDate_Case11A() {
        DateUtil date = new DateUtil(15, 6, 1701);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1701, date.getYear());
    }

    @Test
    public void testNextDate_Case12A() {
        DateUtil date = new DateUtil(15, 6, 2023);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testNextDate_Case13A() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        Assert.assertEquals(16, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    // Additional Test Cases for February with Leap Year
    @Test
    public void testPreviousDate_LeapYear_Feb28_2020() {
        DateUtil date = new DateUtil(28, 2, 2020);
        date.decrement();
        Assert.assertEquals(27, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2020, date.getYear());
    }

    @Test
    public void testNextDate_LeapYear_Feb28_2020() {
        DateUtil date = new DateUtil(28, 2, 2020);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2020, date.getYear());
    }

    @Test
    public void testPreviousDate_LeapYear_Feb28_2024() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.decrement();
        Assert.assertEquals(27, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testNextDate_LeapYear_Feb28_2024() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
}