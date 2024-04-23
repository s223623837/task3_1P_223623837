package sit707_tasks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CustomDateUtilTest {
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
    public void testIncrementDay() {
        // D1: Days 1 to 28
        DateUtil dateUtil1 = new DateUtil(15, 1, 2024); // January 15, 2024
        dateUtil1.increment();
        assertEquals("16 January 2024", dateUtil1.toString());

        // D2: Day 29
        DateUtil dateUtil2 = new DateUtil(29, 2, 2024); // February 29, 2024 (leap year)
        dateUtil2.increment();
        assertEquals("1 March 2024", dateUtil2.toString());

        // D3: Day 30
        DateUtil dateUtil3 = new DateUtil(30, 4, 2024); // April 30, 2024
        dateUtil3.increment();
        assertEquals("1 May 2024", dateUtil3.toString());

        // D4: Day 31
        DateUtil dateUtil4 = new DateUtil(31, 12, 2023); // December 31, 2023
        dateUtil4.increment();
        assertEquals("1 January 2024", dateUtil4.toString());
    }

    @Test
    public void testDecrementDay() {
        // M1: Months with 31 days
        DateUtil dateUtil1 = new DateUtil(1, 5, 2024); // May 1, 2024
        dateUtil1.decrement();
        assertEquals("30 April 2024", dateUtil1.toString());

        // M2: Months with 30 days
        DateUtil dateUtil2 = new DateUtil(1, 7, 2024); // July 1, 2024
        dateUtil2.decrement();
        assertEquals("30 June 2024", dateUtil2.toString());

        // M3: February (common year)
        DateUtil dateUtil3 = new DateUtil(1, 3, 2023); // March 1, 2023
        dateUtil3.decrement();
        assertEquals("28 February 2023", dateUtil3.toString());
    }
    @Test
    public void testBoundaryValues() {
        // Boundary value tests for day (1 and 31), month (1 and 12), year (1700 and 2024)
        DateUtil dateUtil1 = new DateUtil(1, 1, 1700); // Lowest day, month, year
        dateUtil1.increment();
        assertEquals("2 January 1700", dateUtil1.toString());

        DateUtil dateUtil2 = new DateUtil(31, 12, 2024); // Highest day, month, year
        dateUtil2.increment();
        assertEquals("1 January 2025", dateUtil2.toString());
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidInputs() {
        // Test invalid day, month, year values
        new DateUtil(0, 1, 2024); // Invalid day (less than minimum)
    }

    @Test
    public void testLeapYear() {
        // Test February in a leap year (2024)
        DateUtil dateUtil = new DateUtil(28, 2, 2024); // February 28, 2024
        dateUtil.increment();
        assertEquals("29 February 2024", dateUtil.toString());
    }
    @Test
    public void testNonLeapYearFebruary() {
        DateUtil dateUtil = new DateUtil(28, 2, 2021); // February 28, 2021 (non-leap year)
        dateUtil.increment();
        assertEquals("1 March 2021", dateUtil.toString());
    }

    @Test
    public void testLeapYearFebruaryBoundary() {
        DateUtil dateUtil = new DateUtil(28, 2, 2024); // February 28, 2024 (leap year)
        dateUtil.increment();
        assertEquals("29 February 2024", dateUtil.toString());
    }
    @Test(expected = RuntimeException.class)
    public void testInvalidDay() {
        new DateUtil(0, 1, 2024); // Invalid day (less than minimum)
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidMonth() {
        new DateUtil(15, 13, 2024); // Invalid month (greater than maximum)
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidYear() {
        new DateUtil(1, 1, 1699); // Invalid year (below minimum)
    }
    @Test
    public void testEndOf30DayMonth() {
        DateUtil dateUtil = new DateUtil(30, 4, 2024); // April 30, 2024
        dateUtil.increment();
        assertEquals("1 May 2024", dateUtil.toString());
    }

    @Test
    public void testEndOf31DayMonth() {
        DateUtil dateUtil = new DateUtil(31, 7, 2024); // July 31, 2024
        dateUtil.increment();
        assertEquals("1 August 2024", dateUtil.toString());
    }


}
