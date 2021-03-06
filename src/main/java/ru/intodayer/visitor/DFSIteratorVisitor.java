package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;
import ru.intodayer.graph.vertex.Vertex;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class DFSIteratorVisitor<T> implements VertexVisitor<T>, Iterator<Vertex<T>> {
    private Set<Vertex<T>> visited = new HashSet<>();
    private Vertex<T> currentElement;

    public DFSIteratorVisitor(Vertex<T> head) {
        this.currentElement = head;
    }

    @Override
    public void visitVertex(Leaf<T> leaf) {
        if (!visited.contains(leaf)) {
            currentElement = leaf;
            visited.add(leaf);
            return;
        }
        if (leaf.getParent() != null && !visited.contains(leaf.getParent())) {
            leaf.getParent().accept(this);
            return;
        }
        currentElement = null;
    }

    @Override
    public void visitVertex(Branch<T> branch) {
        for (Vertex<T> tVertex : branch.getChildren()) {
            if (!visited.contains(tVertex)) {
                tVertex.accept(this);
                return;
            }
        }
        if (!visited.contains(branch)) {
            currentElement = branch;
            visited.add(branch);
            return;
        }
        if (branch.getParent() != null && !visited.contains(branch.getParent())) {
            branch.getParent().accept(this);
        }
        currentElement = null;
    }

    @Override
    public boolean hasNext() {
        return currentElement != null;
    }

    @Override
    public Vertex<T> next() {
        Vertex<T> tmp = currentElement;
        currentElement.accept(this);
        return tmp;
    }
}
