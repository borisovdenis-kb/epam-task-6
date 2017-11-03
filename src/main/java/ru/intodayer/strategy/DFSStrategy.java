package ru.intodayer.strategy;

import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.visitor.DFSIteratorVisitor;
import java.util.Iterator;


public class DFSStrategy<T> implements GraphSearchStrategy<T> {
    @Override
    public Iterator<Vertex<T>> getIterator(Vertex<T> head) {
        return new DFSIteratorVisitor<T>(head);
    }
}
