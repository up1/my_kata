package kata.kata;

public class Operation {

	private Node leftNode;
	private String operator;
	private Node rightNode;

	public Operation(Node leftNode, Node rightNode, String operator) {
		this.leftNode = leftNode;
		this.operator = operator;
		this.rightNode = rightNode;
	}

	public int compute() {
		int result = 0;
		if (operator.equals("+")) {
			result = leftNode.convert() + rightNode.convert();
		} else if (operator.equals("-")) {
			result = leftNode.convert() - rightNode.convert();
		} else if (operator.equals("*")) {
			result = leftNode.convert() * rightNode.convert();
		}
		return result;
	}

}
