package Behavioral.command.editor;

public class BoldCommand implements UndoableCommand {

    private String prevContent;
    private History history;
    private HtmlDocument document;

    public BoldCommand(HtmlDocument document, History history) {
        this.history = history;
        this.document = document;
    }

    @Override
    public void execute() {
        this.prevContent = document.getContent();
        this.document.makeBold();
        this.history.push(this);
    }

    @Override
    public void unexecute() {
        this.document.setContent(this.prevContent);
    }
}
