package com.example.memento_pattern.TextEditorExample;


/* A text editor where the user can undo changes, such as text addition, deletion,
or formatting. The editor stores snapshots of its state (text content)
after each change, enabling the user to revert to previous states.
 */

public class TextEditor {
    private String content;

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
