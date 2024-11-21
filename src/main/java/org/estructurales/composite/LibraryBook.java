package org.estructurales.composite;

public class LibraryBook implements LibraryComponent {

    private String title;

    public LibraryBook(String title) {
        this.title = title;
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + title);
    }
}
