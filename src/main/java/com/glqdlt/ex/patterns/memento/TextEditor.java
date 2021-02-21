package com.glqdlt.ex.patterns.memento;

import java.util.Stack;

/**
 * like CareTaker
 * @author glqdlt
 */
public class TextEditor {

    private Stack<TypingWindow> restoreStack = new Stack<>();
    private TypingWindowBase typingWindowBase;

    public TextEditor(TypingWindowBase typingWindowBase) {
        this.typingWindowBase = typingWindowBase;
    }

    public void save() {
        restoreStack.push(typingWindowBase.save());
    }

    public void restore() {
        System.out.println("restored..");
        typingWindowBase.restore(restoreStack.pop());
    }

    public void echo() {
        System.out.println(typingWindowBase.print());
    }
}
