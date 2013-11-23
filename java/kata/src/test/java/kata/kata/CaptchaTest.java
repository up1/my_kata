package kata.kata;

import static org.junit.Assert.*;

import org.junit.Test;


public class CaptchaTest {
	
	@Test
	public void whenOnePlusOneShouldSeeTwo() throws Exception {
		MyCaptcha myCaptcha = new MyCaptcha();
		int result = myCaptcha.process("1", "+", "1");
		assertEquals(2, result);
	}
	
}
