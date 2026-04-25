class Solution {
    public int evenSumSubgraphs(int[] nums, int[][] edges) {
        int n= nums.length;
        int[] adj= new int[n];
        for(int[] e : edges){
            adj[e[0]] |= (1<< e[1]);
            adj[e[1]] |= (1<< e[0]);
        }

        int[] f= nums;

        int count=0;
        for(int mask=1;mask<(1<<n); mask++){
            int sum=0;
            for(int i=0;i<n;i++){
                if((mask& (1<<i))!=0){
                    sum= sum+f[i];
                }
            }
            if((sum&1)==1) continue;

            if(isConnected(mask,adj)){
                count++;
            }
        }
        return count;
    }

    private boolean isConnected(int mask, int[] adj) {
        int visited = 0;

        int start = Integer.numberOfTrailingZeros(mask);
        visited |= (1 << start);

        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < adj.length; i++) {
                if ((visited & (1 << i)) != 0) {
                    int neighbors = adj[i] & mask;
                    int newVisited = visited | neighbors;

                    if (newVisited != visited) {
                        visited = newVisited;
                        changed = true;
                    }
                }
            }
        }

        return visited == mask;
    }
}