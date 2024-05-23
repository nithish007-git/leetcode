package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        List<List<Integer>> result = subset(arr);
        
        // Print the result
        System.out.println(result);
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        Arrays.sort(arr);  // Sort the array to handle duplicates

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            startIndex = 0;
            // If current and the previous elements are the same, start from endIndex of previous step to avoid duplicates
            if (i > 0 && arr[i] == arr[i - 1]) {
                startIndex = endIndex + 1;
            }
            endIndex = outer.size() - 1;	
            int n = outer.size();

            for (int j = startIndex; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
