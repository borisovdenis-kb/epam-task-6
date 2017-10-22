package ru.intodayer;

import ru.intodayer.graph.Graph;
import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;
import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.visitor.BFSIteratorVisitor;
import ru.intodayer.visitor.DFSIteratorVisitor;
import java.util.Arrays;


public class WorkDemonstration {
    public static void demonstrate() {
        System.out.println("Test BFS:");
        testGraphDFS();
        System.out.println("\nTest BFS:");
        testGraphBFS();
    }

    private static Graph<String> createGraph() {
        Leaf<String> leafKotlin = new Leaf<>("Kotlin");
        Branch<String> branchJava = new Branch<>("Java", Arrays.asList(leafKotlin));

        Leaf<String> leafPython = new Leaf<>("Python");
        Branch<String> branchCpp = new Branch<>("C++", Arrays.asList(leafPython, branchJava));

        leafKotlin.setParent(branchJava);
        leafPython.setParent(branchCpp);
        branchJava.setParent(branchCpp);

        return new Graph<>(branchCpp);
    }

    private static <T> void printAllVertexes(Graph<T> graph) {
        for (Vertex<T> vertex: graph) {
            vertex.print();
        }
    }

    private static void testGraphDFS() {
        Graph<String> graph = createGraph();
        graph.setIterator(new DFSIteratorVisitor<>(graph.getHead()));
        printAllVertexes(graph);
    }

    private static void testGraphBFS() {
        Graph<String> graph = createGraph();
        graph.setIterator(new BFSIteratorVisitor<>(graph.getHead()));
        printAllVertexes(graph);
    }
}
