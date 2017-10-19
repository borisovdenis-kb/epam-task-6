package ru.intodayer.graph;


import ru.intodayer.graph.graphalgo.GraphSearch;

public class Graph<T> implements GraphInterface<T> {
    private int currentVertexId;
    private int size;
    private Vertex<T> head;

    public Vertex<T> getHead() {
        return head;
    }

    private int getNewVertexId() {
        return currentVertexId++;
    }

    @Override
    public void addVertex(T data) {
        Vertex<T> newHead = new Vertex<T>(data, getNewVertexId());
        if (head == null) {
            head = newHead;
            return;
        }
        newHead.addRelation(head);
        head.addRelation(newHead);
        head = newHead;
    }

    @Override
    public boolean addVertex(T data, T targetData) {
        GraphSearch<T> graphSearch = new GraphSearch<T>();
        Vertex<T> target = graphSearch.dfs(getHead(), targetData);
        if (target == null) {
            return false;
        }
        Vertex<T> newVertex = new Vertex<T>(data, getNewVertexId());
        target.addRelation(newVertex);
        newVertex.addRelation(target);

        return true;
    }

    @Override
    public int size() {
        return size;
    }

//    @Override
//    public String toString() {
//
//    }
}
