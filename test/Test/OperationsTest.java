package Test;

import BinaryOperators.AddOperator;
import BinaryOperators.DivOperator;
import BinaryOperators.SubOperator;
import SyntacticTree.CharacterNode;
import junit.framework.Assert;
import org.junit.Test;

public class OperationsTest {

    @Test
    public void Add() {
        CharacterNode aux1 = new CharacterNode(2);
        CharacterNode aux2 = new CharacterNode(5);
        AddOperator add = new AddOperator(aux1, aux2);
        Assert.assertEquals(7, add.Evaluate(), 0);
    }

    @Test
    public void AddNegative() {
        CharacterNode aux1 = new CharacterNode(-2);
        CharacterNode aux2 = new CharacterNode(-5);
        AddOperator add = new AddOperator(aux1, aux2);
        Assert.assertEquals(-7, add.Evaluate(), 0.0);
    }

    @Test
    public void Divide() {
        CharacterNode aux1 = new CharacterNode(8);
        CharacterNode aux2 = new CharacterNode(4);
        DivOperator add = new DivOperator(aux1, aux2);
        Assert.assertEquals(2, add.Evaluate(), 0);
    }

    @Test
    public void Multiply() {
        CharacterNode aux1 = new CharacterNode(8);
        CharacterNode aux2 = new CharacterNode(4);
        DivOperator add = new DivOperator(aux1, aux2);
        Assert.assertEquals(2, add.Evaluate(), 0);
    }

    @Test
    public void Substract() {
        CharacterNode aux1 = new CharacterNode(8);
        CharacterNode aux2 = new CharacterNode(4);
        SubOperator add = new SubOperator(aux1, aux2);
        Assert.assertEquals(4, add.Evaluate(), 0);
    }
}
