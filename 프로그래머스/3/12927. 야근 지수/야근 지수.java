import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> worksQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : works) worksQueue.offer(x);
        long result = 0;

        while (n != 0) {
            if(worksQueue.peek()==0) return 0;
            worksQueue = work2(worksQueue);
            n--;
        }
        for (int x : worksQueue) result += (long) x*x;
        return result;
    }

    private int[] work(int[] works) { // 너무 시간이 오래걸림
        Arrays.sort(works);
        if(works[works.length -1] == 0) return works;
        works[works.length -1] -= 1;
        return works;
    }

    private PriorityQueue<Integer> work2(PriorityQueue<Integer> worksQueue) {
        worksQueue.offer(worksQueue.poll() - 1);
        // worksQueue.remove(); // 첫 번째 값 제거
        return worksQueue;
    }
}