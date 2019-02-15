import java.io.*;
import java.util.*;
class Graphs{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer>[] adj=new ArrayList[10001];
        while(t!=0)
        {
        int n=sc.nextInt();
        for(int i=0;i<100;i++)
            adj[i] = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
           int a=sc.nextInt();
           int b=sc.nextInt();
           adj[a].add(b);
        }
        boolean visited[] = new boolean[100];
        for(int i=0;i<100;i++)
        visited[i]=false;
        Graphs obj=new Graphs();
        obj.bfs(1,adj,visited);
        System.out.println();
        }
    }
 
}

    public static void bfs(int s, ArrayList<Integer> adj[],boolean visited[])
    {
         Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(s);
        visited[s] = true;
        while(qu.isEmpty()!=true){
            s = qu.poll();
            System.out.print(s+" ");
            Iterator<Integer> itr = adj[s].iterator();
            while(itr.hasNext()){
                Integer x=itr.next();
                if(visited[x]!=true ){
                    visited[x]=true;
                    qu.add(x);
            }
        }
        
    }
}
}