package ru.intodayer.graph.vertex;

import ru.intodayer.visitor.VertexVisitor;

import java.util.ArrayList;
import java.util.List;


public class Leaf<T> extends Vertex<T> implements GraphNode<T> {
    public Leaf(T data) {
        super(data);
    }

    @Override
    public List<Vertex<T>> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public void accept(VertexVisitor<T> visitor) {
        visitor.VisitVertex(this);
    }
}
