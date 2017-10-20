package ru.intodayer.graph.vertex;

import java.util.ArrayList;
import java.util.List;


public class Branch<T> {
    private int id;
    private T data;
    private List<Branch<T>> vertexes;

    public Branch() {
    }

    public Branch(T data, int vertexId) {
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

    public List<Branch<T>> getVertexes() {
        return vertexes;
    }

    public void addRelation(Branch<T> vertex) {
        if (!vertexes.contains(vertex)) {
            vertexes.add(vertex);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch<?> vertex = (Branch<?>) o;

        return id == vertex.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        String res = "(id:%s|%s)";
        return String.format(res, id, data);
    }
}
