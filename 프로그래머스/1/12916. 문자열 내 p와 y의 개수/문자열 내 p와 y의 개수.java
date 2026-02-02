class Solution {
    boolean solution(String s) {
        int pCount = 0, yCount = 0;
        for (char x : s.toLowerCase().toCharArray()) {
            if (x == 'p') pCount++;
            if (x == 'y') yCount++;
        }
        return pCount == yCount;
    }
}