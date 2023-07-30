
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KFrequentElement {
    // time complexity: O(nlogk)
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int i : nums) {    
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int i : map.keySet()) {
            pq.add(i);
        }
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll(); // ? poll
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 , 4, 4, 4};
        int k = 3;
        int[] res = topKFrequent(nums, k);
        for (int i : res) {
            System.out.println(i);
        }

    }

}
