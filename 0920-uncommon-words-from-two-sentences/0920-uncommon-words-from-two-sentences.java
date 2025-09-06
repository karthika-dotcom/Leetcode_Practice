class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> freq = new HashMap<>();
        List<String> l = new ArrayList<>();

        // Count words in both sentences
        for (String st : s1.split(" ")) {
            freq.put(st, freq.getOrDefault(st, 0) + 1);
        }
        for (String st : s2.split(" ")) {
            freq.put(st, freq.getOrDefault(st, 0) + 1);
        }

        // Collect words that appear exactly once
        for (String word : freq.keySet()) {
            if (freq.get(word) == 1) {
                l.add(word);
            }
        }

        return l.toArray(new String[0]);
    }
}
