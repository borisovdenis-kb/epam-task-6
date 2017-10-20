package ru.intodayer.graph.vertex;


public class Leaf<T> extends Vertex<T> {
    private Branch<T> parent;

    public Leaf(T data) {
        super(data);
    }

    public Branch<T> getParent() {
        return parent;
    }

    @Override
    public void addRelation(Vertex<T> vertex) {
        if (vertex.getClass() != Branch.class) {
            throw new IllegalArgumentException("Leaf can only have a parent vertex of Branch type.");
        }
        if (parent != null) {
            throw new ManyParentsException("Leaf can have only one parent.");
        }
        parent = (Branch<T>) vertex;
    }

    @Override
    public String toString() {
        return String.format("(leaf|%s)", data);
    }
}
