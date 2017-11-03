package ru.intodayer;

import ru.intodayer.graph.Graph;
import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;
import ru.intodayer.graph.vertex.Printable;
import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.strategy.BFSStrategy;
import ru.intodayer.strategy.DFSStrategy;
import ru.intodayer.visitor.BFSIteratorVisitor;
import ru.intodayer.visitor.DFSIteratorVisitor;
import ru.intodayer.visitor.PrintingVisitor;
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
        System.out.println("Printing using method print().");
        for (Printable vertex: graph) {
            vertex.print();
        }
        System.out.println("\nPrinting using PrintingVisitor.");
        PrintingVisitor<T> pv = new PrintingVisitor<>();
        for (Vertex vertex: graph) {
            vertex.accept(pv);
        }
    }

    private static void testGraphDFS() {
        Graph<String> graph = createGraph();
        graph.setStrategy(new DFSStrategy<>());
        printAllVertexes(graph);
    }

    private static void testGraphBFS() {
        Graph<String> graph = createGraph();
        graph.setStrategy(new BFSStrategy<>());
        printAllVertexes(graph);
    }
}
