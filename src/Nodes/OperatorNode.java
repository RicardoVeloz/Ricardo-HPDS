package Nodes;

import SyntacticTree.Node;

public abstract class OperatorNode extends Node {

    public OperatorNode() {
    }

    @Override
    public abstract double Evaluate();
}
