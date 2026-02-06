class Solution {
    public String solution(String[] seoul) {
        int count = 0;
        for (String x : seoul) {
            if (x.equals("Kim")) return "김서방은 "+count+"에 있다";
            count++;
        }
        return "";
    }
}