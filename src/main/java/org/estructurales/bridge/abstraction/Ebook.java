package org.estructurales.bridge.abstraction;

import org.estructurales.bridge.implementation.Format;

public class Ebook extends Book {

    private String content;

    public Ebook(Format format, String content) {
        super(format);
        this.content = content;
    }

    @Override
    public void open() {
        format.display(content);
    }
}
