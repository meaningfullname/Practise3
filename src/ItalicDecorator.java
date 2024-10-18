class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextEditor editor) {
        super(editor);
    }

    public String write() {
        return "<i>" + super.write() + "</i>";
    }
}