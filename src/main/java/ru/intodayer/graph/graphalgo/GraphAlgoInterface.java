package ru.intodayer.graph.graphalgo;

import ru.intodayer.graph.Vertex;


public interface GraphAlgoInterface<T> {
    void dfs(Vertex<T> vertex);

    Vertex<T> dfs(Vertex<T> vertex, T targetData);

    void bfs(Vertex<T> vertex);
}
