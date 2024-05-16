package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class CustomDateUtilTestCases {

    @Test
    public void testIncrementDay() {
        CustomDateUtil date1 = new CustomDateUtil(15, 1, 2024); // January 15, 2024
        date1.increment();
        Assert.assertEquals("16 January 2024", date1.toString());

        CustomDateUtil date2 = new CustomDateUtil(29, 2, 2024); // February 29, 2024 (leap year)
        date2.increment();
        Assert.assertEquals("1 March 2024", date2.toString());

        CustomDateUtil date3 = new CustomDateUtil(30, 4, 2024); // April 30, 2024
        date3.increment();
        Assert.assertEquals("1 May 2024", date3.toString());

        CustomDateUtil date4 = new CustomDateUtil(31, 12, 2023); // December 31, 2023
        date4.increment();
        Assert.assertEquals("1 January 2024", date4.toString());
    }

    @Test
    public void testDecrementDay() {
        CustomDateUtil date1 = new CustomDateUtil(1, 5, 2024); // May 1, 2024
        date1.decrement();
        Assert.assertEquals("30 April 2024", date1.toString());

        CustomDateUtil date2 = new CustomDateUtil(1, 7, 2024); // July 1, 2024
        date2.decrement();
        Assert.assertEquals("30 June 2024", date2.toString());

        CustomDateUtil date3 = new CustomDateUtil(1, 3, 2023); // March 1, 2023
        date3.decrement();
        Assert.assertEquals("28 February 2023", date3.toString());
    }

    @Test
    public void testBoundaryValues() {
        // Boundary tests for day (1 and 31), month (1 and 12), year (1700 and 2024)

        CustomDateUtil date1 = new CustomDateUtil(1, 1, 1700); // Lowest day, month, year
        date1.increment();
        Assert.assertEquals("2 January 1700", date1.toString());

        CustomDateUtil date2 = new CustomDateUtil(31, 12, 2024); // Highest day, month, year
        date2.increment();
        Assert.assertEquals("1 January 2025", date2.toString());
    }

    @Test
    public void testLeapYear() {
        CustomDateUtil date1 = new CustomDateUtil(28, 2, 2024); // February 28, 2024 (leap year)
        date1.increment();
        Assert.assertEquals("29 February 2024", date1.toString());

        CustomDateUtil date2 = new CustomDateUtil(28, 2, 2021); // February 28, 2021 (non-leap year)
        date2.increment();
        Assert.assertEquals("1 March 2021", date2.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDay() {
        new CustomDateUtil(0, 1, 2024); // Invalid day (less than minimum)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMonth() {
        new CustomDateUtil(15, 13, 2024); // Invalid month (greater than maximum)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidYear() {
        new CustomDateUtil(1, 1, 1699); // Invalid year (below minimum)
    }

    @Test
    public void testValidDateWithinRange() {
        // Equivalence class testing for valid day, month, and year within the specified range

        CustomDateUtil date1 = new CustomDateUtil(15, 6, 2024); // Valid date within range
        Assert.assertEquals("15 June 2024", date1.toString());

        CustomDateUtil date2 = new CustomDateUtil(1, 12, 2024); // Another valid date within range
        Assert.assertEquals("1 December 2024", date2.toString());
    }

    @Test
    public void testInvalidDateOutsideRange() {
        // Equivalence class testing for invalid day, month, and year outside the specified range

        // Invalid day (32)
        try {
            new CustomDateUtil(32, 1, 2024);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        // Invalid month (0)
        try {
            new CustomDateUtil(15, 0, 2024);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        // Invalid year (10000)
        try {
            new CustomDateUtil(1, 1, 10000);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testEndOf30DayMonth() {
        CustomDateUtil date1 = new CustomDateUtil(30, 4, 2024); // April 30, 2024
        date1.increment();
        Assert.assertEquals("1 May 2024", date1.toString());
    }

    @Test
    public void testEndOf31DayMonth() {
        CustomDateUtil date1 = new CustomDateUtil(31, 7, 2024); // July 31, 2024
        date1.increment();
        Assert.assertEquals("1 August 2024", date1.toString());
    }

    @Test
    public void testLastDayOfFebruaryLeapYear() {
        CustomDateUtil date1 = new CustomDateUtil(28, 2, 2024); // February 28, 2024 (leap year)
        date1.increment();
        Assert.assertEquals("29 February 2024", date1.toString());
    }

    @Test
    public void testLastDayOfFebruaryNonLeapYear() {
        CustomDateUtil date1 = new CustomDateUtil(28, 2, 2021); // February 28, 2021 (non-leap year)
        date1.increment();
        Assert.assertEquals("1 March 2021", date1.toString());
    }

    @Test
    public void testBeginningOfYear() {
        CustomDateUtil date1 = new CustomDateUtil(1, 1, 2024); // January 1, 2024
        date1.decrement();
        Assert.assertEquals("31 December 2023", date1.toString());
    }

    @Test
    public void testBeginningOfMonth() {
        CustomDateUtil date1 = new CustomDateUtil(1, 5, 2024); // May 1, 2024
        date1.decrement();
        Assert.assertEquals("30 April 2024", date1.toString());
    }
}
