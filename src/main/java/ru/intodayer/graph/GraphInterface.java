package ru.intodayer.graph;


public interface GraphInterface<T> {

    /**
     * Add vertex without relation.
     * For example first vertex cant have a relation.
     * @param data - data that we want to store in the graph
     */
    void addVertex(T data);

    /**
     * Add vertex with relation.
     * @param data - data that we want to store in the graph
     * @param relationTo - id of vertex to which the added vertex must be append
     */
    void addVertex(T data, int relationTo);

    /**
     * @return amount of vertex in graph.
     */
    int size();
}
