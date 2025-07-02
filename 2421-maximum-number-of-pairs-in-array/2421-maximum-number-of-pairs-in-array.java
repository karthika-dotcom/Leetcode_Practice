class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int pairs = 0;
        int leftovers = 0;
        for (int count : freq.values()) {
            pairs += count / 2;
            leftovers += count % 2;
        }
        return new int[]{pairs, leftovers};
    }
}
