public class topKFrequent {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> hs = new HashMap<Integer,Integer>();
           for(int i =0;i<nums.length;i++)
           {
                 hs.put(nums[i], hs.getOrDefault(nums[i],0)+1); 
           }  
    PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        for (Map.Entry<Integer,Integer> e: hs.entrySet()){
                pq.add(e);
            }
         int [] ans = new int[k];
    
              while (pq.size()>k){
                 pq.poll();
            }
        
            for(int i = k - 1; i >= 0; --i) {
                ans[i] = pq.poll().getKey();
            }
            return ans;
          
        }
}
