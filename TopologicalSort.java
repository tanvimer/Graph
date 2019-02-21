class Graphs {

        public static void topo(int v,ArrayList<Integer> graph[],Stack st,boolean visited[]){
            
			visited[v]=true;
            Iterator<Integer> i= graph[v].iterator();
            while(i.hasNext()){
                Integer it=i.next();
                if(visited[it]==false)
                topo(it,graph,st,visited);
            }
            
			st.push(v);
        }
		
         public static int[] topoSort(ArrayList<Integer> graph[],int N){
		 
         boolean visited[] = new boolean[N];
         Stack<Integer> st=new Stack<Integer>();
        
		for(int i=0;i<N;i++)
			if(visited[i] == false)
				topo(i,graph,st,visited);
		 int j=0;
         int res[] = new int[N];
         while(st.empty() == false )
			res[j++] = st.pop();
         
		 return res;
         
		 }
}