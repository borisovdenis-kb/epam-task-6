package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;


public interface VertexVisitor<T> {
    void VisitLeaf(Leaf<T> leaf);
    void VisitBranch(Branch<T> branch);
}
