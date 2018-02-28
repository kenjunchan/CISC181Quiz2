package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgCore.CarLoan;

public class CarLoanTest {
	
	@Test
	public void test()
	{
		CarLoan c1 = new CarLoan(35000.0,0.0,60,.10);
		assertEquals((Math.round(c1.calculateMonthlyPayment() * 100) / 100.0), 743.65, .01);
		assertEquals((Math.round(c1.calculateTotalInterest() * 100) / 100.0), 9618.79, .01);
		CarLoan c2 = new CarLoan(30000.0,5000.0,30,.05);
		assertEquals((Math.round(c2.calculateMonthlyPayment() * 100) / 100.0), 888.23, .01);
		assertEquals((Math.round(c2.calculateTotalInterest() * 100) / 100.0), 1647.02, .01);
	}
}
