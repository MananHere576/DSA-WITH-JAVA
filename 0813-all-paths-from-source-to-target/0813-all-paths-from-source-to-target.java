class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        bfs(graph,ans,temp,0);
        //dfs(graph,ans,temp,0);
        return ans;
    }
    public void bfs(int[][] graph, List<List<Integer>> ans, List<Integer> temp, int start) 
    {
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(temp));
        while (!queue.isEmpty()) 
        {
            List<Integer> path = queue.poll();
            int lastNode = path.get(path.size() - 1);
            if (lastNode == graph.length - 1) 
            {
                ans.add(new ArrayList<>(path));
                continue;
            }
            for (int nextNode : graph[lastNode]) 
            {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(nextNode);
                queue.add(newPath);
            }
        }
    }




    
//    public void dfs(int[][] graph, List<List<Integer>> ans, List<Integer> temp, int start)
//    {
//         if(start == graph.length-1)
//         {
//             ans.add(new ArrayList<>(temp));
//             return;
//         }
        
//         for(int i : graph[start])
//         {
//             temp.add(i);
//             dfs(graph,ans,temp,i);
//             temp.remove(temp.size()-1);  
//         } 
//     }
}