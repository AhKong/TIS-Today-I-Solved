/*
* 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
* */
public class Solution {
    public int  solution(int[] common) {
        int x = common[1]-common[0];
        int y = common[2]-common[1];
        if(x==y){
            return common[common.length-1]+x;
        } else {
            return common[common.length-1]*(y/x);
        }
    }
}
