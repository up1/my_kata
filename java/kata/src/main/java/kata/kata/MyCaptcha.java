package kata.kata;

public class MyCaptcha {

	public int process(String left, String operator, String right) {
		if (left.equals("one")) {
			left = "1";
		} else if( left.equals("three") ) {
			left = "3";
		}
		if (right.equals("one")) {
			right = "1";
		}

		int result = 0;
		if (operator.equals("+")) {
			result = Integer.parseInt(left) + Integer.parseInt(right);
		} else if( operator.equals("-") ) {
			result = Integer.parseInt(left) - Integer.parseInt(right);
		}
		return result;
	}

}
