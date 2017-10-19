package ru.intodayer.graph.graphalgo;

import ru.intodayer.graph.Vertex;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;


public class GraphSearch<T> implements GraphAlgoInterface<T> {
    private List<Vertex<T>> visited;

    public GraphSearch() {
        visited = new ArrayList<>();
    }

    public void clearVisited() {
        visited.clear();
    }

    @Override
    public void dfs(Vertex<T> vertex, Consumer<Vertex<T>> function) {
        function.accept(vertex);
        visited.add(vertex);
        for (Vertex<T> v: vertex.getVertexes()) {
            if (!visited.contains(v)) {
                dfs(v, function);
            }
        }
    }

    @Override
    public Vertex<T> dfs(Vertex<T> vertex, T targetData) {
        List<Vertex<T>> visited = new ArrayList<>();
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

    private void addAllToQueue(List<Vertex<T>> opened, LinkedList<Vertex<T>> queue, List<Vertex<T>> vertexes) {
        for (Vertex<T> v: vertexes) {
            if (!opened.contains(v)) {
                queue.add(v);
            }
        }
    }

    @Override
    public void bfs(Vertex<T> root, Consumer<Vertex<T>> function) {
        List<Vertex<T>> opened = new ArrayList<>();
        LinkedList<Vertex<T>> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {
            Vertex<T> top = queue.removeFirst();
            function.accept(top);
            opened.add(top);
            addAllToQueue(opened, queue, top.getVertexes());
        }
    }

    @Override
    public Vertex<T> bfs(Vertex<T> root, T targetData) {
        List<Vertex<T>> opened = new ArrayList<>();
        LinkedList<Vertex<T>> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {
            Vertex<T> top = queue.removeFirst();
            if (top.getData().equals(targetData)) {
                return top;
            }
            opened.add(top);
            addAllToQueue(opened, queue, top.getVertexes());
        }
        return null;
    }
}
