package ru.intodayer.graph;


public interface GraphInterface <T> {
    void addVertex(Vertex<T> vertex);
    void removeVertex(int vertexIndex);
    void removeVertex(Vertex<T> vertex);
    int size();
}
