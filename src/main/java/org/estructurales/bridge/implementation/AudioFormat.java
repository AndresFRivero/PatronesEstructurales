package org.estructurales.bridge.implementation;

public class AudioFormat implements Format {

    @Override
    public void display(String content) {
        System.out.println("Playing as audio: " + content);
    }
}
