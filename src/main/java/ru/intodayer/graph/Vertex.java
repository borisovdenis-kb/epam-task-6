package ru.intodayer.graph;

import java.util.ArrayList;
import java.util.List;


public class Vertex <T> {
    private final int id;
    private T data;
    public List<Vertex<T>> vertexes;

    public Vertex(T data, int id) {
        this.id = id;
        this.data = data;
        this.vertexes = new ArrayList<>();
    }

    public void addRelation(Vertex<T> vertex) {
        vertexes.add(vertex);
    }

    public void removeRelation(Vertex<T> vertex) {
        vertexes.remove(vertex);
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
        return "(id: " + id + "|[" + data.toString() + "])";
    }
}
