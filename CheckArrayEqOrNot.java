import java.util.HashMap;

public class CheckArrayEqOrNot {
    public static boolean check(long[] A, long[] B, int N) {
        // Create a HashMap to store the frequency of elements in A[] as key-value pairs here Long is the key and Integer is the frequency
        HashMap<Long, Integer> frequencyMap = new HashMap<>();

        // Count frequency of elements in A[]
        for (int i = 0; i < N; i++) {
            long num = A[i];
            // Retrieve the current frequency of num from the frequencyMap using
            // getOrDefault()
            // If num is not present, the default value 0 is returned
            // Increment the frequency by 1 and update the value in the frequencyMap using
            // put()
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if elements in B[] are equal to elements in A[]
        for (int i = 0; i < N; i++) {
            long num = B[i];
            // Check if num is not present in the frequencyMap or its frequency is 0
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                // If either condition is true, it means the arrays are not equal
                // Return false immediately
                return false;
            }
            // Decrement the frequency of num in the frequencyMap to indicate that we have
            // encountered one occurrence in B[]
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        // Check if all elements in B[] have been processed
        // Iterate over the frequencies of elements in the frequencyMap
        for (int frequency : frequencyMap.values()) {
            // If any frequency is non-zero, it means an element in A[] is not present in
            // B[] or the count is different
            if (frequency != 0) {
                // Return false immediately
                return false;
            }
        }

        // If all frequencies are zero, it means all elements in B[] are accounted for
        // in A[]
        // Return true to indicate that the arrays are equal
        return true;
    }


    public static void main(String[] args) {
        long[] A = { 1, 2, 5, 4, 0 };
        long[] B = { 2, 4, 5, 0, 4 };
        int N = A.length;

        if (check(A, B, N)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }
}
