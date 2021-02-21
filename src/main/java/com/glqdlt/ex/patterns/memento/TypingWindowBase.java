package com.glqdlt.ex.patterns.memento;

/**
 * like Original
 *
 * @author glqdlt
 */
public abstract class TypingWindowBase implements TypingWindow {

    public abstract String print();

    private String text;
    private String color;

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TypingWindow save() {
        return new TypingWindowSnapshot(this.getText(), this.getColor());
    }

    public void restore(TypingWindow snapshot) {
        if (snapshot instanceof TypingWindowSnapshot) {
            ((TypingWindowSnapshot) snapshot).invoke(this);
        }
    }

    public void typing(String color, String text) {
        setColor(color);
        setText(text);
    }

    /**
     * like Memento
     *
     * @author glqdlt
     */
    private class TypingWindowSnapshot implements TypingWindow {
        private String text;
        private String color;

        private TypingWindowSnapshot(String text, String color) {
            this.text = text;
            this.color = color;
        }

        @Override
        public String getText() {
            return text;
        }

        @Override
        public String getColor() {
            return color;
        }

        private void invoke(TypingWindowBase m) {
            m.text = this.text;
            m.color = this.color;
        }
    }

}
