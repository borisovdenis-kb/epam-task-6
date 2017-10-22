package ru.intodayer;

import ru.intodayer.graph.Graph;
import ru.intodayer.graph.vertex.Branch;
import ru.intodayer.graph.vertex.Leaf;
import ru.intodayer.graph.vertex.Vertex;
import ru.intodayer.visitor.PrintingVisitor;
import java.util.Arrays;


public class WorkDemonstration {
    public static void demonstrate() {
        testGraphDFS();
    }

    private static void testGraphDFS() {
        Leaf<String> leafKotlin = new Leaf<>("Kotlin");
        Branch<String> branchJava = new Branch<>("Java", Arrays.asList(leafKotlin));

        Leaf<String> leafPython = new Leaf<>("Python");
        Branch<String> branchCpp = new Branch<>("C++", Arrays.asList(leafPython, branchJava));

        leafKotlin.setParent(branchJava);
        leafPython.setParent(branchCpp);
        branchJava.setParent(branchCpp);

        Graph<String> graph = new Graph<>(branchCpp);

        for (Vertex<String> vertex: graph) {
            vertex.accept(new PrintingVisitor<>());
        }

    }
}
