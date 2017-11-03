package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;


public interface VertexVisitor<T> {
    void visitVertex(Leaf<T> leaf);
    void visitVertex(Branch<T> branch);
}
