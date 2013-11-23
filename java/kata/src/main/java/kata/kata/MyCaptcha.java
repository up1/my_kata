package kata.kata;

import java.util.HashMap;

public class MyCaptcha {

	private HashMap<String, String> numberMap = new HashMap<String, String>();

	public MyCaptcha() {
		numberMap.put("one", "1");
		numberMap.put("three", "3");
	}

	public int process(String left, String operator, String right) {
		left = mappingNumber(left);
		right = mappingNumber(right);
		
		int result = 0;
		if (operator.equals("+")) {
			result = Integer.parseInt(left) + Integer.parseInt(right);
		} else if (operator.equals("-")) {
			result = Integer.parseInt(left) - Integer.parseInt(right);
		}
		return result;
	}

	public String mappingNumber(String input) {
		if (numberMap.containsKey(input)) {
			return numberMap.get(input);
		}
		return input;
	}

}
