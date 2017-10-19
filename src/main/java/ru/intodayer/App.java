package ru.intodayer;

import ru.intodayer.graph.Graph;
import ru.intodayer.graph.graphalgo.GraphSearch;


public class App {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addVertex("Java");
        graph.addVertex("C++", "Java");
        graph.addVertex("Kotlin", "Java");
        graph.addVertex("Python", "Kotlin");

        GraphSearch<String> graphSearch = new GraphSearch<>();
        graphSearch.dfs(graph.getHead(), System.out::println);

        graphSearch.clearVisited();
        graphSearch.dfs(graph.getHead(), (v) -> v.setData("Python"));
        graphSearch.clearVisited();
        graphSearch.dfs(graph.getHead(), System.out::println);
    }
}
