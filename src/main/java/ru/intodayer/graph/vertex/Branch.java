package ru.intodayer.graph.vertex;

import java.util.ArrayList;
import java.util.List;


public class Branch<T> extends Vertex<T> {
    private List<Vertex<T>> vertexes;

    public Branch(T data) {
        super(data);
        this.vertexes = new ArrayList<>();
    }

    public List<Vertex<T>> getVertexes() {
        return vertexes;
    }

    @Override
    public void addRelation(Vertex<T> vertex) {
        if (!vertexes.contains(vertex)) {
            vertexes.add(vertex);
        }
    }

    @Override
    public String toString() {
        return String.format("(branch|%s)", data);
    }
}
