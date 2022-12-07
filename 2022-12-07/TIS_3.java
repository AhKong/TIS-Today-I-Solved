/*
머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
*/
public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int k : array) {
            String temp = String.valueOf(k);
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
