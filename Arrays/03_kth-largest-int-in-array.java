//bruteforce
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
     Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length(); 
            }
            return b.compareTo(a); 
        });

        return nums[k - 1];
    }
}
//better approach
public class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // Step 1: Convert strings to integers
        List<Integer> numberList = new ArrayList<>();
        for (String s : nums) {
            numberList.add(Integer.parseInt(s));
        }

        // Step 2: Sort the list in ascending order
        Collections.sort(numberList);

        // Step 3: Get the k-th largest element
        int kthLargest = numberList.get(numberList.size() - k);

        // Step 4: Convert the result to string
        return String.valueOf(kthLargest);
    }
