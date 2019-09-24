package test;

import static org.junit.Assert.*;
import main.LeapYear;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {

	LeapYear ly;

	@Before
	public void initializeLeapYear()
	{
		ly=new LeapYear();
	}

	@Test
	public void testDivisibilityBy4IsLeap()
	{
		assertTrue(isLeap(16));
	}

	@Test
	public void testDivisibilityBy100IsNotLeap()
	{
		assertFalse(isLeap(200));
	}

	@Test
	public void testDivisibilityBy100and400IsLeap()
	{
		assertTrue(isLeap(4000));
	}

	private boolean isLeap(int year)
	{
		return ly.isLeapYear(year);
	}

}
