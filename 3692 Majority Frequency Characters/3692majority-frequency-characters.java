class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        Map<Integer, Set<Character>> frequencyGroups = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            frequencyGroups.putIfAbsent(freq, new HashSet<>());
            frequencyGroups.get(freq).add(entry.getKey());
        }

        int maxDistinctCount = 0;
        int bestFreq = -1;
        Set<Character> bestGroup = null;

        for (Map.Entry<Integer, Set<Character>> entry : frequencyGroups.entrySet()) {
            int freq = entry.getKey();
            Set<Character> group = entry.getValue();
            int distinctCount = group.size();

            if (distinctCount > maxDistinctCount || (distinctCount == maxDistinctCount && freq > bestFreq)) {
                maxDistinctCount = distinctCount;
                bestFreq = freq;
                bestGroup = group;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : bestGroup) {
            result.append(c);
        }

        return result.toString();
    }
}