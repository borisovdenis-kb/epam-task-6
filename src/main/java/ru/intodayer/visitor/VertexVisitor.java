package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;


public interface VertexVisitor<T> {
    void VisitVertex(Leaf<T> leaf);
    void VisitVertex(Branch<T> branch);
}
