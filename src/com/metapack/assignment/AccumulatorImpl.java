package com.metapack.assignment;

public class AccumulatorImpl implements Accumulator{

	int sumTotal;
	
	public
	AccumulatorImpl(){
		sumTotal = 0;
	}
	
	@Override
	public int accumulate(int... values) {
		int argSum = 0;
		for(int i:values) {
			argSum+=i;
		}
		sumTotal+=argSum;
		return argSum;
	}

	@Override
	public int getTotal() {
		return sumTotal;
	}

	@Override
	public void reset() {
		sumTotal=0;
	}

	
}
