package org.estructurales.bridge.implementation;

public class TextFormat implements Format {

    @Override
    public void display(String content) {
        System.out.println("Displaying as text: " + content);
    }
}
