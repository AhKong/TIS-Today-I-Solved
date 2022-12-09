import java.util.Arrays;

/*
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
*/
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] temp = String.valueOf(n).split("");
        for(String s : temp){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
    // stream 활용하는 부분은 계속 연습이 필요해보임.
    public int solution2(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
