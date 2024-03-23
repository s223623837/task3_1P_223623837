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
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		 // January min boundary area: min+1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		   DateUtil date = new DateUtil(1, 1, 2024);
		    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(31, date.getDay());
		    Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
	    // February max boundary area: max+1
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("testMaxFebruary28ShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxFebruary28ShouldDecrementToFebruary27() {
	    // February max boundary area: max-1
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("testMaxFebruary28ShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
	    // March min boundary area: min+1
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("march1ShouldIncrementToMarch2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
	    // March max boundary area: max-1
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("march31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}
	@Test
	public void testMinDecember1ShouldIncrementToDecember2() {
	    // December min boundary area: min+1
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("december1ShouldIncrementToDecember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
	    // December max boundary area: max-1
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("december31ShouldDecrementToDecember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}


	
}
