package kata.kata;

public class MyCaptcha {

	public int process(String left, String operator, String right) {
		Operation operation = null;
		if (operator.equals("+")) {
			operation = new AddOperation();
		} else if (operator.equals("-")) {
			operation = new SubOperation();
		} else if (operator.equals("*")) {
			operation = new MulOperation();
		}
		operation.leftNode = new Node(left);
		operation.rightNode = new Node(right);
		return operation.compute();
	}
}