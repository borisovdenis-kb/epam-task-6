package ru.intodayer.graph.vertex;


abstract public class Vertex<T> {
    protected T data;

    public Vertex(T data) {
        this.data = data;
    }

    public abstract void addRelation(Vertex<T> vertex);

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

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
