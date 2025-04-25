import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            sb.append(String.valueOf(ch).repeat(freq));
        }

        return sb.toString();
    }
}
