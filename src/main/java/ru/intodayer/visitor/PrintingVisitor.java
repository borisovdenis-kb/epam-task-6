package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;


public class PrintingVisitor<T> implements VertexVisitor<T> {
    @Override
    public void VisitVertex(Leaf<T> leaf) {
        System.out.printf("(leaf:%s)\n", leaf.getData());
    }

    @Override
    public void VisitVertex(Branch<T> branch) {
        System.out.printf("(branch:%s)\n", branch.getData());
    }
}
