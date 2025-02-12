import java.util.*;

public class HE001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        
        System.out.println("Enter elements: ");
        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // This set will track the numbers seen so far in the prefix
        Set<Integer> present = new HashSet<>();
        
        // Variable to track the current mex
        int mex = 0;

        // Result to store MEX for each prefix
        List<Integer> result = new ArrayList<>();

        // Process each element in the array
        for (int i = 0; i < n; i++) {
            // Add the current element to the set
            present.add(arr[i]);

            // Update mex: find the smallest number not present in the set
            while (present.contains(mex)) {
                mex++;
            }

            // Add the current mex to the result
            result.add(mex);
        }

        // Output the result
        for (int mexValue : result) {
            System.out.print(mexValue + " ");
        }
    }
}