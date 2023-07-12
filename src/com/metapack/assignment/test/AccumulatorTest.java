package com.metapack.assignment.test;

import org.junit.Test;

import com.metapack.assignment.Accumulator;
import com.metapack.assignment.AccumulatorImpl;

public class AccumulatorTest {
	
	@Test
	public void emptyConstructorTest() {
		Accumulator testAcc = new AccumulatorImpl();
		assert(testAcc.getTotal()==0);
	}
	
	
	@Test
	public void shouldRetunCorrectSumForSingleArgument() {
		int first = 21;
		Accumulator testAcc = new AccumulatorImpl();
		assert(testAcc.accumulate(first)==first);
		assert(testAcc.getTotal()==first);

	}
	
	@Test
	public void shouldReturnCorrectSumForMultipleArguments() {
		int first = 21;
		int second = 22;
		int third = 1;
		Accumulator testAcc = new AccumulatorImpl();
		assert(testAcc.accumulate(first) == first);
		assert(testAcc.accumulate(third, second) == second+third);
		assert(testAcc.getTotal()==first+second+third);
	}
	
	@Test
	public void shouldReturnCorrectSumAfterMultipleAccumulateCalls() {
		int first = 21;
		int second = 22;
		int third = 1;
		Accumulator testAcc = new AccumulatorImpl();
		assert(testAcc.accumulate(first, second, third) == first+second+third);
		assert(testAcc.getTotal()==first+second+third);
		
	}
	
	@Test
	public void shouldReturn0AfterReset() {
		int first = 12;
		int second = 25;
		
		Accumulator testAcc = new AccumulatorImpl();
		assert(testAcc.accumulate(first, second)==first+second);
		testAcc.reset();
		assert(testAcc.getTotal() == 0);
	}
}
