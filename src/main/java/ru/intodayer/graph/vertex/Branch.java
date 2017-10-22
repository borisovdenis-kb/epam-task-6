package ru.intodayer.graph.vertex;

import ru.intodayer.visitor.VertexVisitor;
import java.util.List;


public class Branch<T> extends Vertex<T> implements GraphNode<T> {
    private List<Vertex<T>> children;

    public Branch(T data, List<Vertex<T>> children) {
        super(data);
        this.children = children;
    }

    @Override
    public List<Vertex<T>> getChildren() {
        return children;
    }

    public void accept(VertexVisitor<T> visitor) {
        visitor.VisitVertex(this);
    }
}
