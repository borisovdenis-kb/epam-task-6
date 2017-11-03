package ru.intodayer.graph;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.strategy.GraphSearchStrategy;
import ru.intodayer.visitor.BFSIteratorVisitor;
import java.util.Iterator;


public class Graph<T> implements Iterable<Vertex<T>> {
    private Vertex<T> head;
    private Iterator<Vertex<T>> iterator;
    private GraphSearchStrategy<T> strategy;

    public Graph(Branch<T> head) {
        this.head = head;
        this.iterator = new BFSIteratorVisitor<>(getHead());
    }

    public Vertex<T> getHead() {
        return head;
    }

    public void setStrategy(GraphSearchStrategy<T> strategy) {
        this.strategy = strategy;
    }

    @Override
    public Iterator<Vertex<T>> iterator() {
        return strategy.getIterator(this.head);
    }
}
