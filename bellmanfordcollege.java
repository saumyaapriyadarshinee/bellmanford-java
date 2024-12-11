
import java.util.Scanner;

public class bellmanfordcollege 
{
    public static void bellmanfordcollege(int[][] graph,int V, int E, int src)
    {
        int [] dist = new int [V];
        for (int i = 0; i<V; i++) 
        {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for(int i=1;i<V;i++)
        {
            for(int j=0;j<E;j++)
            {
                int u = graph[j][0];
                int v = graph[j][1];
                int weight = graph[j][2];
                if (dist [u] != Integer.MAX_VALUE&&dist [u] + weight < dist [v])
                {
                    dist[v] = dist[u]+weight;
                }
            }
        }
        for(int j=0;j<E;j++)
        {
            int u = graph[j][0];
            int v = graph[j][1];
            int weight = graph[j][2];
            if(dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
            {
                System.out.println("Graph cotains negative weight cycle");
                return;
            }
        }
        printSolution(dist,V);
    }
    public static void printSolution(int[] dist, int V)
    {
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) 
        {
            System.out.println(i + "\t\t" +dist[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();
        int[][] graph = new int[E][3];
        System.out.print("Enter the edges with sources, destination and weight: ");
        for(int i = 0;i< E;i++)
        {
            System.out.println("Edge"+(i+1)+":");
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
            graph[i][2] = sc.nextInt();
        }
        System.out.println("Enter the source vertex: ");
        int src = sc.nextInt();
        bellmanfordcollege (graph, V, E, src);
        sc.close();
    }
}
    


