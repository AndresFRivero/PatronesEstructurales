package org.estructurales.proxy;

import org.estructurales.bridge.abstraction.Book;
import org.estructurales.bridge.abstraction.Ebook;
import org.estructurales.bridge.implementation.Format;

public class BookProxy extends Book {

    private Ebook realBook;
    private String content;
    private boolean hasAccess;

    public BookProxy(String content, Format format, boolean hasAccess) {
        super(format);
        this.content = content;
        this.hasAccess = hasAccess;
    }

    @Override
    public void open() {
        if (!hasAccess) {
            System.out.println("Access denied to this book.");
            return;
        }

        if (realBook == null) {
            realBook = new Ebook(format, content);
        }
        realBook.open();
    }
}
