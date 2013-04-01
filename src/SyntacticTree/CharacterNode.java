package SyntacticTree;

public class CharacterNode extends Node {

    private double evaluate;

    public CharacterNode(double evaluate) {
        this.evaluate = evaluate;
    }

    @Override
    public double Evaluate() {
        return this.evaluate;
    }
}
