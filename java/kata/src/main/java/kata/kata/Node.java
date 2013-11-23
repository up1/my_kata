package kata.kata;

import java.util.HashMap;

public class Node {
	private HashMap<String, String> numberMap = new HashMap<String, String>();

	public void init() {
		numberMap.put("one", "1");
		numberMap.put("two", "2");
		numberMap.put("three", "3");
		numberMap.put("five", "5");
	}

	private String input;

	public Node(String input) {
		this.input = input;
		init();
	}

	public int convert() {
		if (numberMap.containsKey(input)) {
			return Integer.parseInt(numberMap.get(input));
		}
		return Integer.parseInt(input);
	}

}
