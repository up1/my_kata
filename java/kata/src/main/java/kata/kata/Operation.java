package kata.kata;

public class Operation {

	private String left;
	private String operator;
	private String right;

	public Operation(String left, String operator, String right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}

	public int compute() {
		int result = 0;
		if (operator.equals("+")) {
			result = Integer.parseInt(left) + Integer.parseInt(right);
		} else if (operator.equals("-")) {
			result = Integer.parseInt(left) - Integer.parseInt(right);
		} else if (operator.equals("*")) {
			result = Integer.parseInt(left) * Integer.parseInt(right);
		}
		return result;
	}

}
