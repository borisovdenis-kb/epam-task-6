package ru.intodayer.graph;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Vertex;
import java.util.Iterator;


public class Graph<T> implements Iterable<Vertex<T>> {
    private Vertex<T> head;
    private Iterator<Vertex<T>> iterator;

    public Graph(Branch<T> head) {
        this.head = head;
    }

    public Vertex<T> getHead() {
        return head;
    }

    public void setIterator(Iterator<Vertex<T>> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<Vertex<T>> iterator() {
        return iterator;
    }
}
