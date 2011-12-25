package com.winvector.sample.def;

import java.util.Random;

public interface RandomVariable {
	double logProb(double v);
	double generate(Random rand);
	void setExpectation(double v);
	double expectation();
	RandomVariable copy();
}
