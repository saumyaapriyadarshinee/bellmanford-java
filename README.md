# bellmanford-java
Used to find out shortest distance from a source vertex to destination vertex
# Bellman-Ford Algorithm in Java

This is a Java implementation of the *Bellman-Ford algorithm*, which is used for finding the shortest paths from a source vertex to all other vertices in a weighted graph. The algorithm can handle graphs with negative weight edges and is useful for detecting negative weight cycles.

## Features:
- *Find Shortest Paths*: Computes the shortest paths from a single source to all other vertices.
- *Handles Negative Weights*: Unlike Dijkstra's algorithm, the Bellman-Ford algorithm can handle negative edge weights.
- *Detect Negative Weight Cycles*: The algorithm detects if there are negative weight cycles in the graph.

## Algorithm Steps:
1. Initialize the distance to the source node as 0 and all other node distances as infinity.
2. For each edge in the graph, update the distance if a shorter path is found.
3. Repeat the process for all vertices (V-1) times.
4. After the (V-1) iterations, if any edge can be relaxed again, it indicates a negative weight cycle.

