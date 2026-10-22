class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));
        int arr[] = new int[k];
        for(int i = 0; i< k;i++){
            // arr[i] = list.get(i);
            arr[i] = pq.poll();
        }
        // System.out.println(pq);
        return arr;
    }
}
