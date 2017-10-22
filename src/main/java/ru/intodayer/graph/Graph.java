package ru.intodayer.graph;

import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.visitor.BFSIteratorVisitor;
import ru.intodayer.visitor.PrintingVisitor;
import java.util.Iterator;


public class Graph<T> implements Iterable<Vertex<T>> {
    private Vertex<T> head;
    private Iterator<Vertex<T>> iterator;
    private PrintingVisitor<T> printingVisitor = new PrintingVisitor<>();

    public Graph(Branch<T> head) {
        this.head = head;
        this.iterator = new BFSIteratorVisitor<>(getHead());
        setPrintingVisitorToAllVertex(printingVisitor);
    }

    private void setPrintingVisitorToAllVertex(PrintingVisitor<T> pv) {
        for (Vertex<T> v: this) {
            v.setPrintingVisitor(pv);
        }
    }

    public Vertex<T> getHead() {
        return head;
    }

    public void setIterator(Iterator<Vertex<T>> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<Vertex<T>> iterator() {
        return iterator;
    }
}
