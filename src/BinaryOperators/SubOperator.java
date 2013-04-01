package BinaryOperators;

import Nodes.BinaryOperator;
import SyntacticTree.Node;

public class SubOperator extends BinaryOperator {

    public SubOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double Evaluate() {
        return this.getLeft().Evaluate() - this.getRight().Evaluate();
    }
}
