package Nodes;

import SyntacticTree.Node;

public abstract class BinaryOperator extends OperatorNode {

    private Node left, right;

    public BinaryOperator(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public abstract double Evaluate();

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
