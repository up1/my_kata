package kata.kata;

public abstract class Operation {

	protected Node leftNode;
	protected Node rightNode;

	public Operation() {

	}

	public Operation(Node leftNode, Node rightNode) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public abstract int compute();

}
