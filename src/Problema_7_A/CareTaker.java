package Problema_7_A;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementoStack = new Stack<>();

    public void add(Memento stare) {
        mementoStack.push(stare);
    }

    public Memento get() {
        return mementoStack.pop();
    }

}
