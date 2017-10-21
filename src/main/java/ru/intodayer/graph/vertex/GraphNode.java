package ru.intodayer.graph.vertex;

import java.util.List;


public interface GraphNode<T> {
    List<Vertex<T>> getChildren();
}
