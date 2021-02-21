package com.glqdlt.ex.patterns.memento;

/**
 * @author glqdlt
 */
public class DefaultTypingWindow extends TypingWindowBase {
    @Override
    public String print() {
        return String.format("[%s]%s", getColor(), getText());
    }
}
