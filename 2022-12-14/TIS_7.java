/*
* 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
* 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
*
* 1	13	1	6
*/

import java.util.Arrays;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int p = i ;  p <= j ; p++ ){
            answer += Arrays.stream(String.valueOf(p).split("")).filter(s->s.equals(String.valueOf(k))).count();
        }
        return answer;
    }
