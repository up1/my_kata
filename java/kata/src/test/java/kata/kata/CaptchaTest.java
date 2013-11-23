package kata.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaptchaTest {

	MyCaptcha myCaptcha = new MyCaptcha();

	@Test
	public void whenOnePlusOneShouldSeeTwo() throws Exception {
		int result = myCaptcha.process("1", "+", "1");
		assertEquals(2, result);

		result = myCaptcha.process("one", "+", "1");
		assertEquals(2, result);
	}

	@Test
	public void whenThreeMinusOneShouldSeeTwo() throws Exception {
		int result = myCaptcha.process("3", "-", "1");
		assertEquals(2, result);

		result = myCaptcha.process("three", "-", "1");
		assertEquals(2, result);
	}

	@Test
	public void whenFiveMultiplyTwoShouldSeeTen() throws Exception {
		int result = myCaptcha.process("5", "*", "2");
		assertEquals(10, result);

		result = myCaptcha.process("five", "*", "two");
		assertEquals(10, result);
	}

}
