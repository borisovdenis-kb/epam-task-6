package ru.intodayer.graph.graphalgo;

import ru.intodayer.graph.Vertex;
import java.util.ArrayList;
import java.util.List;


public class GraphSearch<T> implements GraphAlgoInterface<T> {
    private List<Vertex<T>> visited;

    public GraphSearch() {
        visited = new ArrayList<>();
    }

    @Override
    public void dfs(Vertex<T> vertex) {
        visited.add(vertex);
        System.out.println(vertex);
        for (Vertex<T> v: vertex.getVertexes()) {
            if (!visited.contains(v)) {
                dfs(v);
            }
        }
    }

    @Override
    public Vertex<T> dfs(Vertex<T> vertex, T targetData) {
        if (vertex.getData().equals(targetData)) {
            return vertex;
        }

        visited.add(vertex);
        for (Vertex<T> v: vertex.getVertexes()) {
            if (!visited.contains(v)) {
                dfs(v, targetData);
            }
        }
        return null;
    }

    @Override
    public void bfs(Vertex<T> vertex) {
        //
    }
}
