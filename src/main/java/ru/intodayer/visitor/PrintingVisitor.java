package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;
import ru.intodayer.graph.vertex.Vertex;


public class PrintingVisitor<T> implements VertexVisitor<T> {
    @Override
    public void visitVertex(Leaf<T> leaf) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("(leaf:%s) child:[]", leaf.getData()));
        System.out.println(sb.toString());
    }

    @Override
    public void visitVertex(Branch<T> branch) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("(branch:%s) ", branch.getData()));
        sb.append("child:[");
        for (Vertex<T> child: branch.getChildren()) {
            sb.append(child.toString());
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
