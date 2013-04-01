package BinaryOperators;

import Nodes.BinaryOperator;
import SyntacticTree.Node;

public class MultOperator extends BinaryOperator {

    public MultOperator(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double Evaluate() {
        return this.getLeft().Evaluate() * this.getRight().Evaluate();
    }
}
