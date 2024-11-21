package org.estructurales.bridge.abstraction;

import org.estructurales.bridge.implementation.Format;

public abstract class Book {

    protected Format format;

    public Book(Format format) {
        this.format = format;
    }

    protected abstract void open();
}
