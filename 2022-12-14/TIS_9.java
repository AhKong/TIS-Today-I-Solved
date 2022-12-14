/*
이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
*/
import java.util.Arrays;
public class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
