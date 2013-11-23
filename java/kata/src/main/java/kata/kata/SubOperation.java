package kata.kata;

public class SubOperation extends Operation {
	public int compute() {
		return leftNode.convert() - rightNode.convert();
	}
}
