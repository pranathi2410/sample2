package demo3;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.Assert;

public class CalculateTest {

	@Test
	public void testCalculateInterest() {
		Calculate obj=new Calculate();
		float expected=obj.calculateInterest(20000,10, 10);
		float actual=20000;
		assertEquals(expected,actual,0.0);
		
	}


}
