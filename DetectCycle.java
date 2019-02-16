import java.io.*;
import java.util.*;
class Graph{
	boolean[] visited = new boolean[12345];
    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int v = in.nextInt();
			int e = in.nextInt();
			LinkedList<Integer>[] alist = new LinkedList[v];
			for(int i=0;i<v;i++) 
			alist[i] = new LinkedList<Integer>();
			while(e!=0) {
				int n1 = in.nextInt();
				int n2 = in.nextInt();
				alist[n1].add(n2);
				alist[n2].add(n1);
				e--;
			}
			Graph g = new Graph();
			if(g.isCyclic(v,alist)) {
				System.out.println(1);
			}
			else
				System.out.println(0);
		}
    }

    
    Boolean Cycle(int i,LinkedList<Integer>[] alist,int parent){
        visited[i] = true;
        Iterator<Integer> itr = alist[i].iterator();
        while(itr.hasNext()){
            Integer x = itr.next();
            if(visited[x] == false){
            if(Cycle(x,alist,i)){
            return true;
            }
            }
            else if(x!=parent)
            return true;
        }
        return false;
        
    }
    Boolean isCyclic(int V,LinkedList<Integer>[] alist)
    {
        
        for(int i = 0;i < V;i++)
            if(visited[i] == false)
            if(Cycle(i,alist,-1))
            return true;
            
             return false;
            
        }
	}
    
