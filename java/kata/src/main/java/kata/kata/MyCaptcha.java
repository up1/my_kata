package kata.kata;


public class MyCaptcha {

	public int process(String left, String operator, String right) {
		Operation operation = new Operation(new Node(left), new Node(right), operator);
		return operation.compute();
	}
}