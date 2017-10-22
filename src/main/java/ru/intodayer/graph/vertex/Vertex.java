package ru.intodayer.graph.vertex;

import ru.intodayer.visitor.VertexVisitor;


abstract public class Vertex<T> {
    protected T data;
    protected Branch<T> parent;

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Branch<T> getParent() {
        return parent;
    }

    public void setParent(Branch<T> parent) {
        this.parent = parent;
    }

    public abstract void accept(VertexVisitor<T> visitor);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;

        Vertex<?> vertex = (Vertex<?>) o;

        return data.equals(vertex.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
