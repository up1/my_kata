package kata.kata;

public class AddOperation extends Operation {
	public int compute() {
		return leftNode.convert() + rightNode.convert();
	}
}
