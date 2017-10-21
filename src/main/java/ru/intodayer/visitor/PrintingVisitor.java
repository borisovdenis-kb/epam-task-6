package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;


public class PrintingVisitor<T> implements VertexVisitor<T> {
    @Override
    public void VisitLeaf(Leaf<T> leaf) {
        System.out.println("(leaf:" + leaf.getData());
    }

    @Override
    public void VisitBranch(Branch<T> branch) {
        System.out.println("(branch:" + branch.getData());
    }
}
