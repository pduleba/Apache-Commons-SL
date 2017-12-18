package com.pduleba.apache.commons.sl.rng;

import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;

public class RNG {

	public static void main(String[] args) {
		// Instantiate a "Mersenne-Twister" generator with a factory method.
		UniformRandomProvider rng = RandomSource.create(RandomSource.MT);

		// Use it to produce a floating-point value between 0 and 1.
		double random = rng.nextDouble();

		System.out.println(random);
	}

}
