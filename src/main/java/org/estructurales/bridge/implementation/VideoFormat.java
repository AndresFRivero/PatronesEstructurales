package org.estructurales.bridge.implementation;

public class VideoFormat implements Format {
    @Override
    public void display(String content) {
        System.out.println("Playing as video: " + content);
    }
}
