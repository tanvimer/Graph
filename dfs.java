import java.io.*;
import java.util.*;
 class Graphs{
	 private static int V;
     private static LinkedList<Integer> adj[];
    Graphs(int v)
    {
        V = v;
        adj = new LinkedList[100];
        for (int i=0; i<100; ++i)
            adj[i] = new LinkedList<Integer>();
    }
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
			boolean[] visited = new boolean[10001];
			for(int i=0;i<100;i++)
				visited[i]=false;
			int n = sc.nextInt();
			Graphs d = new Graphs(n);
			for(int i = 0; i < n ; i++)
				addEdge(sc.nextInt(),sc.nextInt());
			Graphs g = new Graphs();
			g.DFS(1,adj,visited);
			System.out.println();
		}
    }
	 public static void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
   
    public void DFS(int v,LinkedList<Integer> adj[],boolean visited[])
    {
      visited[v] = true;
      System.out.print(v+" ");
      Iterator<Integer> itr = adj[v].iterator();
      while(itr.hasNext()){
          int x = itr.next();
          if(!visited[x])
          DFS(x,adj,visited);
      }
    }
}