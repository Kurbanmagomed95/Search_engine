package com.github.Kurbanmagomed95.searchEngine.exceptions;

public class IndexingIsRunningException extends RuntimeException {

    public IndexingIsRunningException() {
        super("Indexing is already running");
    }

    public IndexingIsRunningException(String s) {
        super(s);
    }
}
