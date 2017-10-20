package ru.intodayer.graph;

import ru.intodayer.graph.graphalgo.GraphSearch;
import ru.intodayer.graph.vertex.Branch;


public class Graph<T> implements GraphInterface<T> {
    private int currentVertexId;
    private int size;
    private Branch<T> head;

    public Branch<T> getHead() {
        return head;
    }

    private int getNewVertexId() {
        return currentVertexId++;
    }

    @Override
    public void addVertex(T data) {
        Branch<T> newHead = new Branch<T>(data, getNewVertexId());
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
        Branch<T> target = graphSearch.dfs(getHead(), targetData);
        if (target == null) {
            return false;
        }
        Branch<T> newVertex = new Branch<T>(data, getNewVertexId());
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
