package ru.intodayer.strategy;

import ru.intodayer.graph.vertex.Vertex;
import java.util.Iterator;


public interface GraphSearchStrategy<T> {
    Iterator<Vertex<T>> getIterator(Vertex<T> head);
}
