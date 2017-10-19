package ru.intodayer.graph.graphalgo;

import ru.intodayer.graph.Vertex;
import java.util.function.Consumer;


public interface GraphAlgoInterface<T> {

    /**
     * Traverse the graph and apply some function to each vertex.
     * @param vertex - current vertex
     * @param function - some function that must be applied to each vertex.
     */
    void dfs(Vertex<T> vertex, Consumer<Vertex<T>> function);

    /**
     * Purpose of this method is to find first vertex that contains targetData
     * and return reference on it.
     * @param vertex - current vertex
     * @param targetData - wanted vertex must contain targetData
     * @return
     */
    Vertex<T> dfs(Vertex<T> vertex, T targetData);

    void bfs(Vertex<T> vertex);
}
