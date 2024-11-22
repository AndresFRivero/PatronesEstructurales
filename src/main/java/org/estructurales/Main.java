package org.estructurales;

import org.estructurales.bridge.implementation.AudioFormat;
import org.estructurales.bridge.implementation.TextFormat;
import org.estructurales.bridge.implementation.VideoFormat;
import org.estructurales.composite.Category;
import org.estructurales.composite.LibraryBook;
import org.estructurales.proxy.BookProxy;

public class Main {
    public static void main(String[] args) {

        // Crear libros con diferentes formatos y accesos
        BookProxy book1 = new BookProxy("Book Content 1", new TextFormat(), true);
        BookProxy book2 = new BookProxy("Book Content 2", new AudioFormat(), false);
        BookProxy book3 = new BookProxy("Book Content 3", new VideoFormat(), true);

        // Crear la jerarquía de categorías (Composite)
        Category rootCategory = new Category("Library");
        Category category1 = new Category("Fiction");
        Category category2 = new Category("Science");

        rootCategory.addComponent(category1);
        rootCategory.addComponent(category2);

        category1.addComponent(new LibraryBook("Fiction Book 1"));
        category1.addComponent(new LibraryBook("Fiction Book 2"));

        category2.addComponent(new LibraryBook("Science Book 1"));
        category2.addComponent(new LibraryBook("Science Book 2"));

        // Mostrar jerarquía de la biblioteca
        System.out.println("=== Library Structure ===");
        rootCategory.showDetails();

        // Usar Proxy y Bridge para abrir libros
        System.out.println("\n=== Accessing Books ===");
        book1.open(); // Acceso permitido
        book2.open(); // Acceso denegado
        book3.open(); // Acceso permitido
    }
}