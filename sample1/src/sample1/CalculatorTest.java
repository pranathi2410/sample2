
package sample1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

	@Test
	void testcalculate() {
		Calculator si=new Calculator();
		float expected=750;
		float actual=si.calculate(5000, 5, 3);
		Assertions.assertEquals(expected,actual);
		
		
	}

}
