package ru.intodayer.graph;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.visitor.IterateVisitor;

import java.util.Iterator;


public class Graph<T> implements Iterable<Vertex<T>> {
    private Vertex<T> head;

    public Graph(Branch<T> head) {
        this.head = head;
    }

    public Vertex<T> getHead() {
        return head;
    }

    @Override
    public Iterator<Vertex<T>> iterator() {
        return new IterateVisitor<T>(getHead());
    }
}
