package ru.intodayer.visitor;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;
import ru.intodayer.graph.vertex.Vertex;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class BFSIteratorVisitor<T> implements VertexVisitor<T>, Iterator<Vertex<T>> {
    private HashSet<Vertex<T>> opened = new HashSet<>();
    private LinkedList<Vertex<T>> queue = new LinkedList<>();
    private Vertex<T> currentElement;

    public BFSIteratorVisitor(Vertex<T> head) {
        this.currentElement = head;
        this.queue.add(head);
    }

    private void addAllToQueue(List<Vertex<T>> children) {
        for (Vertex<T> v: children) {
            if (!opened.contains(v) && !queue.contains(v)) {
                queue.add(v);
            }
        }
    }

    @Override
    public void VisitVertex(Leaf<T> leaf) {
        opened.add(leaf);
    }

    @Override
    public void VisitVertex(Branch<T> branch) {
        opened.add(branch);
        addAllToQueue(branch.getChildren());
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Vertex<T> next() {
        currentElement = queue.removeFirst();
        currentElement.accept(this);
        return currentElement;
    }
}
