class Solution {
    public String solution(int n) {
        String answer = "수박";
        if(n==1) return "수";
        if (n%2!=0) answer = answer.repeat(n/2) + "수";
        if (n%2==0) answer = answer.repeat(n/2);
        return answer;
    }
}