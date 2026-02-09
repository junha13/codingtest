class Solution {
    public String solution(String s) {
        int min=0, max=0;
        for (String x : s.split(" ")) {
            int xInt = Integer.parseInt(x);
            if(min > xInt || min==0) min = xInt;
            if(max < xInt || max==0) max = xInt;
        }
        return min + " " + max;
    }
}