package com.github.Kurbanmagomed95.searchEngine.exceptions;

public class IndexingIsNotRunningException extends RuntimeException {

    public IndexingIsNotRunningException() {
        super("Indexing is not running");
    }

    public IndexingIsNotRunningException(String s) {
        super(s);
    }
}
