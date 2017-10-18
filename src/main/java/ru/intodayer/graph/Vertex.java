package ru.intodayer.graph;

import java.util.ArrayList;
import java.util.List;


public class Vertex <T> {
    private final int id;
    private T data;
    private List<Integer> vertexes;

    public Vertex(T data, int id) {
        this.id = id;
        this.data = data;
        this.vertexes = new ArrayList<>();
    }

    public List<Integer> getVertexes() {
        return vertexes;
    }

    public void addRelation(int vertexId) {
        if (!vertexes.contains(vertexId)) {
            vertexes.add(vertexId);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex<?> vertex = (Vertex<?>) o;

        return id == vertex.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(id: " + id + "|[" + data.toString() + "])");
        for (int vertexId: vertexes) {
            sb.append("[" + vertexId + "]");
        }
        return sb.toString();
    }
}
