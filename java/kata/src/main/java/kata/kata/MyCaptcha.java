package kata.kata;

import java.util.HashMap;

public class MyCaptcha {

	private HashMap<String, String> numberMap = new HashMap<String, String>();

	public MyCaptcha() {
		numberMap.put("one", "1");
		numberMap.put("two", "2");
		numberMap.put("three", "3");
		numberMap.put("five", "5");
	}

	public int process(String left, String operator, String right) {
		left = mappingNumber(left);
		right = mappingNumber(right);

		
		Operation operation = new Operation( left, operator, right );
		return operation.compute();
	}

	public String mappingNumber(String input) {
		if (numberMap.containsKey(input)) {
			return numberMap.get(input);
		}
		return input;
	}

}
