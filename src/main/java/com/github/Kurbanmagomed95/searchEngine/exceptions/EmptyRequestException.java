package com.github.Kurbanmagomed95.searchEngine.exceptions;

public class EmptyRequestException extends RuntimeException {

    public EmptyRequestException() {
        super("An empty request is set");
    }

    public EmptyRequestException(String s) {
        super(s);
    }
}
