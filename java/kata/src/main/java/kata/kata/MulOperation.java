package kata.kata;

public class MulOperation extends Operation {
	public int compute() {
		return leftNode.convert() * rightNode.convert();
	}
}
