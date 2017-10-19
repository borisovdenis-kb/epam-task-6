package ru.intodayer;

import ru.intodayer.graph.Graph;
import ru.intodayer.graph.graphalgo.GraphSearch;


public class WorkDemonstration {
    public static void demonstrate() {
        testGraphDFS();
        testGraphBFS();
    }

    private static void testGraphDFS() {
        Graph<String> graph = new Graph<>();
        graph.addVertex("Java");
        graph.addVertex("C++", "Java");
        graph.addVertex("Kotlin", "Java");
        graph.addVertex("Python", "Kotlin");

        System.out.println("Test DFS:");

        System.out.println("Test: print all vertexes");
        GraphSearch<String> graphSearch = new GraphSearch<>();
        graphSearch.dfs(graph.getHead(), System.out::println);

        System.out.println("Test: change data of all vertexes to BASIC");
        graphSearch.clearVisited();
        graphSearch.dfs(graph.getHead(), (v) -> v.setData("BASIC"));
        graphSearch.clearVisited();
        graphSearch.dfs(graph.getHead(), System.out::println);

        System.out.println();
    }

    private static void testGraphBFS() {
        Graph<String> graph = new Graph<>();
        graph.addVertex("1");
        graph.addVertex("2", "1");
        graph.addVertex("3", "1");
        graph.addVertex("4", "3");

        System.out.println("Test BFS:");

        System.out.println("Test: print all vertexes");
        GraphSearch<String> graphSearch = new GraphSearch<>();
        graphSearch.bfs(graph.getHead(), System.out::println);

        System.out.println("Test: change data of all vertexes to 777");
        graphSearch.bfs(graph.getHead(), (v) -> v.setData("777"));
        graphSearch.bfs(graph.getHead(), System.out::println);

        System.out.println();
    }
}
