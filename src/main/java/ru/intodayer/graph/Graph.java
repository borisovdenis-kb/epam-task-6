package ru.intodayer.graph;

import java.util.ArrayList;
import java.util.List;


public class Graph<T> implements GraphInterface<T> {
    private int lastVertexId;
    private int size;
    private List<Vertex<T>> adjList;

    public Graph() {
        this.adjList = new ArrayList<>();
    }

    private int getNewVertexId() {
        return lastVertexId++;
    }

    @Override
    public void addVertex(T data) {
        Vertex<T> newVertex = new Vertex<T>(data, getNewVertexId());
        adjList.add(newVertex);
        size++;
    }

    @Override
    public void addVertex(T data, int relationTo) {
        Vertex<T> newVertex = new Vertex<T>(data, getNewVertexId());
        adjList.get(relationTo).addRelation(lastVertexId - 1);
        adjList.add(newVertex);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vertex<T> vertex: adjList) {
            sb.append(vertex.toString() + "\n");
        }
        return sb.toString();
    }
}
