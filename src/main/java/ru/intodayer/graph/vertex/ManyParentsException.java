package ru.intodayer.graph.vertex;


public class ManyParentsException extends RuntimeException {
    public ManyParentsException(String message) {
        super(message);
    }
}
