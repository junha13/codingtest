class Solution {
    public boolean solution(int x) {
        String xStr = String.valueOf(x);  // String.valueOf -> String 형변환
        String[] xArray = xStr.split("");
        int sumValue = 0;
        for (String s : xArray) {
            sumValue += Integer.parseInt(s);
        }
        return x % sumValue == 0;
    }
}