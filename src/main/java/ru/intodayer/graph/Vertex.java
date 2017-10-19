package ru.intodayer.graph;

import java.util.ArrayList;
import java.util.List;


public class Vertex <T> {
    private int id;
    private T data;
    private List<Vertex<T>> vertexes;

    public Vertex() {
    }

    public Vertex(T data, int vertexId) {
        this.id = vertexId;
        this.data = data;
        this.vertexes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Vertex<T>> getVertexes() {
        return vertexes;
    }

    public void addRelation(Vertex<T> vertex) {
        if (!vertexes.contains(vertex)) {
            vertexes.add(vertex);
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
        String res = "(id:%s|[%s])";
        return String.format(res, id, data);
    }
}
