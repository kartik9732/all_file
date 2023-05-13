

//User function Template for Java

class Solution
{
    public List<Integer> topo(int N, ArrayList<ArrayList<Integer>> adj)
    {
        
        int []indegree=new int [N];
        for (int i=0;i<N;i++){
            for (int it:adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q=new LinkedList<>();
        for (int i=0;i<N;i++){
            if (indegree[i]==0) q.add(i);
        }
        
        
        List<Integer> ans=new ArrayList<>();
        while (!q.isEmpty()){
            int node=q.remove();
            ans.add(node);
            for (int it:adj.get(node)){
                indegree[it]--;
                if (indegree[it]==0) q.add(it);
            }
            
        }
        
       return ans;
    }
    
    public String findOrder(String [] dict, int N, int K)
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for (int i=0;i<K;i++){
            adj.add(new ArrayList<>());
        }
        
        for (int i=0;i<N-1;i++){
            String s1=dict[i];
            String s2=dict[i+1];
            int len=Math.min(s1.length(),s2.length());
            for (int it=0;it<len;it++){
                if (s1.charAt(it)!=s2.charAt(it)){
                    adj.get(s1.charAt(it)-'a').add(s2.charAt(it)-'a');
                    break;
                }
            }
        }
        
        List<Integer> list=topo(K,adj);
        String ans="";
        for (int it:list) ans=ans+(char)(it+(int)'a');
         return ans;
    }
}