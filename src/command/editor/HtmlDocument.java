package command.editor;

public class HtmlDocument {

    private String content;

    public HtmlDocument() {

    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void makeBold() {
        this.content = "<b>" + this.content + "</b>";
    }
}
