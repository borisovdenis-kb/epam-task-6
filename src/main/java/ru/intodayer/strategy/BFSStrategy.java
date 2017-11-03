package ru.intodayer.strategy;


import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.visitor.BFSIteratorVisitor;
import java.util.Iterator;


public class BFSStrategy<T> implements GraphSearchStrategy<T> {
    @Override
    public Iterator<Vertex<T>> getIterator(Vertex<T> head) {
        return new BFSIteratorVisitor<T>(head);
    }
}
