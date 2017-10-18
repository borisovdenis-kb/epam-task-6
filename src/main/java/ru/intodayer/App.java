package ru.intodayer;

import ru.intodayer.graph.Graph;


public class App {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addVertex("Leha");
        graph.addVertex("Denis", 0);
        graph.addVertex("Vika", 0);
        graph.addVertex("Natasha", 1);

        System.out.println(graph);
    }
}
