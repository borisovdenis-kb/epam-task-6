package ru.intodayer.graph;


public interface GraphInterface<T> {

    /**
     * Add vertex to the root. Added vertex become new root.
     * @param data - data that we want to store in the graph
     */
    void addVertex(T data);

    /**
     * Add vertex with relation to the concrete vertex.
     * @param data - data that we want to store in the graph
     * @param relationTo - id of vertex to which the added vertex must be append
     */
//    boolean addVertex(T data, int relationTo);

    /**
     * Add vertex with relation to the first found vertex that
     * contains targerData.
     * @param data - data that we want to store in the graph
     * @param targetData - data contained in vertex to which the added vertex must be append.
     * @return
     */
    boolean addVertex(T data, T targetData);

    /**
     * @return amount of vertexes in graph.
     */
    int size();
}
