package com.glqdlt.ex.patterns.memento;

import org.junit.Assert;
import org.junit.Test;

public class TextEditorTest {
    @Test
    public void restore() {

        DefaultTypingWindow defaultTypingWindow = new DefaultTypingWindow();

        TextEditor textEditor = new TextEditor(defaultTypingWindow);
        defaultTypingWindow.typing("red", "1");
        textEditor.echo();
        textEditor.save();

        defaultTypingWindow.typing("green", "2");
        textEditor.echo();
        textEditor.save();

        defaultTypingWindow.typing("blue", "3");
        textEditor.echo();

        textEditor.restore();
        textEditor.echo();

        textEditor.restore();
        textEditor.echo();

        Assert.assertEquals("[red]1", defaultTypingWindow.print());

    }
}