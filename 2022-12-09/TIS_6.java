import java.util.ArrayList;
import java.util.Arrays;

/*
정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
 numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int j : numlist) {
            if (j % n == 0) {
                answerList.add(j);
            }
        }
        return  answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(value -> value%n ==0).toArray();
    }
}
