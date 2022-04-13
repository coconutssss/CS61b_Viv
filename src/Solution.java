import org.junit.Test;

import java.util.*;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        Stack<Integer> stack = new Stack<>();
        int n = isConnected.length, cnt = 0, city, index = 0;
        boolean[] marked = new boolean[n];
        stack.push(0);
        marked[0] = true;
        A:while(true){
            city = stack.pop();
            for (int j = 0; j < n; j++) {
                if(isConnected[city][j] == 1 && !marked[j]){
                    stack.push(j);
                    marked[j] = false;
                }
            }
            if (stack.empty()){
                cnt++;
                while(marked[++index]);
                if(index < n){
                    stack.push(index);
                }else{
                    break A;
                }
            }
        }
        return  cnt;
    }
    @Test
    public void test(){
        findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
    }
}