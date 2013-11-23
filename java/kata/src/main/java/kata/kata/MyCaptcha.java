package kata.kata;


public class MyCaptcha {

	public int process(String left, String operator, String right) {
		Node leftNode = new Node(left);
		Node rightNode = new Node(right);

		Operation operation = new Operation(leftNode, rightNode, operator);
		return operation.compute();
	}
}