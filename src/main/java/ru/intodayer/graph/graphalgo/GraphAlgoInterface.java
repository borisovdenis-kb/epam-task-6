package ru.intodayer.graph.graphalgo;

import ru.intodayer.graph.vertex.Branch;
import java.util.function.Consumer;


public interface GraphAlgoInterface<T> {

    /**
     * Algorithm - Depth First Search.
     * Traverse the graph and apply some function to each vertex.
     * @param vertex - current vertex
     * @param function - some function that must be applied to each vertex.
     */
    void dfs(Branch<T> vertex, Consumer<Branch<T>> function);

    /**
     * Algorithm - Depth First Search.
     * Purpose of this method is to find first vertex that contains targetData
     * and return reference on it.
     * @param vertex - current vertex
     * @param targetData - wanted vertex must contain targetData
     * @return
     */
    Branch<T> dfs(Branch<T> vertex, T targetData);

    /**
     * Algorithm - breadth First Search.
     * Traverse the graph and apply some function to each vertex.
     * @param root - start vertex
     * @param function - some function that must be applied to each vertex.
     */
    void bfs(Branch<T> root, Consumer<Branch<T>> function);

    /**
     * Algorithm - breadth First Search.
     * Purpose of this method is to find first vertex that contains targetData
     * and return reference on it.
     * @param root - start vertex
     * @param targetData - wanted vertex must contain targetData
     * @return
     */
    Branch<T> bfs(Branch<T> root, T targetData);
}
