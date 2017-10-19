package ru.intodayer.graph.graphalgo;

import ru.intodayer.graph.Vertex;
import java.util.ArrayList;
import java.util.LinkedList;
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
        LinkedList<Vertex<T>> stack = new LinkedList<>();
        stack.add(vertex);

        while (stack.size() != 0) {
            Vertex<T> top = stack.removeLast();

            if (top.getData().equals(targetData)) {
                return top;
            }

            if (!visited.contains(top)) {
                visited.add(top);
                stack.addAll(top.getVertexes());
            }
        }
        return null;
    }

    @Override
    public void bfs(Vertex<T> vertex) {
        //
    }
}
